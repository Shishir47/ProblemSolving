
public class Square extends AbstractShape{
	private double length;
	
	public Square(double length) { 
		this.length = length; 
	}
	
	public double area() { 
		return length * length; 
	}

}
