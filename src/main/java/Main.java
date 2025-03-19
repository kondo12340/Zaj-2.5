
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.println("Podaje temperature w stopniach Celsjusza");
    Scanner scan = new Scanner(System.in);
    double celsjusz = scan.nextDouble();
    double fahrenheit = (celsjusz * 9 / 5) + 32;
    System.out.println("Temperatura w stopniach Fahrenheita: " + fahrenheit);
    scan.close();
  }
} 
