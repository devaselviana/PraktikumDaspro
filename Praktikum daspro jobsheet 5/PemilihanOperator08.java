import java.util.Scanner;

public class PemilihanOperator08 {
   public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    double angka1, angka2, hasil = 0;
    char operator;

    System.out.print("Masukkan angka1: ");
    angka1 = sc.nextDouble();
    System.out.print("Masukkan angka2: ");
    angka2 = sc.nextDouble();
    System.out.print("Masukkan operator (+ - * :)");
    operator = sc.next().charAt(0);

    if (operator == '+'){
      hasil = angka1 + angka2;
      System.out.println(angka1 + " + " + angka2 + " = " + hasil);    
    }
    else if (operator == '-'){
      hasil = angka1 - angka2;
      System.out.println(angka1 + " - " + angka2 + " = " + hasil);
    }
    else if (operator == '*'){
      hasil = angka1 * angka2;
      System.out.println(angka1 + " * " + angka2 + " = " + hasil);
    }
    else if (operator == '/'){
      hasil = angka1 / angka2;
      System.out.println(angka1 + " / " + angka2 + " = " + hasil);
    }
    else{
      System.out.println("Operator tidak sesuai");
    }
    //System.out.println(String.format("%s %c %s = %s", angka1,operator, angka2, hasil));
   } 
}
