import java.util.Scanner;

public class Segitigaa08 {
    public static void main(String[] args) {
    Scanner input08 = new Scanner (System.in);
        int sudut1,sudut2,sudut3;
        double totalsudut;

    System.out.println("Masukkan sudut1: ");
    sudut1 = input08.nextInt();
    System.out.println("Masukkan sudut2: ");
    sudut2 = input08.nextInt();
    System.out.println("Masukkan sudut3: ");
    sudut3 = input08.nextInt();

    totalsudut = sudut1 + sudut2 + sudut3;

    if (totalsudut == 180) {
        if ((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90))
            System.out.println("Segitiga tersebut adalah segitiga siku-siku");
    } else if ((sudut1 == sudut2 && sudut1 == sudut3 && sudut2 == sudut3)) {
            System.out.println("Segitiga tersebut adalah segitiga sama sisi");
    } else if (sudut1 == sudut2 || sudut1 ==sudut3 || sudut2 == sudut3) {
            System.out.println("Segitiga tersebut adalah segitiga sama kaki");
    } else {
        System.out.println("Bukan segitiga");
    }
    
    }

}
