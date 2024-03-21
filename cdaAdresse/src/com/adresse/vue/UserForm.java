package com.adresse.vue;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

    public UserForm(JDialog parent) {
        super(parent);
        setTitle("Ajouter un utilsateur");
        setContentPane(jpMain);
        setMaximumSize(new Dimension(800, 600));
        setMinimumSize(new Dimension(800, 600));
        setVisible(true);
        btValid.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = tfName.getText();
                String password = String.valueOf(pfPassword.getPassword());
                System.out.println(name);
            }
        });
        btCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("On a cliqué sur le bouton Annuler");

            }
        });
    }
    
}