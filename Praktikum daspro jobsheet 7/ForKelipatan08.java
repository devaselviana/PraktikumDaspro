import java.util.Scanner;

public class ForKelipatan08 {
    public static void main(String[] args) {
        Scanner input08 = new Scanner (System.in); 
        int bilangan,total = 0,counter = 0;


        System.out.print("Masukkan bilangan (1-9): ");
        bilangan = input08.nextInt();

        for (int i = 1; i <= 50; ++i) {
            if (i % bilangan == 0) {
                total += 1;
                ++counter;
               
        System.out.printf("Pada rentang 1-50 terdapat %d bilangan kelipatan %d dengan total %d", counter, bilangan, total);
        
            }
        }
    }
}
