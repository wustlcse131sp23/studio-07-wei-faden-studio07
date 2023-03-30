package studio7;

public class Fraction {
	
	private int numerator;
	private int denominator;
	
	public Fraction (int p, int q) {
	numerator = p;
	denominator = q;
	}

	
	
	public Fraction addition (Fraction f) {
		int newDenominator = this.denominator * f.denominator; 
		int newNumerator = (this.numerator * f.denominator) + (f.numerator * this.denominator);
		Fraction answer = new Fraction(newNumerator, newDenominator);
		return answer;
	}
	
	public Fraction multiplication (Fraction f) {
		int newDenominator = this.denominator * f.denominator;
		int newNumerator = this.numerator * f.numerator;
		Fraction answer = new Fraction (newNumerator, newDenominator);
		return answer;
	}
	
	public Fraction reciprocal () {
		Fraction answer = new Fraction (denominator, numerator);
		return answer;
	}
	
	public Fraction simplify () {	
		for (int i = 2; i < Math.max(numerator, denominator); i++) 
		{
		if (numerator % i == 0 && denominator % i == 0)
			{
			Fraction answer = new Fraction (numerator/i, denominator/i);
			return answer.simplify();
			}
		}
		Fraction answer2 = new Fraction (numerator, denominator);
		return answer2;
	}
	
	public String returnFraction () {
		return (numerator + "/" + denominator);
	}
	
	public static void main (String [] args) {
		Fraction f = new Fraction (4, 5);
		System.out.print(f.addition(new Fraction(2,3)).returnFraction());
	}
}
