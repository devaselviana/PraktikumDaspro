import java.util.Scanner;

public class Individu208 {
    public static void main(String[] args) {
     Scanner input8 = new Scanner(System.in);
     int mode;
     System.out.println("Masukkan jarak (dalam m) : ");
     mode = input8.nextInt();

    if (mode<=5) {
        System.out.println("Menggunakan Melee Weapon");
    } 
    else {
        System.out.println("Menggunakan Range Weapon");
    }

    }
    
}
