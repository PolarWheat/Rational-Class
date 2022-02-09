import java.util.Scanner;


class Main {
  public static void main(String[] args) {
    
    
    Scanner input = new Scanner(System.in);
    int numerator = input.nextInt();
    int denominator = input.nextInt();
    Fraction test = new Fraction(numerator, denominator);
    System.out.println(test);
  }
}