
public class Main {

	public static void main(String[] args) {
		Circle circle= new Circle(2.0); 
		Circle circle2= circle; 
		Square square= new Square(2.0); 
		System.out.println("Area of the Circle is: "+ circle2.area());
		System.out.println("Area of the Square is: "+ square.area());
	}

}
