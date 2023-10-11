import java.util.Scanner;

public class Kabisat08 {
 public static void main(String[] args) {
    Scanner input08 = new Scanner (System.in);
    int tahun;

    System.out.print("Masukkan Tahun Kabisat: ");
    tahun=input08.nextInt();

     if ((tahun %4 == 0) && (tahun %100 !=0) || (tahun %4 == 0) && (tahun %100 !=0)) {
        System.out.println("Tahun Kabisat");
     } else {
        System.out.println("Bukan Tahun Kabisat");
     }
 }   
}
