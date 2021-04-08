package Tut_01;
import java.util.ArrayList;
import java.util.Scanner;
public class Ex4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the list ");
		int n = Integer.parseInt(scanner.nextLine());
		
		ArrayList<String> name_list = new ArrayList<String>(n);
		for ( int i = 0; i < n; i++) {
			System.out.println("Enter the name");
			name_list.add(scanner.nextLine());		
		}
		System.out.println("Enter a name for searching");
		String s = scanner.nextLine();
		System.out.println(s + " appear in ");
		int count = 0;
		for ( int i = 0; i < name_list.size(); i++) {
			
			if ( name_list.get(i).equals(s)) {
				System.out.println(i + 1);
				count++;
			} 
		
		}
		if ( count == 0 ) System.out.println("-1");
		scanner.close();
	}

}
