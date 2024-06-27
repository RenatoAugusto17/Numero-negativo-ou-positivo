 import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner SC = new
    Scanner (System.in);
 System.out.println("Digita um número inteiro:");
    int inteiro = SC.nextInt();
    System.out.println("O número digitado é:");
      System.out.println(inteiro);
    if ( inteiro > 0){System.out.println("O número digitado é positivo");}
                      
    if ( inteiro < 0){System.out.println("O numero digitado é negativo");}
    
  }
}