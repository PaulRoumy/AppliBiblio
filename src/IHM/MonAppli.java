package IHM;
import Objet.Livre;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MonAppli extends JFrame {
    int ligne;
    public MonAppli(){
        super("La Bibliothèque");
        setSize(850,750);
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
            //A propos
        JMenuItem apropos =new JMenuItem();
        apropos.setText("A propos");

        apropos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame jFrame = new JFrame("Test");
                JOptionPane.showMessageDialog(null," MESSAGE ! \n VERSION : 0.1 " +
                        "\n Réalisé par Paul, Alexandre, Emeric et Tristan","INFORMATION", JOptionPane.INFORMATION_MESSAGE);

            }
        });
        menuBar.add(apropos);



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
                    JOptionPane.showMessageDialog(null,"MESSAGE ! '" + jfc.getSelectedFile().getPath() + "' .","INFORMATION", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        fileMenu.add(openFile);

            // file-quit
        JMenuItem close = new JMenuItem();
        close.setText("Close");
        close.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        fileMenu.add(close);

            //edit-erase
        JMenuItem raz = new JMenuItem();
        raz.setText("RAZ");
        edit.add(raz);



        //Layout
        GridBagLayout layout= new GridBagLayout();
        jPanel.setLayout(layout);


        //Interne a la fenetre
            //Auteur texte
        JLabel auteurLabel= new JLabel();
        auteurLabel.setText("Auteur :");
        gbc.gridx=7;
        gbc.gridy=0;
        jPanel.add(auteurLabel,gbc);

            //Zone texte auteur
        JTextField auteurText =new JTextField();
        auteurText.setPreferredSize(new Dimension(90,25));
        gbc.gridx = 8;
        gbc.gridy=0;
        jPanel.add(auteurText,gbc);

            // Titre Texte
        JLabel titreLabel = new JLabel();
        titreLabel.setText("Titre :");
        gbc.gridx=7;
        gbc.gridy=1;
        jPanel.add(titreLabel,gbc);

            //Titre zone texte
        JTextField titre = new JTextField();
        titre.setPreferredSize(new Dimension(90,25));
        gbc.gridx=8;
        gbc.gridy=1;
        jPanel.add(titre,gbc);

            //Parution Texte
        JLabel parutionLabel= new JLabel();
        parutionLabel.setText("Parution :");
        gbc.gridx=7;
        gbc.gridy=2;
        jPanel.add(parutionLabel, gbc);

            //Parution Zone de texte
        JTextField parution = new JTextField();
        parution.setPreferredSize(new Dimension(90,25));
        gbc.gridx=8;
        gbc.gridy=2;
        jPanel.add(parution,gbc);

            //Colone texte
        JLabel colonelabel =new JLabel();
        colonelabel.setText("Colone :");
        gbc.gridx =7;
        gbc.gridy =3;
        jPanel.add(colonelabel, gbc);

            // Colone zone Texte
        JTextField colone = new JTextField();
        colone.setPreferredSize(new Dimension(90,25));
        gbc.gridx = 8;
        gbc.gridy = 3;
        jPanel.add(colone,gbc);

            //Rangée
        JLabel rangéeLabel = new JLabel();
        rangéeLabel.setText("Rangée :");
        gbc.gridx=7;
        gbc.gridy=4;
        jPanel.add(rangéeLabel, gbc);

            //Rangée Zone Texte
        JTextField rangée = new JTextField();
        rangée.setPreferredSize(new Dimension(90,25));
        gbc.gridx = 8;
        gbc.gridy = 4;
        jPanel.add(rangée, gbc);

            //Résumé
        JLabel resumeLabel =new JLabel();
        resumeLabel.setText("Résumé :");
        gbc.gridx = 7;
        gbc.gridy = 5;
        jPanel.add(resumeLabel,gbc);

            //Résumé Zone Texte
        JTextArea résumé = new JTextArea();
        résumé.setPreferredSize(new Dimension(90,100));
        gbc.gridx=8;
        gbc.gridy=5;
        jPanel.add(résumé,gbc);



        //Tableau
        UIDefaults defaults =UIManager.getLookAndFeelDefaults();
        if (defaults.get("Table.alternateRowColor") == null)
            defaults.put("Table.alternateRowColor", new Color(210, 210, 210));
        String[][] d = {
                { "Harry Potter", "J.K Rowling","2000",  "5","4", "" },
                { "Eragon", "C.Paolini","2011", "2","3" , "Un monde de dragon"},
                { "", "", "", "" ,"",""},
                { "", "", "", "","" ,""},
                { "", "", "", "","" ,""},
        };
        String [] col={"Nom", "Auteur","Parution", "Colonne","Rangée", "Résumé"};

        JTable table=new JTable(d, col);
        table.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int select = table.getSelectedRow();

                Livre livre = new Livre(
                        d[select][0],
                        d[select][1],
                        d[select][2],
                        d[select][3],
                        d[select][4],
                        d[select][5]

                );
                auteurText.setText(Livre.getAuteur());
                titre.setText(Livre.getTitre());
                parution.setText(Livre.getParution());
                colone.setText(Livre.getColone());
                rangée.setText(Livre.getRangée());
                résumé.setText(Livre.getRésumé());
                ligne=select;




                                   }

                                   @Override
                                   public void mousePressed(MouseEvent e) {

                                   }

                                   @Override
                                   public void mouseReleased(MouseEvent e) {

                                   }

                                   @Override
                                   public void mouseEntered(MouseEvent e) {

                                   }

                                   @Override
                                   public void mouseExited(MouseEvent e) {

                                   }
                               });


        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth=6;
        gbc.gridheight=1;
        jPanel.add(table.getTableHeader(), gbc);
        gbc.gridy = 1;
        gbc.gridwidth = 6;
        gbc.gridheight = 1;
        jPanel.add(table, gbc);

        JButton ajout = new JButton();
        ajout.setText("New");
        ajout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean espacelibre=false;

                for(int i =0; i<5; i++){
                    if (d[i][0]==""){
                        espacelibre=true;
                        ligne=i;
                        break;

                    }
                }
                if (!espacelibre){

                }
            }
        });
        gbc.gridx=1;
        gbc.gridy=2;
        jPanel.add(ajout,gbc);
        //Bonton suprimé
        JButton suppr = new JButton();
        suppr.setText("Delete");
        gbc.gridx =4;
        gbc.gridy=2;
        jPanel.add(suppr, gbc);

        // event valide
        JButton valid = new JButton();
        valid.setText("Valider");
        valid.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        d[ligne][0] =titre.getText();
                                        d[ligne][1] =auteurText.getText();
                                        d[ligne][2] =parution.getText();
                                        d[ligne][3] =colone.getText();
                                        d[ligne][4] =rangée.getText();
                                        d[ligne][5] =résumé.getText();

                                        titre.setText("");
                                        auteurText.setText("");
                                        parution.setText("");
                                        colone.setText("");
                                        rangée.setText("");
                                        résumé.setText("");








                                    }
                                });

                gbc.gridx = 8;
        gbc.gridy=6;
        jPanel.add(valid,gbc);




    }
}
