import java.util.Scanner;
public class TugasIndividu208 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Masukkan nilai n : ");
        int n = sc.nextInt();

        for (int i = 1; i<= n; i++){
            for (int j = 1; j <= n; j++){
                if (i == 1 || i == n || j == 1 || j == n){
                    System.out.print("5");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
