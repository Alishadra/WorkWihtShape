package shape.org.triangle;

import shape.org.AbstractShape;


public class Triangle extends AbstractShape {
	
	
	private int base;
	
	private int height;
	
	public int getArea() {
		
		int area = base/2 * height;
		
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
	
 
	

}
