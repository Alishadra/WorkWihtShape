package shape.org.triangle;

import shape.org.AbstractShape;
import shape.org.Logger;

private static Logger Logger = Logger.getLogger(Triangle.class.getName());

public class Triangle extends AbstractShape {
	
	
	
	private int base;
	
	private int height;
	
	public int getArea() {
		
		int area = height * height/2;
		
		return area;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getHeight() {
		return height;
	}
	

	public void setHeight(int height) {
		this.height = height;
	}
	
 
	logger.info(String.valueOf(triangle.getArea()));
	

}
