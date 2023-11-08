import java.util.Scanner;
public class BioskopWithScanner08 {
    public static void main(String[] args) {
        Scanner input08 = new Scanner (System.in);
        int baris;
        int kolom;
        String nama;
        String next;

        String[][] penonton = new String[4][2];

        while (true){
            System.out.print("Masukkan nama: ");
            nama = input08.nextLine();
            System.out.print("Masukkan baris: ");
            baris = input08.nextInt();
            System.out.print("Masukkan kolom: ");
            kolom = input08.nextInt();
            input08.nextLine();

            penonton[baris-1][kolom-1] = nama;

            System.out.print("Input penonton lainnya? (y/n): ");
            next = input08.nextLine();

            if (next.equalsIgnoreCase("n")){
                break;
            }
        }
    }
}
