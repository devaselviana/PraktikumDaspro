import java.util.Scanner;

public class KabisatNested08 {
    public static void main(String[] args) {
         Scanner input08 = new Scanner (System.in);
            Integer tahun;

        System.out.print("Masukkan Tahun Kabisat: ");
        tahun=input08.nextInt();

    
        if ((tahun % 400) == 0) {
            System.out.println("Tahun Kabisat");
        } else if ((tahun % 100)== 0){
            System.out.println("Bukan Tahun Kabisat");
        } else if ((tahun % 4)== 0){
            System.out.println("Tahun Kabisat");
        } else
            System.out.println("Bukan Tahun Kabisat");
}
}
        

    



