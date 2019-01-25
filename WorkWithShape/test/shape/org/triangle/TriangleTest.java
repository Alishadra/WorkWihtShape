package shape.org.triangle;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import shape.org.triangle.Triangle;

class TriangleTest {

	@Test
	void testGetArea() {

		Triangle triangle = new Triangle();
		
		triangle.base = 24;
		triangle.height = 36;
		
		assertEquals((24*36/2), triangle.getArea());
	
	}

}
