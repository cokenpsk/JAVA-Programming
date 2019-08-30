
package lab4p1;


public class SinCos {

    public int factorial(int f)
    {
        int fact=1,i;
        for(i=f;i!=0;i--)
        {
            fact = fact*i;
        }
        return fact;
    }
    public double sin(int x, int k)
    {
        int n;
        double sin=0;
        for(n=0;n<=k;n++)
        {
            sin=sin+(Math.pow(-1,n)*Math.pow(x,2*n+1)) / factorial(2*n+1);
        }
        return sin;
    }
    public double cos(int x, int k)
    {
        int n;
        double cos=0;
        for(n=0;n<=k;n++)
        {
            cos = cos+(Math.pow(-1,n)*Math.pow(x,2*n)) / factorial(2*n);
        }
        return cos;
    }
}
