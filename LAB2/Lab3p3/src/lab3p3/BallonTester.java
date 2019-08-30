
package lab3p3;

public class BallonTester {

    public static void main(String[] args) {
        Ballon obj = new Ballon(10,1,4.0/3.0*Math.PI);
        obj.addAir(100);
        System.out.printf("Volume is %.2f Cubic centimeter \n",obj.getVolume());
        System.out.printf("Surface area is %.2f Square centimeter \n",obj.getSurfaceArea());
        System.out.printf("Radius is %.2f Centimeter \n",obj.getRadius());
    }
    
}
