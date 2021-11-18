import java.util.Vector;

import javax.swing.JList;

/**
 * Classe qui existe principalement pour �viter 
 * la r�p�tition de code dans les sous-classes concr�tes de strat�gie.
 * 
 * Elle contient le code pour retenir les tirs jou�s et retourner 
 * le dernier sur demande.
 * 
 * @author Pierre B�lisle
 * @version Copyright A2021
 *
 */


// Vous devez �crire le code manquant pour que cete classe impl�mente 
// InterfaceStrat�gie et permette de retenir les coups.

public class StrategieOrdiAbstrait  implements InterfaceStrategie{

	// Retient les coups jou�s dans une collection.
	private Vector<Coord> tabTirsJoues =  new Vector<Coord> ();

	protected Coord obtenirTirPasDejaJoue(){

		//Initialise les variables de d�part
		UtilitaireCollection utilitaireCollection = new UtilitaireCollection();
		Coord coordTir;

		//Permets d'obtenir un nouveau tir
		coordTir = utilitaireCollection.obtenirCoupPasDejaJouer(tabTirsJoues);
		return coordTir;
	}

	/**
	 * Cette m�thode permet d'ajouter un tir au d�but de la collection des tirs jou�s
	 *
	 * @param coord, coordonn�e du tir � ajouter
	 */
	protected void ajouterTir(Coord coord){
		tabTirsJoues.add(0, coord);
	}

	/**
	 * Cette m�thode permet de valider si un tir a d�j� �t� jou�
	 * � l'aide de l'utilitaire de collection
	 *
	 * @param tir, la coordonn�e du tir � v�rifier
	 * @return estJoue, boolean si le tir a d�j� �t� jou�
	 */
	protected boolean tirDejaJoue(Coord tir){

		//Permets d'initialiser les variables
		UtilitaireCollection utilitaireCollection = new UtilitaireCollection();
		boolean estJoue = false;

		//Permets de  valider le tir
		estJoue = utilitaireCollection.collectionContientCoord(this.tabTirsJoues, tir);
		return estJoue;
	}

	/**
	 * Cette m�thode permet d'aller chercher le dernier tir enregistr� dans le tableau
	 *
	 * @return dernierTir, le dernier tir enregistr�
	 */
	protected Coord getDernierTir(){

		Coord dernierTir;

		//On v�rifie s'il y a des tirs enregistr�s
		if(this.tabTirsJoues.size() > 0){
			dernierTir = this.tabTirsJoues.get(0);
		}else{
			dernierTir = null;
			System.out.println("Le tableau est vide");
		}

		return dernierTir;
	}

	/**
	 * Cette m�thode permet d'effacer tous les tirs enregistr�s dans le tableau
	 */
	public void resetTirsJoues(){
		this.tabTirsJoues.removeAll(this.tabTirsJoues);
	}

	/**
	 * Cette m�thode est ex�cut�e chaque fois que le navire est touch�
	 *
	 * @param c, la coordonn�e du tir
	 */
	@Override
	public void aviseTouche(Coord c) {
	}

	@Override
	/**
	 * Cette m�thode permet de tirer sur une case selon la strat�gie donn�e
	 *
	 * */
	public Coord getTir() {
		return null;
	}

	// Cinq m�thodes � �crire (voir �nonc�).
}
