import java.util.Scanner;

public class Clients {

    private String name;
    private String telephone;

    public String getName (){
        return this.name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getTelephone (){
        return this.telephone;
    }

    public void setTelephone (String telephone) {
        this.telephone = name;
    }

    void customerRegistration() {
        Scanner getInfo = new Scanner(System.in);
        System.out.println("Please insert the client Name: ");
        String nameClient = getInfo.nextLine();

        setName(nameClient);
        System.out.println("Name saved " + getName() );

        System.out.println("Please insert the Telephone: ");
        String telClient = getInfo.nextLine();

        System.out.println("Telephone saved " + telClient );
    }



}
