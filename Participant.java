/**
 *
 * La classe parent dede joueur et ordi, il implément l'interface Participant,
 * il permet aussi de gérer la flotte et d'autres functionality
 *
 * @author Guillaume Landry
 * @version A2021
 */
public class Participant implements InterfaceParticipant{

    protected Flotte flotte;


    /**
     * Constructeur de la classe participant
     */
    public void Participant(){
        this.flotte = new Flotte();
    }

    /**
     * Demande � l'ordi de se g�n�rer une nouvelle flotte.
     *
     * @return flotte, la nouvelle flotte cr��e
     */
    public void genereNouvelleFlotte() {

        //Permets de g�n�rer une nouvelle flotte en instanciant un nouvel objet
        this.flotte = this.flotte.obtenirFlotteAleatoire();
    }

    /**
     * Retourne si le tir re�u a touch� � la flotte.
     *
     * @param tir Le tir � consid�rer.
     *
     * @return true si le tir touche � un des navires de la flotte.
     */
    public boolean flotteARecuTirQuiATouche(Coord tir){
        return this.flotte.dejaRecuCoup(tir);
    }

    /**
     * Retourne une copie de la flotte de l'ordi. Une modification �
     * cette flotte n'affecte pas la sienne.
     *
     * @return ordi.super.flotte.clone();
     */
    public Flotte getFlotte(){
        return this.flotte.clone();
    }

    /**
     * Retourne si tous les navires du joueur sont coul�s.
     *
     * @return true si tous les navires sont coul�s et que le jeu est termin�.
     */
    public boolean jeuEstTermine(){
        return this.flotte.jeuEstTermine();
    }

    /**
     * Retourne le nom du dernier navire qui a �t� coul�.
     *
     * @return le nom du dernier navire qui a �t� coul�.
     */
    public String getDernierNavireCoule(){
        return this.flotte.getDernierNavireCoule();
    };

    /**
     * Retourne si le dernier tir a coul� un navire dans la flotte del'ordi.
     *
     * @return true si le dernier tir a coul� un navire.
     */
    public boolean dernierTirACoule(){
        return this.flotte.dernierTirACoule();
    }



}
