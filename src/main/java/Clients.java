import java.util.Scanner;

public class Clients {


    private String name;
    private String telephone;

      public String getName(){
          return this.name;
      }

      public void setName(String name) {
          this.name = name;
      }

       public String getTelephone (){
          return this.telephone;
      }

      public void setTelephone(String telephone) {
          this.telephone = telephone;
      }

      void customerRegistration() {
        Scanner getInfo = new Scanner(System.in);

        System.out.println("Please insert the client Name: ");
        String nomeLocal = getInfo.nextLine();
        setName(nomeLocal);
        System.out.println("Name saved " + getName());

        System.out.println("Please insert the Telephone: ");
        String telefoneLocal = getInfo.nextLine();
        setTelephone(telefoneLocal);
        System.out.println("Telephone saved " + getTelephone());

    }



}
