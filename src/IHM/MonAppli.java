package IHM;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MonAppli extends JFrame {
    public MonAppli(){
        super("La Bibliothèque");
        setSize(750,650);
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        //Panel
        JPanel jPanel = new JPanel();
        jPanel.setBackground(Color.gray);
        this.setContentPane(jPanel);

        //MenuBar
        JMenuBar menuBar= new JMenuBar();
        this.setJMenuBar(menuBar);

        //Menu
            //file
        JMenu fileMenu = new JMenu();
        fileMenu.setText("File");
        menuBar.add(fileMenu);
            //Help
        JMenu help =new JMenu();
        help.setText("Help");
        menuBar.add(help);


        //Sous-menu
            //file-open
        JMenuItem openFile = new JMenuItem();
        openFile.setText("Open...");
        fileMenu.add(openFile);

            //quit
        JMenuItem close = new JMenuItem();
        close.setText("Close");
        close.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        fileMenu.add(close);

        //Layout
        GridBagLayout layout= new GridBagLayout();
        jPanel.setLayout(layout);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy=0;

        //Interne a la fenetre
            //Auteur texte
        JLabel auteurLabel= new JLabel();
        auteurLabel.setText("Auteur");
        gbc.gridx=7;
        gbc.gridy=0;





    }
}
