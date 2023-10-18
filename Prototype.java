import java.util.ArrayList;

abstract class Shape {
	private int x, y;
	private String color;

	Shape(){

	}

	Shape(Shape source) {
		this();
		this.color = source.color;
		this.x = source.x;
		this.y = source.y;
	}

	public abstract Shape cloneS();

	// public abstract int calculateArea();
}

class Rectangle extends Shape {
	private int width, height;

	Rectangle(Rectangle source) {
		super(source);
		this.height = source.height;
		this.width = source.width;
	}

	Rectangle(int width, int height) {
		super();
		this.height = height;
		this.width = width;
	}
	
	@Override
	public Rectangle cloneS() {
		return new Rectangle(this);
	}

	
}

class Circle extends Shape {

	private int radius;

	Circle(int radius){
		super();
		this.radius = radius;
	}

	Circle(Circle source) {
		super(source);
		this.radius = source.radius; 
	}


	@Override
	public Circle cloneS() {
		return new Circle(this);
	}
}

class MainPrototype {

	static ArrayList<Shape> shapes = new ArrayList<>();
	public static void main(String[] args) {
		Circle originalCircle = new Circle(12);
		shapes.add(originalCircle);
		Circle cloneCircle = originalCircle.cloneS();
		
		Rectangle originalRectangle = new Rectangle(12, 15);
		shapes.add(originalRectangle);
		Rectangle cloneRectangle = originalRectangle.cloneS();

		shapes.add(cloneCircle);
		shapes.add(cloneRectangle);
		shapes.add(cloneRectangle);

		for(Shape shape: shapes){
			System.out.println(System.identityHashCode(shape));
		}
	}
}