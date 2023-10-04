import java.util.Scanner;

public class Individu308 {
   public static void main(String[] args) {
    Scanner input8 = new Scanner(System.in);
    String usernameBenar = "DevaSelviana";
    String passwordBenar = "281204";

    System.out.println("Masukkan username : ");
    usernameBenar=input8.nextLine();
    System.out.println("Masukkan password : ");
    passwordBenar=input8.nextLine();

    if (usernameBenar.equals(usernameBenar) && passwordBenar.equals(passwordBenar)) {
        System.out.println("Dapat masuk ke system");
   } else {
    System.out.println("username dan password salah");
   } 

   }
   } 

