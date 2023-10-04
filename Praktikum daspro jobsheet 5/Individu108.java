import  java.util.Scanner;

public class Individu108 {
    public static void main(String[] args) {
        Scanner input8 = new Scanner(System.in);
        String Lampu = "Hijau" "Kuning" "Merah";
        String Rambu;

        System.out.println("Masukkan Rambu: ");
        Rambu=input8.nextLine();
        

            switch (Lampu) {
            case "Hijau":
                System.out.println("Lanjutkan Berkendara");
                break;
            case "Kuning":
                System.out.println("Hati-hati dalam berkendara");
                break;
            case "Merah":
                System.out.println("Berhenti berkendara");
                break;
            default:
                System.out.println("tidak sesuai");
            }

        
    }
    
}
