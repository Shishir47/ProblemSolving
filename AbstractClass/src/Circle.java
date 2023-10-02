
public class Circle extends AbstractShape{
	private double r;
	private static final double PI =3.1416;
	
	public Circle(double r) { 
		this.r = r; 
	}
	
	public double area() { 
		return PI * r * r; 
	}

}
