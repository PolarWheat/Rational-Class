public class FractionMath{
    private Fraction one;
    private Fraction two;
  public FractionMath(Fraction one, Fraction two){
    this.one = one;
    this.two = two;
  }
  public String mulFraction(){
      return simplify(one.getNumerator() * two.getNumerator(), one.getDenominator() * two.getDenominator());
  }
  public String addFraction(){
    return simplify(one.getNumerator() * two.getDenominator() + two.getNumerator() * one.getDenominator(), one.getDenominator() * two.getDenominator());
  }
  public String subFraction(){
    return simplify(one.getNumerator() * two.getDenominator() - two.getNumerator() * one.getDenominator(), one.getDenominator() * two.getDenominator());
  }
  public String divFraction(){
    return simplify(two.getNumerator() * one.getDenominator(), one.getNumerator() * two.getDenominator());
  }
  public String simplify(int numerator, int denominator){
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
    return numerator + "/" + denominator;
  }
}