package com.adresse.vue;

import javax.swing.*;
import com.adresse.vue.*;

import java.awt.*;

import static jdk.javadoc.internal.doclets.toolkit.util.DocPath.parent;

public class MainFrame {
    private JFrame MainFrame;
    private JPanel container;
    private JLabel jlName;
    private JLabel jlFirstname;
    private JButton btModif;
    private JButton btCancel;
    private JPanel jpcardUser;

    private static void Framy() {
        super();
        setTitle("Ajouter un compte utilisateur");
        setContentPane(jpMain);
        setMaximumSize(new Dimension(800, 600));
        setMinimumSize(new Dimension(800, 600));
        setVisible(true);
    }

    private static void setTitle(String ajouterUnCompteUtilisateur) {
    }
}
