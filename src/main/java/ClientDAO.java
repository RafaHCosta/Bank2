//DAO = DATA ACCESS OBJET
import javax.naming.Name;
import java.sql.*;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ClientDAO {
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
    public void delete () {

        try {
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5433/Bank", "postgres", "postgres");

            PreparedStatement ps = connection.prepareStatement("DELETE FROM public.\"Clients\"");
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void research () {

        try {
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5433/Bank", "postgres", "postgres");

            PreparedStatement ps = connection.prepareStatement("SELECT * FROM public.\"Clients\"");
            ps.executeQuery();
            ResultSet result = ps.getResultSet();

            while (result.next()) {
                //Name,Telephone,RG,CPF,Birth,Gender,Address
                String Name = result.getString(1);
                String Telephone = result.getString(2);
                String RG = result.getString(3);
                String CPF = result.getString(4);
                LocalDate Birth = result.getDate(5).toLocalDate();
                String Gender = result.getString(6);
                String Address = result.getString(7);

                List<String> listaCliente = new ArrayList<>();
                listaCliente.add(Name);
                listaCliente.add(Telephone);
                listaCliente.add(RG);
                listaCliente.add(CPF);
                listaCliente.add(String.valueOf(Birth));
                listaCliente.add(Gender);
                listaCliente.add(Address);
                System.out.println(listaCliente);

            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
