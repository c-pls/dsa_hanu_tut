package Tut_01;
import java.util.Scanner;

public class Ex1 {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter a string");
			String s = scanner.nextLine();
			System.out.println("The name has " + s.length() + " charactes");
			scanner.close();
			
			
		}
}
