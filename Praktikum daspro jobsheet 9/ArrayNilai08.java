import java.util.Scanner;
public class ArrayNilai08 {
    public static void main(String[] args) {
        Scanner input08 = new Scanner (System.in);
        int [] nilaiAkhir = new int [10]; 

        for (int i = 0; i < 10; i++){
            System.out.print("Masukkan nilai akhir mahasiswa ke-" + (i+1) +":");
            nilaiAkhir[i] = input08.nextInt();
        }
    
       for (int i = 0; i < 10; i++){
            if (nilaiAkhir[i] > 70) {
                System.out.println("Mahasiswa ke-" + (i+1) +" lulus");
            }         
        }
    }
}

