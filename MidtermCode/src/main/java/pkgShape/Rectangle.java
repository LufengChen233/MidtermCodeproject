package pkgShape;

public class Rectangle extends Shape implements Comparable<Object> {
    private int iWidth;
    private int iLength;
    public  Rectangle(int iWidth, int iLength) {
        if(iWidth<0||iLength<0){
            throw new IllegalArgumentException();
        }
        this.iWidth=iWidth;
        this.iLength=iLength;
    }
    public int getWidth() {
        return iWidth;
    }
    public void setWidth(int iWidth){
        if(iWidth<0){
            throw new IllegalArgumentException();
        }
        this.iWidth=iWidth;	
    }
    public int getLength() {
        return iLength;
    }
    public void setLength(int iLength){
        if(iLength<0){
            throw new IllegalArgumentException();
        }
        this.iLength=iLength;
    }

    @Override
    public double area() {
        double area = getLength()*getWidth();
        return area;
    }

    @Override
    public double perimeter() {
        double perimeter =2*getLength()+2*getWidth();
        return perimeter;
    }
    
    @Override
    public int compareTo(Object obj) {
        if(this.area() > ((Rectangle)obj).area()) {
        	return 1;
        }else if (this.area() < ((Rectangle)obj).area()) {
        	return -1;
        }else {
        	return 0;
        }
    }

    public static void main(String[] args) {

    }

}
