import java.util.Scanner;

public class Kabisat08 {
 public static void main(String[] args) {
    Scanner input08 = new Scanner (System.in);
    int tahun;

    System.out.print("Masukkan Tahun Kabisat: ");
    tahun=input08.nextInt();

     if ((tahun %4 == 0) && (tahun %100 !=0) || (tahun %400) == 0) {
        System.out.println("Its Leap Year");
     } else {
        System.out.println("Its Not Leap Year");
     }
 }   
}
