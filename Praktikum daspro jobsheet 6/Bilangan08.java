import java.util.Scanner;
public class Bilangan08 {
    public static void main(String[] args) {
        Scanner input08 = new Scanner (System.in);
        int bil1,bil2,bil3;

        System.out.print ("Masukkan bilangan 1 :");
        bil1 = input08.nextInt();
        System.out.print ("Masukkan Bilangan 2 :");
        bil2 = input08.nextInt();
        System.out.print ("Masukkan bilangan 3 :");
        bil3 = input08.nextInt();

        if (bil1 >= bil2) {
            if (bil1 >= bil3) {
                System.out.println("Bilangan Terbesar: " + bil1);
            } else {
                System.out.println("Bilangan Terbesar: " + bil3);
            }
        }    
        if (bil2 >= bil3) { 
            if (bil2 >= bil3) {
                System.out.println("Bilangan Terbesar: " + bil2);
            } else {
                System.out.println("Bilangan Terbesar: " + bil3);
            }
        }
    }
}
    
    

