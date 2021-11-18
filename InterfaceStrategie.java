/**
 * Permet de bien utiliser le polymorphisme pour
 * l'impl�mentation de la strat�gie de l'ordinateur
 * dans un jeu de bataille navale lorsque vient le temps de 
 * tirer dans le cadre du tp3 Inf111 A2021.
 * 
 * @author Pierre B�lisle
 * @version Copyright A2021
 *
 */
public interface InterfaceStrategie {
	
	// Trois en-t�tes de m�thodes � �crire 
	// (getTir, aviserTouche et resetTirsJoues)
    /**
     * Cette m�thode permet de tout effacer les tirs sauvegard�s dans le tableau
     *
     * @param c, la coordonn�e du tir
     */
    public void resetTirsJoues();

    /**
     * Cette m�thode est ex�cut�e chaque fois que le navire est touch�
     *
     * @param c, la coordonn�e du tir
     */
    public void aviseTouche(Coord c);

    /**
     * Cette m�thode permet de tirer sur une case selon la strat�gie donn�e
     *
     * */
    public Coord getTir();
}
