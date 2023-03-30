package studio7;

public class Rectangle {

	private double height;
	private double width; 

	public Rectangle (double h, double w) {
		height = h;
		width = w;
	}

	public double area () {
		return height * width;
	}

	public double perimeter () {
		return (2 * height) + (2 * width);
	} 

	public boolean isSquare () {
		if (height == width) 
			{
			return true;
			}
		else
			{
			return false;
			}
	}

	public boolean isLarger (Rectangle r1) {
		if (this.area() < r1.area())
			{
			return false;
			}
		else
			{
			return true;
			}
	}

	public static void main(String[] args) {
		Rectangle r = new Rectangle(4,2);
		System.out.print(r.area());
	}
}
