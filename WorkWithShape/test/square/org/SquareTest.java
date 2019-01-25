package square.org;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import shape.org.circle.Circle;
import shape.org.square.Square;

class SquareTest {

	@Test
	public void testGetArea() {


		Square square = new Square();
		
		square.side = 10;
		
		assertEquals((10 *10), square.getArea());
	
	}

}
