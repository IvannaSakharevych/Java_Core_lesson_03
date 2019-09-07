package logos;

public class Circle {
	
	private double radius;
	private double diameter;
	
	
	Circle (double r, double d) {
		this.radius = r;
		this.diameter = d;
	}
	
	
	public void Length() {
		double C = 2 * 3.14 * radius;
		System.out.println("Довжина кола = " + C);
	}
	public void Square() {
		double S = (3.14 * (diameter * diameter)) / 4;
		System.out.println("Площа круга = " + S);
	}


	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", diameter=" + diameter + "]";
	}	

}
