
package shape;


public class Rectangle extends Shape {
    private double width;
    private double length;
    public Rectangle(){
        
    }
    public Rectangle(double width , double length){
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width , double length , String color){
        super(color);
        this.width = width;
        this.length = length;
    }
    public double getWidth(){
        return width;
    }
    public double getLength(){
        return length;
    }
    public void setLength(double length){
        this.length = length;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public double getArea(){
        double area = width*length;
        return area;
    }
    public String toString(){
        return "Color is "+getColor()+" Width is "+getWidth()+" Length is "+getLength()+" Area is "+getArea()+" in "+getClass().getSimpleName();
    }
    public boolean equals(Object otherObject){
        Rectangle other = (Rectangle) otherObject;
        if(getColor().equals(other.getColor()))
            return true;
        else
            return false;
    }
}   
