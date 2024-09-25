import java.time.LocalDate;
import java.util.Scanner;

public class Ui {

    public static void main(String[] args) {
        Clients client = new Clients();
        ClientDAO clientDAO = new ClientDAO();
        Scanner getInfo = new Scanner(System.in);

            System.out.println("1 - Custumer Registration / 2 - Delete Custumer / 3 - Custumer Research");
            Scanner getScreen = new Scanner(System.in);
            int firstscreenLocal = getScreen.nextInt();

            if (firstscreenLocal == 1) {
                System.out.println("Please insert the client Name: ");
                String nameLocal = getInfo.nextLine();
                client.setName(nameLocal);
                System.out.println("Name saved " + client.getName());

                System.out.println("Please insert the Telephone: ");
                String telephoneLocal = getInfo.nextLine();
                client.setTelephone(telephoneLocal);
                System.out.println("Telephone saved " + client.getTelephone());

                System.out.println("Please insert your RG: ");
                String rgLocal = getInfo.nextLine();
                client.setRg(rgLocal);
                System.out.println("RG saved " + client.getRg());

                System.out.println("Please insert your CPF: ");
                String cpfLocal = getInfo.nextLine();
                client.setCpf(cpfLocal);
                System.out.println("CPF saved " + client.getCpf());

                System.out.println("Please insert your Birth using this format yyyy-mm-dd: ");
                LocalDate birthLocal = LocalDate.parse(getInfo.nextLine());
                client.setBirth(birthLocal);
                System.out.println("Birth saved " + client.getBirth());

                System.out.println("Please insert your Gender using M or F: ");
                String genderLocal = getInfo.nextLine();
                client.setGender(genderLocal);
                System.out.println("Gender saved " + client.getGender());

                System.out.println("Please insert your Address: ");
                String addressLocal = getInfo.nextLine();
                client.setAddress(addressLocal);
                System.out.println("Address saved " + client.getAddress());

                clientDAO.save(client);
            }
            else if (firstscreenLocal == 2)
                System.out.println("DELETE CUSTUMER");

            else if (firstscreenLocal == 3)
                System.out.println("RESEARCH CUSTUMER");
        }
    }