import java.util.Scanner;
public class ArrayRataNilai08 {
    public static void main(String[] args) {
        Scanner input08 = new Scanner (System.in);
        
        int[] nilaiMhs= new int[10];
        double total = 0;
        double rata2;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = input08.nextInt();
        }
        for (int i = 0; i < nilaiMhs.length; i++){
            total+= nilaiMhs[i];
        }
        rata2 = total/nilaiMhs.length;
        System.out.println("Rata-rata nilai = "+rata2);  
    }
}
