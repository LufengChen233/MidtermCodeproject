package pkgShape;
import static org.junit.Assert.*;
import pkgShape.Cuboid.SortByArea;
import static org.junit.jupiter.api.Assertions.assertFalse;
import java.util.ArrayList;
import java.util.Collections;
import org.junit.Test;
import pkgShape.Cuboid.SortByVolume;

public class CuboidTest {
	private Cuboid cuboid;
	private Cuboid Cuboid;
	@Test
	public void Cuboid_test1(){
		Cuboid = new Cuboid(2,2,2);
		assertFalse(8 != Cuboid.volume());
	}
	@Test
	public void Cuboid_test2(){
		Cuboid = new Cuboid(3,3,3);
		assertTrue(27 == Cuboid.volume());
	}
	@Test
	public void getDepth_test1(){
		Cuboid = new Cuboid(4,4,4);
		assertTrue(4 == Cuboid.getDepth());
	}
	@Test
	public void getDepth_test2(){
		Cuboid = new Cuboid(4,4,4);
		assertFalse(4 != Cuboid.getDepth());
	}
	@Test
	public void setDepth_test1(){
		int Depth = 10;
		Cuboid = new Cuboid(5,5,5);
		int depth = Cuboid.getDepth();
		assertTrue(Depth != depth);
	}
	@Test
	public void setDepth_test2(){
		int Depth = 11;
		Cuboid = new Cuboid(6,6,6);
		int depth = Cuboid.getDepth();
		assertFalse(Depth == depth);
	}
	@Test
	public void area_test1(){
		Cuboid = new Cuboid(2,2,2);
		double Area = Cuboid.area();
		assertFalse(24.00 != Cuboid.area());
	}
	@Test
	public void area_test2(){
		Cuboid = new Cuboid(2,2,2);
		double Area = Cuboid.area();
		assertTrue(24.00 == Cuboid.area());
	}
	@Test
	public void volume_test1(){
		Cuboid = new Cuboid(2,2,2);
		double Volume = Cuboid.volume();
		assertTrue(8.00 == Cuboid.volume());
	}
	@Test
	public void volume_test2(){
		Cuboid = new Cuboid(2,2,2);
		double Volume = Cuboid.volume();
		assertFalse(9.00 == Cuboid.volume());
	}
	@Test
	public void setDepth_Test1() {
		Cuboid = new Cuboid(2,2,2);
		Cuboid.setDepth(1);
		int a = Cuboid.getDepth();
		assertTrue(a == 1);
	}
	@Test
	public void compareTo_Test1() {
		Cuboid= new Cuboid(1,4,2);
		cuboid= new Cuboid(1,2,3);
		assertTrue(Cuboid.compareTo(cuboid)==1);
	}
	@Test
	public void compareTo_Test2() {
		Cuboid= new Cuboid(1,1,2);
		cuboid= new Cuboid(1,1,1);
		assertTrue(cuboid.compareTo(Cuboid)!=1);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void Cuboid_Exception_test() {
		Cuboid = new Cuboid(1,1,-1);
	}
	@Test(expected = UnsupportedOperationException.class)
	public void perimeter_Exception_test() {
		Cuboid = new Cuboid(1,1,1);
		Cuboid.perimeter();
		}
	@Test(expected = IllegalArgumentException.class)
	public void setDepth_Exception_test() {
		Cuboid = new Cuboid(2,2,2);
		Cuboid.setDepth(-8);
		}
	@Test
	public void SortByVolume_test1() {
		Cuboid = new Cuboid(2,5,6);
		cuboid = new Cuboid(2,9,9);
		SortByVolume Volume = cuboid.new SortByVolume();
		assertTrue(Volume.compare(Cuboid, cuboid)==-1);
	}
	@Test
	public void SortByVolume_test2() {
		Cuboid = new Cuboid(1,1,1);
		cuboid = new Cuboid(3,3,3);
		SortByVolume Volume = cuboid.new SortByVolume();
		assertFalse(Volume.compare(cuboid, Cuboid)!=1);
	}
	@Test
	public void SortByVolume_test3() {
		Cuboid = new Cuboid(1,1,1);
		cuboid = new Cuboid(1,1,1);
		SortByVolume Volume = cuboid.new SortByVolume();
		assertTrue(Volume.compare(Cuboid, cuboid)==0);
	}
	@Test
	public void SortByArea() {
		Cuboid = new Cuboid(2,2,2);
		cuboid = new Cuboid(2,2,2);
		SortByArea area = cuboid.new SortByArea();
		assertTrue(area.compare(Cuboid, cuboid)==0);
	}
	@Test
	public void SortByArea1() {
		Cuboid = new Cuboid(1,4,2);
		cuboid = new Cuboid(1,1,1);
		SortByArea area = cuboid.new SortByArea();
		assertTrue(area.compare(Cuboid, cuboid)==1);
	}
	@Test
	public void SortByArea2() {
		Cuboid = new Cuboid(1,1,1);
		cuboid = new Cuboid(2,3,2);
		SortByArea Volume = cuboid.new SortByArea();
		assertTrue(Volume.compare(Cuboid, cuboid)==-1);
	}



    @Test
    public void SortByArea_test(){
        ArrayList<Cuboid> Cuboids=new ArrayList<Cuboid>();
        Cuboid c0=new Cuboid(4,5,6);
        Cuboid c1=new Cuboid(1,3,3);
        Cuboid c2=new Cuboid(7,7,7);
        Cuboids.add(c0);
        Cuboids.add(c1);
        Cuboids.add(c2);
        Collections.sort(Cuboids,new Cuboid(1,1,1).new SortByArea());
        assertEquals(Cuboids.get(1).area(),c0.area(),0);
        assertEquals(Cuboids.get(0).area(),c1.area(),0);
        assertEquals(Cuboids.get(2).area(),c2.area(),0);
    }
    public void SortByVolume_test(){
        ArrayList<Cuboid> Cuboids=new ArrayList<Cuboid>();
        Cuboid c0=new Cuboid(4,5,6);
        Cuboid c1=new Cuboid(1,3,3);
        Cuboid c2=new Cuboid(7,7,7);
        Cuboids.add(c0);
        Cuboids.add(c1);
        Cuboids.add(c2);
        Collections.sort(Cuboids,new Cuboid(1,1,1).new SortByVolume());
        assertEquals(Cuboids.get(1).area(),c0.area(),0);
        assertEquals(Cuboids.get(0).area(),c1.area(),0);
        assertEquals(Cuboids.get(2).area(),c2.area(),0);
    }

}
