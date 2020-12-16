package IHM;

import javax.swing.*;
import java.awt.*;

public class MonAppli extends JFrame {
    public MonAppli(){
        super("La Bibliothèque");
        setSize(450,350);
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        //Panel
        JPanel jPanel = new JPanel();
        jPanel.setBackground(Color.gray);
        this.setContentPane(jPanel);

        //MenuBar
        JMenuBar menuBar= new JMenuBar();
        this.setJMenuBar(menuBar);

        //Menu
    }
}
