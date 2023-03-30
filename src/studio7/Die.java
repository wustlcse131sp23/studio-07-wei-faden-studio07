package studio7;

public class Die {

	private int sides;

	public Die(int s) {
		sides = s;
	}

	public int throwDie() {
		return 1 + (int) (Math.random() * (sides));
	}


	public static void main (String args[]) {
		Die dice = new Die(2);
		System.out.println(dice.throwDie());
	}
}