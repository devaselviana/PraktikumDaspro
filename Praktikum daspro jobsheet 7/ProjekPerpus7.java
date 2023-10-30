import java.util.Scanner;

public class ProjekPerpus7 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int stock, sisaStock, lamaMeminjam, lamaPengembalian, totalPeminjaman, option1;
        String judulBuku, konfirmasi;

        System.out.print("=== SELAMAT DATANG DI PERPUSTAKAAN JTI===");
        option1 = input.nextInt();

        do {
          System.out.print ("Apakah anda ingin meminjam buku (y/t)?");
          konfirmasi = input.next();

        if (konfirmasi.equalsIgnoreCase("y")) {
            System.out.print("Masukan judul buku: ");
            judulBuku = input.nextLine();
            System.out.println("Masukan Judul Buku yang ingin di dipinjam : ");
            judulBuku = input.nextLine();
            System.out.println("Stock yang tersedia : ");
            stock = input.nextInt();
            System.out.print("Meminjam berapa buku : ");
            totalPeminjaman = input.nextInt();
            
            sisaStock = stock - totalPeminjaman;
            System.out.println("Sisa stock ada : " + sisaStock);
            System.out.println(String.format("Terimakasih sudah melakukan transaksi, Anda meminjam buku %s sebanyak %s buah", judulBuku, totalPeminjaman));

        } else if (option1 == 2) {
            judulBuku = input.nextLine();

            System.out.println("Masukan judulbuku ");
            judulBuku = input.nextLine();
            System.out.println("Masukan lamaMeminjam ");
            lamaMeminjam = input.nextInt();
            System.out.println("Masukan lamaPengembalian ");
            lamaPengembalian = input.nextInt();
           
            if (lamaPengembalian <= lamaMeminjam) {
                lamaMeminjam -= lamaPengembalian;
                System.out.println("Sisa pengembalian: " + lamaMeminjam);
            } else if (lamaPengembalian > lamaMeminjam) {
                System.out.println("Sisa pengembalian Anda tidak mencukupi anda terlambat mengembalikan!");
            } else {
                System.out.println("Terimakasih anda telah melakukan transaksi Pengembalian");
                    break;
                }
        }
    } while(lamaMeminjam>);
    }    
}
