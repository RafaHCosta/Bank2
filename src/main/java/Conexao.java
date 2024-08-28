import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Conexao {

    public static void main(String[] args){
    Connection connection = null;

        try {

            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5433/Bank", "postgres", "postgres");
            Clients clients = new Clients();
            PreparedStatement ps = connection.prepareStatement("INSERT INTO \"Clients\" (\"Name\",\"Telephone\") VALUES (?,?)");
            clients.customerRegistration();
            ps.setString(1,clients.getName());
            ps.setString(2,clients.getTelephone());
            ps.executeUpdate();

        } catch (SQLException ex) {
            System.out.println("Ocorreu um erro ao acessar o banco " + ex.getMessage());
        }

    }
}
