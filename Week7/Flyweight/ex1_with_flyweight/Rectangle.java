public class Rectangle implements Shape {

	//This is intrinsic information that we can share 
	private String color;
	
	public Rectangle(String color) {
		System.out.println("Create a new Rectangle...");
		this.color = color;
	}

	@Override
	public void draw(Coordinate coordinate) {
		System.out.println("Drawing a rectangle " + color + " x=" + coordinate.getX() + " y=" + coordinate.getY());
	}
}
