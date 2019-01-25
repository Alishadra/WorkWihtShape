package triangle;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import shape.org.triangle.Triangle;

class TriangleTest {

	@Test
	void testGetArea() {

	Triangle triangle = new Triangle();
	
	triangle.base = 25;
	triangle.height = 47;
	
	assertEquals((25*47/2), triangle.getArea());
	
	}

}
