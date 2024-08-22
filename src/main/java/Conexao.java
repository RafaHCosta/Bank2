import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Conexao {

    public static void main(String[] args){
    Connection connection = null;
        try {
            //Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5433/Bank", "postgres", "postgres");
            PreparedStatement ps = connection.prepareStatement("INSERT INTO \"Clients\" (\"Name\") VALUES (?)");
            ps.setString(1,"RAFA");
            ps.executeUpdate();

        } catch (SQLException ex) {
            System.out.println("Ocorreu um erro ao acessar o banco " + ex.getMessage());
        }

    }
}
