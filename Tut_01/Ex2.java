package Tut_01;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Ex2 {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the size of the list");
			int n = scanner.nextInt();
			ArrayList<Integer> list = new ArrayList<Integer>(n);
			for ( int i = 0; i < n ; i++) {
				System.out.printf("Enter the number %d of the list ",i + 1);
				int num = scanner.nextInt();
				list.add(num);
			}
			//Using Collection Framework
			System.out.println("The maximum number of the list is " + Collections.max(list) );
			
			//Using algorithms
			int max = list.get(0);
			for (int i = 1; i < list.size(); i++) {
				if (list.get(i) > max) {
					max = list.get(i);
				}
			}
			System.out.println("The maximum number of the list is " + max );
			scanner.close();
		}
}
