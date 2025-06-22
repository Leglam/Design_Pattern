import java.util.Random;

public class Simulator {

	private Random random;
	private String[] colors = {"RED", "GREEN", "BLUE"};
	private ShapeFactory shapeFactory;
	
	public Simulator() {
		random = new Random();
		shapeFactory = new ShapeFactory();
	}
	
	public void run() {
		Coordinate coordinate = new Coordinate();
		for(int i=0;i<30;++i) {
			Rectangle rectangle = (Rectangle) shapeFactory.getShape(getRandomColor());
			coordinate.setX(getRandomCoordinate());
			coordinate.setY(getRandomCoordinate());
			rectangle.draw(coordinate);
		}	
	}

	private String getRandomColor() {
		return colors[random.nextInt(colors.length)];
	}
	
	private int getRandomCoordinate() {
		return random.nextInt(50);
	}
}
