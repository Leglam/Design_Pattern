import java.util.Random;

public class Simulator {

	private Random random;
	private String[] colors = {"RED", "GREEN", "BLUE"};
		
	public Simulator() {
		random = new Random();
		
	}
	
	public void run() {
		
		for(int i=0;i<30;++i) {
			Rectangle rectangle = new Rectangle(getRandomColor());
			rectangle.setX(getRandomCoordinate());
			rectangle.setY(getRandomCoordinate());
			rectangle.draw();
		}	
	}

	private String getRandomColor() {
		return colors[random.nextInt(colors.length)];
	}
	
	private int getRandomCoordinate() {
		return random.nextInt(50);
	}
}
