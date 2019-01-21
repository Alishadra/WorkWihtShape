package shape.org;

import java.util.logging.Logger;

import shape.org.circle.Circle;
import shape.org.square.Square;
import shape.org.triangle.Triangle;

public class AppRunner {

	private static Logger logger = Logger.getLogger(AppRunner.class.getName());
	
	public static void main(String[] args) {
		
		Square square = new Square();
		square.setSide(16);
		
		logger.info(String.valueOf(square.getArea()));
		
		Triangle triangle = new Triangle();
		triangle.setBase(24);
		triangle.setHeight(18);
		
		logger.info(String.valueOf(triangle.getArea()));
		
		Circle circle = new Circle();
		circle.setRadius(18);
		
		logger.info(String.valueOf(circle.getArea()));

		
	}

}
