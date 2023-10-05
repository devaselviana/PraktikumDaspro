import java.util.Scanner;

public class PemilihanHariDenganIf08 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        
    int dayNumber;
    String dayType;

    System.out.print("Masukan sebuah angka :");
    dayNumber = input.nextInt();

    if (dayNumber <= 5){
        dayType = "Weekend";
    }
    else if (dayNumber > 5 && dayNumber <= 7){
        dayType = "Weekend";
    }  
    else{
        dayType = "Invalid day number";
    }  
    System.out.println(dayType);
    }
}
