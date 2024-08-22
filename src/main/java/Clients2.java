import java.util.Scanner;

public class Clients2 {

    Scanner getInfo = new Scanner(System.in);
    void customerRegistration() {

        System.out.println("Please insert the client Name: ");
        String nameClient = getInfo.nextLine();
        System.out.println("Name saved " + nameClient );

        System.out.println("Please insert the Telephone: ");
        String telClient = getInfo.nextLine();
        System.out.println("Telephone saved " + telClient );
    }
}
