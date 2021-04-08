package Tut_04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex2 {
	static Scanner scanner = new Scanner(System.in);
	
	static void createList(int n, ArrayList<Integer> marks_list, ArrayList<String> name_list ) {
		for (int i = 0; i < n; i++) {
			System.out.println("Enter student name");
			String name = scanner.nextLine();
			name_list.add(name);
			System.out.println("Enter student mark");
			int mark = Integer.parseInt(scanner.nextLine());
			marks_list.add(mark);

		}
	}
	static void sort_mark(ArrayList<Integer> marks_list, ArrayList<String> name_list) {
		
		for (int i = 0; i < marks_list.size(); i++) {
			int max = i;
			for (int j = i + 1; j < marks_list.size(); j++) {
				if (marks_list.get(j) > marks_list.get(max)) {
					max = j;
				}
			}

			// swap max with the i element
			Collections.swap(marks_list, i, max);
			Collections.swap(name_list, i, max);
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter the number of student");
		int n = Integer.parseInt(scanner.nextLine());

		// create a HashMap store the student's info

		ArrayList<Integer> marks_list = new ArrayList<Integer>(n);
		ArrayList<String> name_list = new ArrayList<String>(n);
		
		
		createList(n, marks_list, name_list);


		// sort
		sort_mark(marks_list, name_list);

		// get m student
		int m = 0;
		do {
			System.out.println("Enter M: ( Number of student you want to display) ");
			m = Integer.parseInt(scanner.nextLine());
			if (0 > m || m > n) {
				System.out.println("Invalid, enter again");
			}
		} while (0 > m || m > n);

		System.out.println("\n" + "Top " + m + " leading students");
		for (int i = 0; i < m; ++i) {
			System.out.println(name_list.get(i) + ": " + marks_list.get(i));
		}

		scanner.close();
	}

}
