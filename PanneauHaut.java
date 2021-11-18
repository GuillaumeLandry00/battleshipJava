import javax.swing.*;
import java.awt.*;

public class PanneauHaut extends JPanel {

    private PanneauGrilleGui grilleGauche;
    private PanneauGrilleGui grilleDroite;
    private PanneauGrilleGui grilleCache;
    private Ordi ordi;
    private Joueur joueur;

    /**
     * Constructeur de la classe PanneauHaut
     * @param joueur, instance de la classe joueur
     * @param ordi, instance de la classe ordi
     */
    public PanneauHaut(Joueur joueur, Ordi ordi){
         this.ordi = ordi;
         this.joueur = joueur;

        //On initialise les composants
        this.initialiserComposants();
    }

    /**
     * Cette méthode permet d'initialiser tous les composants
     *  à l'affichage principal
     */
    private void initialiserComposants(){
        JLabel label = new JLabel();

        //Permets d'aller chercher la taille de l'écran
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();

        //On créer les 3 instances des grilles
        this.grilleGauche = new PanneauGrilleGui(d);
        label.setText("<html><h3>"+ joueur.getNom() +"/h3></html>");
        grilleCache.add(label);

        this.grilleDroite = new PanneauGrilleGui(d);
        label.setText("<html><h3>Ordinateur/h3></html>");
        grilleCache.add(label);

        this.grilleCache = new PanneauGrilleGui(d);
        label.setText("<html><h3>Ordinateur (Hidden)/h3></html>");
        grilleCache.add(label);

    }

}
