import java.util.Scanner;
public class ArrayBilanganBulat {
        public static void main(String[] args) {
            Scanner input08 = new Scanner (System.in);
            int[] arr = new int[8];

            arr[0] = 2;
            arr[1] = 4;
            arr[2] = 6;
            arr[3] = 8;
            arr[4] = 10;
            arr[5] = 12;
            arr[6] = 14;
            arr[7] = 16;

            int total = 0;
            for (int i = 0; i < arr.length; i++) {
                total += arr[i];
            }
            double rataRata = (double) total / arr.length;
            System.out.println("Rata-rata: " + rataRata);
        }
    }
      

