package Tut_02;



public class Ex3 {
	static double power(int x , int y) {
		int temp = y;
		if ( y < 0) temp = temp * (-1);
		
		if ( y > 0) {
		if (temp < 1) return 1;
		double k =  power(x,temp/2);
		if ( temp % 2 ==0) return k * k;
		else return x * k * k;
		} 
		
		
		else {
			
				if (temp < 1) return 1;
				else {
				
				double k =  power(x,temp/2);
				if ( temp % 2 ==0) return 1 / (k * k);
				else return 1/(x * k * k);
				}
			
		
		}
	
		
		
	}
	public static void main(String[] args) {
		
		System.out.println(power(2,-5));
		
		
		System.out.println(power(2,5));
		
		// log(n)
		
		
		
		
	}

}
