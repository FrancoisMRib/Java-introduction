import com.adresse.model.*;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        Utilisateur user = new Utilisateur("test", "test", "test@test.com", "1234");
        System.out.println(ManagerUtilisateur.create(user));
    }
}
