import java.util.Scanner;
public class InvestasiRekursif {
    public static void main(String[] args) {
            // Contoh: Menghitung hasil investasi emas setelah 10 tahun
        int tahun = 10;
        double investasiAwal = 10000; // Ubah sesuai dengan jumlah investasi awal
    
        double hasilInvestasi = hitungInvestasiEmas(investasiAwal, tahun, 0.117);
            
        System.out.println("Hasil investasi setelah " + tahun + " tahun: " + hasilInvestasi);
    }
    
        // Fungsi rekursif untuk menghitung hasil investasi emas setiap tahun
    public static double hitungInvestasiEmas(double investasiAwal, int tahun, double tingkatKeuntungan) {
            // Basis case: jika sudah mencapai tahun 0 atau kurang, maka hasil investasi adalah investasi awal
        if (tahun <= 0) {
            return investasiAwal;
        } else {
                // Menghitung investasi setiap tahun dengan tingkat keuntungan
            double keuntunganTahunan = investasiAwal * tingkatKeuntungan;
            double totalInvestasiTahunIni = investasiAwal + keuntunganTahunan;
    
                // Rekursif untuk tahun selanjutnya
            return hitungInvestasiEmas(totalInvestasiTahunIni, tahun - 1, tingkatKeuntungan);
        }
        }
    }
    

