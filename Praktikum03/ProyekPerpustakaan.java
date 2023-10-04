import java.util.Scanner;
public class ProyekPerpustakaan {
    public static Scanner sc = new Scanner(System.in);

        Scanner sc = new Scanner(System.in);

        String judulBuku;
        Integer kodeBuku, lamaMeminjam, lamaPengembalian, denda;

        System.out.print("Masukkan Judul buku: ");
        judulBuku = sc.nextLine();
        System.out.print("Masukkan Kode Buku: ");
        kodeBuku = sc.nextInt();
        System.out.print("Masukkan Lama Meminjam:");
        lamaMeminjam = sc.nextInt();
        System.out.print("Masukkan Lama Pengembalian:");
        lamaPengembalian = sc.nextInt();

        denda = lamaMeminjam - lamaPengembalian;
        System.out.println("Denda: " + denda);



    }
}
