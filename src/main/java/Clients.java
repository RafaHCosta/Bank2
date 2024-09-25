import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Clients {


    private String name;
    private String telephone;
    private String rg;
    private String cpf;
    private LocalDate birth;
    private String gender;
    private String address;


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

      public String getRg (){
          return this.rg;
      }

      public void setRg (String rg) {
          this.rg = rg;
      }

      public String getCpf (){
        return this.cpf;
      }

      public void setCpf (String cpf) {
        this.cpf = cpf;
      }

      public LocalDate getBirth (){
        return this.birth;
      }

      public void setBirth (LocalDate birth) {
        this.birth = birth;
      }

      public String getGender (){
        return this.gender;
      }

      public void setGender (String gender) {
        this.gender = gender;
      }

      public String getAddress (){
        return this.address;
      }

      public void setAddress (String address) {
        this.address = address;
      }
}
