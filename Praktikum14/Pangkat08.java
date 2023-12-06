import java.util.Scanner;
public class Pangkat08 {
  public static int pangkat(int x, int y) {
    if (y == 0) {
        return 1;
    } else {
        return x * pangkat(x, y-1);
    }
  }  
  public static int pangkatIterative(int x, int y) {
    int hasil = 1;

    for (int i = 1; i <= y; i++) {
        hasil = hasil * x;
        System.out.println(x + " pangkat " + i +" = " + hasil);
    }
    return hasil;
  }
  public static void main(String[] args) {
    int result = pangkatIterative(7, 5);
    System.out.println("Hasil akhir: " + result);
    //System.out.println(pangkat(7, 5));
    //System.out.println(pangkatIterative(7, 5));
  }
}
