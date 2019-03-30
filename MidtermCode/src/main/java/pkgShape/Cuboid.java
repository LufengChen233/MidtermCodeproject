package pkgShape;
import java.util.Comparator;

public class Cuboid extends Rectangle{
    private int iDepth;
    public Cuboid(int iWidth, int iLength, int iDepth) {
        super(iWidth, iLength);
        if(iDepth<0){
            throw new IllegalArgumentException();
        }
        this.iDepth=iDepth;
    }

    public int getDepth() {
        return iDepth;
    }

    public void setDepth(int iDepth){
        if(iDepth<0){
            throw new IllegalArgumentException();
        }
        this.iDepth=iDepth;
    }

    public double volume() {
        double volume = getLength()*getWidth()*getDepth();
        return volume;
    }

    @Override
    public double area() {
        double area = 2*getLength()*getWidth()+2*getLength()*getDepth()+2*getDepth()*getWidth();
        return area;
    }
    @Override
    public double perimeter() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int compareTo(Object obj) {
        // TODO Auto-generated method stub
    	if(this.area() > ((Cuboid)obj).area()) {
        	return 1;
        }else if (this.area() < ((Cuboid)obj).area()) {
        	return -1;
        }else {
        	return 0;
        }
    }

    public class SortByArea implements Comparator<Cuboid>
    {
        SortByArea() { }
        @Override
        public int compare(Cuboid obj1, Cuboid obj2) {
            // TODO Auto-generated method stub
        	if(obj1.area() > obj2.area()) {
            	return 1;
            }else if  (obj1.area() < obj2.area()){
            	return -1;
            }else {
            	return 0;
            }
        }

    }
    public class SortByVolume implements Comparator<Cuboid>{
        SortByVolume(){ }
        @Override
        public int compare(Cuboid obj1, Cuboid obj2) {
            // TODO Auto-generated method stub
        	if(obj1.volume() > obj2.volume()) {
            	return 1;
            }else if  (obj1.volume() < obj2.volume()){
            	return -1;
            }else {
            	return 0;
            }
        }

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }
}
