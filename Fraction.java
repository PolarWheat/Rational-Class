public class Fraction{
  private int numerator;
  private int denominator;

  Fraction(int numerator, int denominator){
    this.numerator = numerator;
    this.denominator = denominator;
  }

  public void simplify(){
    for(int i = 10; i > 1; i--){
      while(true){
      if (numerator % i == 0){
        if (denominator % i == 0){
            numerator = numerator / i;
            denominator = denominator / i;
        } else {
          break;
        }
      } else {
        break;
      }
      }
    }
  }
  public String toString(){
    simplify();
    return (numerator + "/" + denominator);
  }
}