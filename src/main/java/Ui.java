import java.time.LocalDate;
import java.util.Scanner;

public class Ui {

    public static void main(String[] args) {
        Clients client = new Clients();
        ClientDAO clientDAO = new ClientDAO();
        Scanner getInfo = new Scanner(System.in);

            System.out.println("1 - Customer Registration\n2 - Delete Customer\n3 - Customer Research");
            Scanner getScreen = new Scanner(System.in);
            int firstscreenLocal = getScreen.nextInt();

            if (firstscreenLocal == 1) {
                System.out.println("WELCOME TO CUSTOMER REGISTRATION");
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
            else if (firstscreenLocal == 2) {
                System.out.println("WELCOME TO DELETE CUSTOMER");
                System.out.println("1 - Delete all files\n2 - Delete specific file");
                Scanner getScreen1 = new Scanner(System.in);
                int deletescreenLocal = getScreen1.nextInt();
                    if (deletescreenLocal == 1) {
                        clientDAO.delete();
                        System.out.println("ALL FILES WAS DELETED");
                        }
                    else if (deletescreenLocal == 2)
                        System.out.println("FILE DELETED");
            }

            else if (firstscreenLocal == 3) {
                System.out.println("WELCOME TO RESEARCH CUSTOMER");
                clientDAO.research();
            }
        }
    }