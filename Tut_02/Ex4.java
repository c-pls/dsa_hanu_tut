package Tut_02;


public class Ex4 {
	static int GCD(int a , int b) {
		while(b!= 0 ) {
			int c = a % b;
			a = b;
			b = c;	
		}
		return a;
	}
	static int GCD2(int a , int b) {
		if ( a == 0 ) return b;
		else if ( a < b) return GCD2(b % a, a);
		else return GCD2(a % b, b);
	}
	public static void main(String[] args) {
		System.out.println(GCD(15324, 6234650));
		System.out.println(GCD2(255, 15));
		
		// Big(0) = log(minimum(a,b))
	}

}
