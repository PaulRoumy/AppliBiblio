package IHM;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
            //file
        JMenu fileMenu = new JMenu();
        fileMenu.setText("File");
        menuBar.add(fileMenu);
            //


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


    }
}
