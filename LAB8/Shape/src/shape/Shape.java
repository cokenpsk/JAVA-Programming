
package shape;

public class Shape {
    private String color;
    public Shape(){
        
    }
    public Shape(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public double getArea(){
        double area=0;
        return area;
    }
    public String toString(){
        return "Color is "+getColor()+" in "+getClass().getSimpleName();
    }
    public boolean equals(Object otherObject){
        Shape other = (Shape) otherObject;
        if(getColor().equals(other.getColor()))
            return true;
        else
            return false;
    }
}   
