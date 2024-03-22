package com.adresse.vue;

import com.adresse.model.ManagerUtilisateur;
import com.adresse.model.Utilisateur;
import jdk.jshell.spi.ExecutionControl;
import org.springframework.security.crypto.bcrypt.BCrypt;
import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import javax.swing.text.StyleContext;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.adresse.model.Utilisateur;
import java.util.Locale;

public class UserForm extends JDialog {
    private JLabel jlName;
    private JTextField tfName;
    private JLabel jlFirstname;
    private JLabel jlEmail;
    private JLabel jlPassword;
    private JTextField tfFirstname;
    private JTextField tfEmail;
    private JPasswordField pfPassword;
    private JButton btValid;
    private JButton btCancel;
    private JPanel jpMain;
    private JLabel jlPasswordVerif;
    private JPasswordField pfpasswordVerif;
    private JButton btClose;

    public UserForm(JDialog parent) {
        super(parent);
        setTitle("Ajouter un compte utilsateur");
        setContentPane(jpMain);
        setMaximumSize(new Dimension(800, 600));
        setMinimumSize(new Dimension(800, 600));
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //écouteur événement bt valider
        btValid.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                createUser();
                create();
            }
        });
        btCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                createUser();
            }
        });
    }

    public static final String REGEX_MAIL = "^[\\w!#$%&amp;'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&amp;'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
    public static final String REGEX_PASSWORD = "^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9]).{12,}$";



    public void createUser() {
        //récupérer le contenu des 5 champs de texte
        String name = tfName.getText();
        String firstname = tfFirstname.getText();
        String email = tfEmail.getText();
        String password = String.valueOf(pfPassword.getPassword());
        String verifPassword = String.valueOf(pfpasswordVerif.getPassword());
        //envoyer le contenu des champs en BDD
        // Utilisateur create = new Utilisateur("Patulacci", "Marcel", "mp@gmail.com", "456")
        //Utilisateur create();
        //test si les 5 champs sont bien remplis
        if (!name.isEmpty() && !firstname.isEmpty() && !email.isEmpty()) {
            //test si les passwords correspondent
            if (password.equals(verifPassword)) {
                password = BCrypt.hashpw(password, BCrypt.gensalt());
                Utilisateur user = new Utilisateur(name, firstname,email, password);
                try {
                    //test si le compte n'existe pas
                    if(ManagerUtilisateur.create(user)).getId() == 0) {
    //ajouter le compte
                        ManagerUtilisateur.create(user);
                        //afficher le message du compte ajouté
                        JOptionPane.showMessageDialog(null,
                                "le compte a bien été ajouté en BDD",
                                "Valide",
                                JOptionPane.INFORMATION_MESSAGE);
                    }
                    //test si le comtep existe
                    else {
                        JOptionPane.showMessageDialog(null,
                                "le compte a bien été ajouté en BDD",
                                "Valide",
                               JOptionPane.ERROR_MESSAGE);
                    }
                }
                catch (SQLException e) {
                    throw new ExecutionControl.RunException()
                }
//                if (email == REGEX_MAIL) {
//                    if (password == REGEX_PASSWORD) {
//                        Utilisateur user = new Utilisateur(name, firstname, email, password);
//                        JOptionPane.showMessageDialog(null,
//                                "le compte a bien été ajouté en BDD",
//                                "Valide",
//                                JOptionPane.INFORMATION_MESSAGE);
//                    } else {
//                        return "Le password n'est pas valide";
//                } else {
//                    return "Le mail n'est pas valide";
//                }

                }
            } else {
                JOptionPane.showMessageDialog(null,
                        "Les mots de passe ne correspondent pas",
                        "Erreur",
                        JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null,
                    "Veuillez remplir tous les champs du formulaire",
                    "Erreur",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public void cancelUser() {
        //vider les champs
        tfName.setText("");
        tfFirstname.setText("");
        tfEmail.setText("");
        pfPassword.setText("");
        pfpasswordVerif.setText("");
        //afficher un message pour indiquer que les champs sont vidés
        JOptionPane.showMessageDialog(null,
                "Formulaire reset",
                "Reset",
                JOptionPane.INFORMATION_MESSAGE);
        dispose();
    }
}

//        public void createUser() {
//            String name = tfName.getText();
//            String firstname = tfFirstname.getText();
//            String email = tfEmail.getText();
//            String password = String.valueOf(pfPassword.getPassword());
//            String verifpassword = String.valueOf(pfpasswordVerif.getPassword());
//            if(name != "" && firstname != "" && email !="" && password != "" && verifpassword !="") {
//                if (password.equals(verifpassword)) {
//                    password = BCrypt.hahshpw(password, BCrypt.gensalt());
//                    Utilisateur user = new Utilisateur(name, firstname, email, password);
//                    JOptionPane.showMessageDialog(null,
//                            "Veuillez remplir tous les champs du formulaire",
//                            "Essaie encore",
//                            JOptionPane.INFORMATION_MESSAGE);
//                    System.out.println("Le compte a été ajouté");
//                    System.out.println(user);
//                }
//                else {
//                    System.out.println("Les mots de passe ne correspondent pas");
//                }
//            } else {
////                    btValid.setEnabled(true);
//                System.out.println("Veuillez remplir correctement tous les champs");
//            }
//            System.out.println("On a cliqué sur le bouton valider");
//        }
//        btValid.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                createUser() ;
//                if (password == verifpassword) {
//                    System.out.println(name);
//                    System.out.println(firstname);
//                    System.out.println(email);
//                } else {
//                    System.out.println("Les mots de passe ne correspondent pas");
//                }
//
//            }
//        });
//
//        btCancel.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//
//                String name = tfName.getText();
//                String firstname = tfFirstname.getText();
//                String email = tfEmail.getText();
//                String password = String.valueOf(pfPassword.getPassword());
//                String verifpassword = String.valueOf(pfpasswordVerif.getPassword());
//                if (name.isEmpty() || firstname.isEmpty()) {
//                    System.out.println("rien à faire");
//                } else {
//                    System.out.println("on va vider les champs");
//                }
//                System.out.println("On a cliqué sur le bouton Annuler");
//
//            }
//        });
//        btClose.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                dispose();
//            }
//        });
//
//        //indiquer si la fenêtre est visible ou pas
//        setVisible(true);
//
//        public void cancelUser() {
//            tfName.getText("");
//            tfFirstname.getText("");
//            tfEmail.getText("");
//            pfPassword.getPassword("");
//            pfpasswordVerif.getPassword();
//            JOptionPane.showMessageDialog(null,
//                    "Le compte a été ajouté",
//                    "Valide",
//                    JOptionPane.INFORMATION_MESSAGE);
//        }
//    }
//
//}
