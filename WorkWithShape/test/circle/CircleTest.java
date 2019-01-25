package circle;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import shape.org.circle.Circle;


class CircleTest {

	@Test
	public void testGetArea() {

	Circle circle = new Circle();
	
	circle.radius = 15;
	
	assertEquals((int)(3.14 * 15 *15), circle.getArea());
	
	}

}
