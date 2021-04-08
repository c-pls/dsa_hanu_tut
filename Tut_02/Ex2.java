package Tut_02;

import java.util.Scanner;

public class Ex2 {
	public static void print_poly(double [] a)
    {
        System.out.println("The polynomial is:");
        for (int i=a.length-1; i>0; i--)
        {
           if (i != 1) 
             System.out.print(a[i] + "*x^" + i + " + ");
           else
             System.out.print(a[i] + "*x" + " + ");
        }        
        System.out.println(a[0]);
    }
	static double power(double x, double y) {
		if ( y < 1 ) return 1;
		double temp = power(x, y/2);
		if ( y % 2 ==0) return temp * temp;
		else return x * temp * temp;
	}
    
    public static double Evaluate(double [] a, double x)
    {
        double s=0;
        for (int i=0; i<a.length; i++)
        {
          s += a[i] * power(x, i);
        }
        return s;
    }
    
    public static void main(String[]args)
    {
        int n;
        double [] c;
        double x;

        System.out.println("Please enter the degree n of the polynomial:");
        Scanner scanner = new Scanner(System.in);
        n=scanner.nextInt();        

        c=new double[n+1];
        
        for (int i=0; i<c.length; i++)
        {
            System.out.println("Please enter the coefficient c["+i+"]:");
            c[i]=scanner.nextDouble();
        }        
        print_poly(c);
        
        System.out.println("Please enter the value of x:");
        x=scanner.nextDouble();
        
        System.out.println("The value P(" + x + ") = " + Evaluate(c,x));
        scanner.close();
        
        // Big(0) = n log n 
    }

}
