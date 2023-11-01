import java.util.Scanner;
public class ArrayNamaBulan {
    public static void main(String[] args) {
        Scanner input08 = new Scanner (System.in);
        String[] namaBulan = {           
            "Januari", "Februari", "Maret", "April",
            "Mei", "Juni", "Juli", "Agustus",
            "September", "Oktober", "November", "Desember"};
        System.out.print("Masukkan angka antara 1 dan 12: ");
        
        int angka = input08.nextInt();
        input08.close();

        if (angka >= 1 && angka <= 12) {
            String bulan = namaBulan[angka - 1];
            System.out.println("Nama bulan: " + bulan);
        } else {
            System.out.println("Input tidak valid. Masukkan angka antara 1 dan 12.");
        }
    }
}
