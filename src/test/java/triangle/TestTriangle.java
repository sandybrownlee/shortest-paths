package triangle;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestTriangle {
	
	@Test
	public void testScalene() {
		assertEquals(Triangle.SCALENE, Triangle.classifyTriangle(2, 6, 7));
	}

    // enter "a > b" branch
	@Test
	public void testScalene2() {
		assertEquals(Triangle.SCALENE, Triangle.classifyTriangle(7, 6, 2));
	}

    // enter "a > c" branch
	@Test
	public void testScalene3() {
		assertEquals(Triangle.SCALENE, Triangle.classifyTriangle(4, 5, 3));
	}

    // enter "b > c" branch
	@Test
	public void testScalene4() {
		assertEquals(Triangle.SCALENE, Triangle.classifyTriangle(2, 7, 6));
	}
	
	@Test
	public void testEquilateral() {
		assertEquals(Triangle.EQUALATERAL, Triangle.classifyTriangle(2, 2, 2));
	}

    // enter "invalid" branch	
	@Test
	public void testInvalid() {
		assertEquals(Triangle.INVALID, Triangle.classifyTriangle(2, 2, 5));
	}

    // enter "isoceles" branch
	@Test
	public void testIsoceles() {
		assertEquals(Triangle.ISOCELES, Triangle.classifyTriangle(2, 2, 1));
	}	

    // also test second branch of equilateral if
	@Test
	public void testIsoceles2() {
		assertEquals(Triangle.ISOCELES, Triangle.classifyTriangle(2, 2, 3));
	}	
}
