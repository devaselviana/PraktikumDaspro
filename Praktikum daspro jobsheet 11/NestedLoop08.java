import java.util.Scanner;
public class NestedLoop08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] suhu = new double[2][4];
        double[] rataRata = new double[5];

        for (int i = 0; i < suhu.length; i++) {
            System.out.println("KOTA KE-" + (i+1));
            double temp = 0;

            for (int j = 0; j < suhu[i].length; j++) {
                System.out.print("Suhu ke-" + (j + 1) + ": ");
                suhu[i][j] = sc.nextInt();
                temp += suhu [i][j];
            }
            //System.out.println();
        }
        for (int i = 0; i < suhu.length; i++) {
            System.out.print("KOTA KE-" + (i+1) + ": " );
            
            //double total = 0;
            //for (double j : suhu [i]){
            //    System.out.print(j + " ");
            //    total += j;
            //}
            //double rataRata = total / suhu[i].length;
            //System.out.println("\nRata-Rata suhu : " + rataRata);
            //System.out.println();
            //for (int j = 0; j < suhu[i].length; j++) {
                //System.out.print(suhu[i][j] + " ");
            //}
            //System.out.println();   
           
           }
             
        }
    }    


