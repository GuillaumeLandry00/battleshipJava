import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class PanneauHaut extends JPanel {

    public JPanel grilleGauche;
    public JPanel grilleDroite;
    private PanneauGrilleGui grilleCache;
    private Ordi ordi;
    private Joueur joueur;
    private final static double RATIO_ECRAN = 0.6;

    /**
     * Constructeur de la classe PanneauHaut
     * @param joueur, instance de la classe joueur
     * @param ordi, instance de la classe ordi
     */
    public PanneauHaut(Joueur joueur, Ordi ordi){
         this.ordi = ordi;
         this.joueur = joueur;
         this.grilleGauche = new JPanel();
         this.grilleDroite = new JPanel();

         //On ajoute les layout par défaut
        this.grilleGauche.setLayout(new BoxLayout(grilleGauche, BoxLayout.PAGE_AXIS));
        this.grilleDroite.setLayout(new BoxLayout(grilleDroite, BoxLayout.PAGE_AXIS));

        //On initialise les composants
        this.initialiserComposants();
    }


    /**
     * Cette méthode permet d'initialiser tous les composants
     *  à l'affichage principal
     */
    private void initialiserComposants(){

        //Permets d'aller chercher la taille de l'écran
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        d.setSize(d.width, d.height * RATIO_ECRAN);

        //On créer une instance pour la grille de gauche
        this.grilleGauche.add(new JLabel(joueur.getNom()));
        this.grilleGauche.add(new PanneauGrilleGui(d));
        grilleGauche.setBorder(new EmptyBorder(10, 10, 10, 10));

        //On créer une instance pour la grille de gauche
        this.grilleDroite.add(new JLabel("Ordinateur"));
        this.grilleDroite.add(new PanneauGrilleGui(d));
        grilleDroite.setBorder(new EmptyBorder(10, 10, 10, 10));

        this.grilleCache = new PanneauGrilleGui(d);
       // label.setText("Ordinateur (Hidden)");

       // grilleCache.add(label);

    }

    /*** Section des mutateurs et accesseurs ***/

    public Ordi getOrdi() {
        return ordi;
    }

    public Joueur getJoueur() {
        return joueur;
    }
}
