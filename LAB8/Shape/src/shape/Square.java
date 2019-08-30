
package shape;

public class Square extends Rectangle {
    public Square(){
    }
    public Square(double side){
        super(side,side);
    }
    public Square(double side , String color){
        super(side,side,color);
    }
    public double getSide(){
        return getWidth();
    }
    public void setSide(double side){
        setWidth(side);
        setLength(side);
    }
    public String toString(){
        return "Color is "+getColor()+" Side is "+getSide()+" Area is "+getArea()+" in "+getClass().getSimpleName();
    }    
    public boolean equals(Object otherObject){
        Rectangle other = (Rectangle) otherObject;
        if(getColor().equals(other.getColor()))
            return true;
        else
            return false;
    }      
}
