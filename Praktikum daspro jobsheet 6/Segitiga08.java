import java.util.Scanner;

public class Segitiga08 {
    public static void main(String[] args) {
    Scanner input08 = new Scanner (System.in);
        float sudut1,sudut2,sudut3;
        int totalsudut;

    System.out.println("Masukkan sudut1: ");
    sudut1 = input08.nextFloat();
    System.out.println("Masukkan sudut2: ");
    sudut2 = input08.nextFloat();
    System.out.println("Masukkan sudut3: ");
    sudut3 = input08.nextFloat();

    totalsudut = sudut1 + sudut2 + sudut3;

    if (totalsudut == 18) {
        if ((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90));
            System.out.println("Segitiga tersebut adalah segitiga siku-siku");
    }else{
            System.out.println("Segitiga tersebut adalah bukan segitiga siku-siku");
    }
    }else{
        System.out.println("Bukan Segitiga");
    }



  }
}
