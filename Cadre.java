import javax.swing.*;
import java.security.Principal;

public class Cadre implements Runnable{

    public JFrame cadre;
    public PanneauPrincipal panneauPrincipal = new PanneauPrincipal();

    @Override
    public void run() {
            //Default frame settings
            this.cadre = new JFrame("Battleship");
            this.cadre.setContentPane(panneauPrincipal);
            this.cadre.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            this.cadre.setExtendedState(JFrame.MAXIMIZED_BOTH);
            this.cadre.setVisible(true);
    }
}
