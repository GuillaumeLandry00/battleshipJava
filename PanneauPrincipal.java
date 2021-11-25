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

    public JPanel panPrincipal;
    public Joueur joueur;
    public Ordi ordi;
    public PanneauHaut panHaut = new PanneauHaut(joueur, ordi);
    public PanneauBas panBas = new PanneauBas();



    /**
     * Constructeur de base de la classe PanneauPrincipal
     */
     public PanneauPrincipal(){
         initComponent();
     }

    /**
     * Cette méthode permet d'ajouter les components de base au panneau principal
     */
    public void initComponent(){
        panPrincipal = new JPanel(new GridLayout(2,1));

        //Permets d'ajouter le pannel primaire celui qui affiche
        setLayout(new GridLayout(1,2));
        add(panHaut.grilleGauche);
        add(panHaut.grilleDroite);

      //  panPrincipal.add(panBas);
     }


}
