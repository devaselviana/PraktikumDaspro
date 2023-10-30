import java.util.Scanner;
public class UTSMatrikulasi {
        public static void main(String[] args) {
            Scanner input08 = new Scanner(System.in);
            
            String nama, nim, kategori, kelasMatrikulasi;
            double nilaiSkolastik, nilaiMatematika, nilaiBahasa, nilaiRataRata;
            char cek;
    
            do {
                
                System.out.print("Nama: ");
                nama = input08.nextLine();
    
                System.out.print("NIM: ");
                nim = input08.nextLine();
    
                System.out.print("Kategori SLTA (SMA/SMK/MA): ");
                kategori = input08.nextLine();
    
                System.out.print("Nilai Skolastik: ");
                nilaiSkolastik = input08.nextDouble();
    
                System.out.print("Nilai Penalaran Matematika: ");
                nilaiMatematika = input08.nextDouble();
    
                System.out.print("Nilai Literasi Bahasa: ");
                nilaiBahasa = input08.nextDouble();
    
                nilaiRataRata = (nilaiSkolastik + nilaiMatematika + nilaiBahasa) / 3.0;
                
                if (nilaiRataRata >= 75) {
                    kelasMatrikulasi = "Praktikum Rangkaian Listrik";
                } else {
                    kelasMatrikulasi = ("Praktikum Rangkaian Listrik");
                    kelasMatrikulasi = ("Bahasa Inggris Dasar");
                }
                System.out.println("Nilai Rata-rata: " + nilaiRataRata);
                System.out.println("Kelas Matrikulasi: " + kelasMatrikulasi);
    
                System.out.print("Cek mahasiswa lainnya? (y/n): ");
                cek = input08.next().charAt(0);
    
            } while (cek == 'y' || cek == 'Y');
    
            System.out.println("Terima kasih telah mengecek kelas matrikulasi!");
        }
    }
      

