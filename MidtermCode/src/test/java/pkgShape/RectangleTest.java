package pkgShape;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.Test;

public class RectangleTest {
	private Rectangle rectangleA;
	private Rectangle rectangleB;

	@Test
	public void Rectangle_test1(){
		rectangleA = new Rectangle(1,2);
		assertTrue((1 == rectangleA.getWidth()&&(2 == rectangleA.getLength())));	
	}
	@Test
	public void Rectangle_test2(){
		rectangleA = new Rectangle(3,4);
		assertTrue((3 == rectangleA.getWidth()&&(4 == rectangleA.getLength())));
	}
	@Test
	public void getWidth_test1(){
		rectangleA = new Rectangle(1,2);
		assertTrue(1 == rectangleA.getWidth());
	}
	@Test
	public void getWidth_test2(){
		rectangleA = new Rectangle(3,4);
		assertFalse(4 == rectangleA.getWidth());	
	}
	@Test
	public void getlength_test1(){
		rectangleA = new Rectangle(5,6);
		assertFalse(1 == rectangleA.getLength());
	}
	@Test
	public void getLength_test2(){
		rectangleA = new Rectangle(5,6);
		assertTrue(6 == rectangleA.getLength());
	}
	@Test
	public void setWidth_test1(){
		rectangleA = new Rectangle(1,1);
		int iWidth = 1;
		rectangleA.setWidth(1);
		int width = rectangleA.getWidth();
		assertTrue(iWidth == width);
	}
	@Test
	public void setWidth_test2(){
		rectangleA = new Rectangle(1,1);
		int iWidth = 1;
		rectangleA.setWidth(2);
		int width = rectangleA.getWidth();
		assertFalse(iWidth == width);
	}
	
	@Test
	public void setLength_test1(){
		rectangleA = new Rectangle(2,2);
		int iLength = 2;
		rectangleA.setLength(2);
		int Length = rectangleA.getLength();
		assertTrue(iLength == Length);
	}
	@Test
	public void setLength_test2(){
		rectangleA = new Rectangle(3,3);
		int iLength = 3;
		rectangleA.setLength(4);
		int Length = rectangleA.getLength();
		assertFalse(iLength == Length);
	}
	@Test
	public void area_test1() {
		rectangleA = new Rectangle(4,4);
		assertTrue(16 == rectangleA.area());
	}
	@Test
	public void area_test2(){
		rectangleA = new Rectangle(5,5);
		assertFalse(26 == rectangleA.area());
	}
	@Test
	public void perimeter_test1(){
		rectangleA = new Rectangle(6,6);
		assertFalse(23 == rectangleA.perimeter());
	}
	@Test
	public void perimeter_test2(){
		rectangleA = new Rectangle(6,6);
		assertTrue(24 == rectangleA.perimeter());
	}
	@Test
	public void compareTo_test1() {
		rectangleA = new Rectangle(1,1);
		rectangleB = new Rectangle(1,1);
		assertTrue(0==rectangleB.compareTo(rectangleA));
	}
	@Test
	public void compareTo_test2() {
		rectangleA = new Rectangle(1,1);
		rectangleB = new Rectangle(2,2);
		assertFalse(0==rectangleB.compareTo(rectangleA));
	}
	@Test
	public void compareTo_test3() {
		rectangleA = new Rectangle(2,2);
		rectangleB = new Rectangle(1,1);
		assertFalse(0==rectangleB.compareTo(rectangleA));
	}
	@Test( expected = IllegalArgumentException.class)
	public void setWidth_Exception_test() {
		Rectangle A = new Rectangle(1,1);
		A.setWidth(-1);
	}
	@Test( expected = IllegalArgumentException.class)
	public void Rectangle_Exception_test() {
		Rectangle r = new Rectangle(1,-1);
	}
	@Test( expected = IllegalArgumentException.class)
	public void setLength_Exception_test() {
		Rectangle S = new Rectangle(1,1);
		S.setLength(-3);
	}
}
