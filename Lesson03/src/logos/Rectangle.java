package logos;

public class Rectangle {
	
	private int length;
	private int width;
	
	
	Rectangle() {
		this.length = 3;
		this.width = 5;
	}
	Rectangle(int a, int b) {
		this.length = a;
		this.width = b;
	}
	
	
	public void Perimeter() {
		int P = 2 * (length + width);
		System.out.println("Периметр прямокутника = " + P);
	}
	public void Square() {
		int S = length * width;
		System.out.println("Площа прямокутника = " + S);
	}
	
	
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	
	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + "]";
	}
	
}
