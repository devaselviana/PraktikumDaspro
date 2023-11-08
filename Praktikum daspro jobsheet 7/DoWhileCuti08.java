import java.util.Scanner; // deklarasi scanner

public class DoWhileCuti08 { // membuat kelas nama file
public static void main(String[] args) { //branch
    Scanner input08 = new Scanner (System.in); // deklarasi type data, variabel 
    int jatahCuti,jumlahHari;
    String konfirmasi;

    System.out.print("Jatah cuti: "); 
    jatahCuti = input08.nextInt();

    do {
        System.out.print("Apakah Anda ingin mengambil cuti (y/t)? ");
        konfirmasi = input08.next();

        if (konfirmasi.equalsIgnoreCase("y")) {
            System.out.print("Jumlah hari: ");
            jumlahHari = input08.nextInt();

            if (jumlahHari <= jatahCuti) {
                jatahCuti -= jumlahHari;
                System.out.println("Sisa jatah cuti: " + jatahCuti);
            } else {
                System.out.println("Sisa jatah cuti Anda tidak mencukupi");
                continue;
            }
         }
         }
        while (jatahCuti > 0); 
        }
    }
