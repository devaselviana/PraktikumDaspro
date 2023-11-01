import java.util.Scanner;
public class LinearSearch08 {
  public static void main(String[] args) {
    Scanner input08 = new Scanner (System.in);

    int[] arrayInt = {34, 18, 26, 48, 72, 20, 56, 63};
    int key = 20;
    int hasil =0;

    System.out.print("Masukkan jumlah elemen array : ");
    int jumlahElemen = input08.nextInt();

    for (int i = 0; i < arrayInt.length; i++){
        System.out.print("Masukkan elemen  array ke-" +i+":");
        arrayInt[i] = input08.nextInt();
    }
    System.out.print ("Masukkan key yang ingin di cari : ");
    key = input08.nextInt();

    for (int i = 0; i < arrayInt.length; i++) {
        if (arrayInt[i] == key) {
            hasil = i;
            break;
        }
    }
    if (hasil == 0){
        System.out.println("Key tidak ditemukan");
    } else{
        System.out.println("Key ada dalam array pada posisi indeks ke-"+hasil);
    }  
}   
}