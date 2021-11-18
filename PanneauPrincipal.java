import javax.swing.*;
import java.awt.*;
/**
 *Classe correspondant au panneau principal du programme, il va tout contenir
 * le côté affichage de notre programme
 *
 * @author Guillaume Landry
 * @version A2021
 */

public class PanneauPrincipal extends JPanel {

     public JPanel panHaut;
     public JPanel panBas;
     public Joueur joueur;
     public Ordi ordi;

    /**
     * Constructeur de base de la classe PanneauPrincipal
     * @param joueur, instance de la classe joueur
     * @param ordi, instance de la classe ordi
     * @param panHaut, le panneau du haut permet de gérer l'affichage
     * @param panBas, contient les boutons
     */
     public PanneauPrincipal(Joueur joueur, Ordi ordi , JPanel panHaut, JPanel panBas){
         this.joueur = joueur;
         this.ordi = ordi;
         this.panBas = panBas;
         this.panHaut = panHaut;
     }


}
