/**
 * Permet de bien utiliser le polymorphisme pour
 * l'implémentation de la stratégie de l'ordinateur
 * dans un jeu de bataille navale lorsque vient le temps de 
 * tirer dans le cadre du tp3 Inf111 A2021.
 * 
 * @author Pierre Bélisle
 * @version Copyright A2021
 *
 */
public interface InterfaceStrategie {
	
	// Trois en-têtes de méthodes à écrire 
	// (getTir, aviserTouche et resetTirsJoues)
    /**
     * Cette méthode permet de tout effacer les tirs sauvegardés dans le tableau
     *
     * @param c, la coordonnée du tir
     */
    public void resetTirsJoues();

    /**
     * Cette méthode est exécutée chaque fois que le navire est touché
     *
     * @param c, la coordonnée du tir
     */
    public void aviseTouche(Coord c);

    /**
     * Cette méthode permet de tirer sur une case selon la stratégie donnée
     *
     * */
    public Coord getTir();
}
