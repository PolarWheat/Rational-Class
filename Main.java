import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter first fraction");
    Fraction fractionOne = new Fraction(input.nextInt(), input.nextInt());
    System.out.println("Enter second fraction");
    Fraction fractionTwo = new Fraction(input.nextInt(), input.nextInt());
    FractionMath fractionAwnser = new FractionMath(fractionOne, fractionTwo);

    System.out.println("Add/ " + fractionAwnser.addFraction());
    System.out.println("Sub/ " + fractionAwnser.subFraction());
    System.out.println("Mul/ " + fractionAwnser.mulFraction());
    System.out.println("Div/ " + fractionAwnser.divFraction());
  }
}