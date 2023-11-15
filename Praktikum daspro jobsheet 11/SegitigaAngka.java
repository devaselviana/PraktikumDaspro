import java.util.Scanner;
public class SegitigaAngka {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Masukkan nilai N (minimal 2): ");
        int n = scanner.nextInt();
    
        if (n < 2) {
            System.out.println("Nilai N harus minimal 2");
        } else {
            System.out.println("Segitiga angka:");
    
            for (int i = 1; i <= n; i++) {
                
                for (int j = 1; j <= n - i; j++) {
                    System.out.print("  ");
                }   
                for (int k = 1; k <= i; k++) {
                    System.out.print(k);
                }
                System.out.println(); 
                }
            }
            scanner.close();
        }
    }
    
    
       