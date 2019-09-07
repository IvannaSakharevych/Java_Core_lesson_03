package logos;

public class Application {

	public static void main(String[] args) {
//		Task 1
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle(7, 9);
		Rectangle r3 = new Rectangle();
		r3.setLength(2);
		r3.setWidth(4);
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println();
		
		r1.Perimeter();
		r1.Square();
		System.out.println();
		
		r2.Perimeter();
		r2.Square();
		System.out.println();
		
		r3.Perimeter();
		r3.Square();
		System.out.println();
		
//		Task 2
		Circle c1 = new Circle(5.1, 10.2);
		System.out.println(c1);
		c1.Length();
		c1.Square();
		
	}

}
