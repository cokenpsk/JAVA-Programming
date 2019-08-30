
package shape;

public class shapeTester {


    public static void main(String[] args) {
        Shape []arrs = new Shape[3];
        
        Shape shp = new Shape("Red");
        arrs[0] = shp;
        
        Rectangle rct = new Rectangle(5, 10,"Rainbow");
        arrs[1] = rct;
        
        Square sqe = new Square(5,"Blue");
        arrs[2] = sqe;
        
        for(int i=0; i<arrs.length;i++){
            System.out.println(arrs[i]);
        }
        if(sqe.equals(rct))
            System.out.println("sqe and rct are equals");
        else
            System.out.println("sqe and rct aren't unequals");
        Shape coke = arrs[1];
        Rectangle rct2 = new Rectangle(10,10,"Rainbow");
        if(rct2.equals(rct))
            System.out.println("rct2 and rct are equals");
        else
            System.out.println("rct2 and rct aren't unequals");
        
    }
    
}
