import java.sql.*;

public class ClientDAO {
    //DAO = DATA ACCESS OBJET
    Connection connection = null;
    public void save(Clients client) {
        try {

            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5433/Bank", "postgres", "postgres");

                PreparedStatement ps = connection.prepareStatement("INSERT INTO \"Clients\" (\"Name\",\"Telephone\",\"RG\",\"CPF\",\"Birth\",\"Gender\",\"Address\") VALUES (?,?,?,?,?,?,?)");
                ps.setString(1, client.getName());
                ps.setString(2, client.getTelephone());
                ps.setString(3, client.getRg());
                ps.setString(4, client.getCpf());
                ps.setDate(5, java.sql.Date.valueOf(client.getBirth()));
                ps.setString(6, client.getGender());
                ps.setString(7, client.getAddress());
                ps.executeUpdate();

        } catch (SQLException ex) {
            System.out.println("Ocorreu um erro ao acessar o banco " + ex.getMessage());
        }

    }
}
