package com.adresse.vue;

import com.adresse.model.Utilisateur;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class CardUser extends JFrame {

    private JLabel jlName;
    private JButton btnModif;
    private JButton btnCancel;
    private JPanel jpCardUser;
    private JLabel jlFirstname;

    public CardUser(String name) {
        super();
        setContentPane(jlName);
        setMaximumSize(new Dimension(800, 50));
        setMinimumSize(new Dimension(800, 50));
        setVisible(true);

//        ArrayList<Utilisateur>
        btnModif.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        btnCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    private void setContentPane(JLabel jpCardUser) {

    }

}
