import java.util.Scanner;
public class SegitigaAngka {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Masukkan nilai N (minimal 3): ");
        int n = scanner.nextInt();
    
        if (n < 3) {
            System.out.println("Nilai N harus minimal 3");
        } else {
            System.out.println("Segitiga angka:");
    
            // Outer loop untuk baris
            for (int i = 1; i <= n; i++) {
                // Inner loop untuk spasi
                for (int j = 1; j <= n - i; j++) {
                    System.out.print("  ");
                }
                // Inner loop untuk angka
                for (int k = 1; k <= i; k++) {
                    System.out.print(k);
                }
                System.out.println(); // Pindah ke baris berikutnya setelah mencetak satu baris
                }
            }
            scanner.close();
        }
    }
    
    
       