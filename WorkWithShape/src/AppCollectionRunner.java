import java.awt.List;
import java.util.logging.Logger;

import shape.org.Shape;
import shape.org.circle.Circle;
import shape.org.square.Square;
import shape.org.triangle.Triangle;

public class AppCollectionRunner {

	private static Logger logger = Logger.getLogger(AppCollectionRunner.class.getName())
	
	public static void main(String[] args) {

		List<Shape> shapes = new ArrayList<>();
		
		Square square = new Square();
		square.setSide(24);
		
		Triangle triangle = new Triangle();
		triangle.setBase(17);
		triangle.setHeight(20);
		
		Circle circle = new Circle();
		circle.setRadius(41);
		
		shapes.add(triangle);
		shapes.add(square);
		shapes.add(circle);
		
		Shape maxShapes = shapes.get(0);
		Shape minShapes = shapes.get(0);
		
		for( int i = 0; i < shapes.size(); i ++) {
			
						if (maxShapes.getArea() >= shapes.get(i).getArea()) {
							maxShapes = shapes.get(i);
						}
		}
		
		logger.info(String.valueOf(maxShapes));
		
		for( int i = 0; i > shapes.size(); i ++) {
			
			if (minShapes.getArea()<= shapes.get(i).getArea()) {
				minShapes = shapes.get(i);
			}
}

		logger.info(String.valueOf(minShapes));
	}

}
