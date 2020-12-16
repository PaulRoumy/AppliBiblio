package IHM;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;
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
        GridBagConstraints gbc = new GridBagConstraints();

        //MenuBar
        JMenuBar menuBar= new JMenuBar();
        this.setJMenuBar(menuBar);

        //Menu
            //file
        JMenu fileMenu = new JMenu();
        fileMenu.setText("File");
        menuBar.add(fileMenu);
            //Edit
        JMenu edit =new JMenu();
        edit.setText("Édit");
        menuBar.add(edit);
            //Help
        JMenu help =new JMenu();
        help.setText("Help");
        menuBar.add(help);



        //Sous-menu
            //file-open
        JMenuItem openFile = new JMenuItem();
        openFile.setText("Open...");
        openFile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getDefaultDirectory());
                jfc.setDialogTitle("Séléctionné un fichier");
                jfc.setAcceptAllFileFilterUsed(false);
                FileNameExtensionFilter filter = new FileNameExtensionFilter("Fichier txt","txt");
                jfc.addChoosableFileFilter(filter);

                int returnValue = jfc.showOpenDialog(null);
                if (returnValue == JFileChooser.APPROVE_OPTION){
                    System.out.println(jfc.getSelectedFile().getPath());
                }
            }
        });
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


        //Interne a la fenetre
            //Auteur texte
        JLabel auteurLabel= new JLabel();
        auteurLabel.setText("Auteur :");
        gbc.gridx=0;
        gbc.gridy=0;
        jPanel.add(auteurLabel,gbc);

            //Zone texte auteur
        JTextField auteurText =new JTextField();
        auteurText.setText("                   ");
        gbc.gridx = 1;
        gbc.gridy=0;
        jPanel.add(auteurText,gbc);

            // Titre Texte
        JLabel titreLabel = new JLabel();
        titreLabel.setText("Titre :");
        gbc.gridx=0;
        gbc.gridy=1;
        jPanel.add(titreLabel,gbc);

            //Titre zone texte
        JTextField titre = new JTextField();
        titre.setText("                   ");
        gbc.gridx=1;
        gbc.gridy=1;
        jPanel.add(titre,gbc);

            //Parution Texte
        JLabel parutionLabel= new JLabel();
        parutionLabel.setText("Parution :");
        gbc.gridx=0;
        gbc.gridy=2;
        jPanel.add(parutionLabel, gbc);

            //Parution Zone de texte
        JTextField parution = new JTextField();
        parution.setText("                   ");
        gbc.gridx=1;
        gbc.gridy=2;
        jPanel.add(parution,gbc);

            //Colone texte
        JLabel colonelabel =new JLabel();
        colonelabel.setText("Colone :");
        gbc.gridx =0;
        gbc.gridy =3;
        jPanel.add(colonelabel, gbc);

            // Colone zone Texte
        JTextField colone = new JTextField();
        colone.setText("                   ");
        gbc.gridx = 1;
        gbc.gridy = 3;
        jPanel.add(colone,gbc);

            //Rangée
        JLabel rangéeLabel = new JLabel();
        rangéeLabel.setText("Rangée :");
        gbc.gridx=0;
        gbc.gridy=4;
        jPanel.add(rangéeLabel, gbc);

            //Rangée
        JTextField rangée = new JTextField();
        rangée.setText("                   ");
        gbc.gridx = 1;
        gbc.gridy = 4;
        jPanel.add(rangée, gbc);



    }
}
