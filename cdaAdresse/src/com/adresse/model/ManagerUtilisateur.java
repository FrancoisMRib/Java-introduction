package com.adresse.model;

import java.sql.*;
import java.util.ArrayList;

public class ManagerUtilisateur {
    private static final Connection connexion = Database.getConnexion();
    public static Utilisateur create(Utilisateur user) throws SQLException {
        //créer un objet Utilisateur
        Utilisateur userAdd = new Utilisateur();
        //try la requête
        try {
            //connecter à la bdd
            Statement smt = connexion.createStatement();
            //préparation de la requête
            String req = "INSERT INTO users(name,firstname,email,password) VALUE(?,?,?,?)";
            PreparedStatement preparedStatement = connexion.prepareStatement(req);
            //binder les paramètres
            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getFirstname());
            preparedStatement.setString(3, user.getEmail());
            preparedStatement.setString(4, user.getPassword());
            //exécuter la requête
            int row = preparedStatement.executeUpdate();
            //tester si la requête à réussi
            if(row > 0) {
                userAdd.setName(user.getName());
                userAdd.setFirstname(user.getFirstname());
                userAdd.setEmail(user.getEmail());
                userAdd.setPassword(user.getPassword());
            }
            //recupérer l'enregistrement
        }
        //lever l'erreur SQL
        catch (SQLException e){
            e.printStackTrace();
        }
        //retourne un objet utilisateur complet
        return userAdd;
    }

    public static Utilisateur findByMail(Utilisateur user) throws SQLException{
        Utilisateur userRecup = new Utilisateur();
        try {
            //connexion à la bdd
            Statement smt = connexion.createStatement();
            //requête
            String req = "SELECT id, name, firstname, password FROM users WHERE email = ?";
            //préparer la requête
            PreparedStatement preparedStatement = connexion.prepareStatement(req);
            //binder le paramètre
            preparedStatement.setString(1, user.getEmail());
            //exécuter la requête
            ResultSet reponse = preparedStatement.executeQuery();

            while (reponse.next()) {
                //setter le resultat de la réponse dans userRecup
                userRecup.setId(reponse.getInt("id"));
                userRecup.setName(reponse.getString(2));
                userRecup.setFirstname(reponse.getString(3));
                userRecup.setEmail(reponse.getString(4));
                userRecup.setPassword(reponse.getString(5));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return userRecup;
    }

//    EXERCICE 31
    public static Utilisateur update(Utilisateur user) throws SQLException {
        Utilisateur editUser = new Utilisateur("test","test","test@gmail.com","12356");

        //try la requête
        try {
            //connecter à la bdd
            Statement smt = connexion.createStatement();
            //préparation de la requête
            String req = "UPDATE users SET name = ?, firstname = ? WHERE email = ?";
            PreparedStatement preparedStatement = connexion.prepareStatement(req);
            //binder les paramètres
            preparedStatement.setString(1, editUser.getName());
            preparedStatement.setString(2, editUser.getFirstname());
            preparedStatement.setString(3, editUser.getEmail());

            //exécuter la requête
            int row = preparedStatement.executeUpdate();
            //tester si la requête à réussi
            if(row > 0) {
                editUser.setName(user.getName());
                editUser.setFirstname(user.getFirstname());
                editUser.setEmail(user.getEmail());
                if(user.getId()!=0) {
                    editUser.setId(user.getId());
                }

            }
            //recupérer l'enregistrement
        }
        //lever l'erreur SQL
        catch (SQLException e){
            e.printStackTrace();
        }
        //retourne un objet utilisateur complet
        return editUser;
    }

    public static ArrayList<Utilisateur> findAll(){
        ArrayList<Utilisateur> users = new ArrayList<>();
        try{
            Statement smt = connexion.createStatement();
            String req = "SELECT id, name, firstname, email, password FROM users";
            PreparedStatement preparedStatement = connexion.prepareStatement(req);
            ResultSet response = preparedStatement.executeQuery();
            while(response.next()) {
                Utilisateur user = new Utilisateur(response.getString("name"),
                        response.getString("firstname"), response.getString("email"), response.getString("password"));
                user.setId(response.getInt("id"));
                users.add(user);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return users;
    }

    public static boolean delete(Utilisateur utilisateur) throws SQLException {
        boolean statut = false;
        try {
            Statement smt = connexion.createStatement();
            String req = "DELETE FROM users WHERE email = ?";
            PreparedStatement preparedStatement = connexion.prepareStatement(req);
            preparedStatement.setString(1, utilisateur.getEmail());
            int row = preparedStatement.executeUpdate();
            if(row > 0) {
                statut = true;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return statut;
    }
}
