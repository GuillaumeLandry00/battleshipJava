import javax.swing.*;
import java.awt.*;

public class PanneauBas extends JPanel{

    public JPanel panBas;
    public JButton btnCacherPatie;
    public JButton btnNouvellePartie;
    //0 répresente le joueur humain et 1 représente l'ordinateur
    public int tourAquiJouer;
    public boolean partieEnCours;

    public void PanneauBas(){
        this.btnCacherPatie = new JButton( "Cacher la flotte de l'ordinateur");
        this.btnNouvellePartie = new JButton("Nouvelle partie");
        this.panBas = new JPanel(new GridLayout(1,1));

        this.initComponent();
    }

    /**
     * Cette méthode permet d'initialiser les components du jpanel
     */
    public void initComponent(){
        panBas.add(btnCacherPatie);
        panBas.add(btnNouvellePartie);
        panBas.setBackground(Color.BLACK);

    }

}
