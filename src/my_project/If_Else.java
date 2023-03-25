package my_project;

import java.util.Scanner;

public class If_Else {
			
	public static void main(String[] args) {
		
		System.out.println("Enter your marks");
		
		Scanner s = new Scanner(System.in);
		
		int mark = s.nextInt();
		
		if(mark > 0 && mark < 30) {
			System.out.println("FAIL :"+ mark);
		}else if (mark > 30 && mark < 50 ) {
			System.out.println("D GRADE :"+ mark+"marks");
		}else if (mark > 51 && mark < 70) {
			System.out.println("C GRADE :"+ mark+"marks");
		}else if (mark > 71 && mark < 85) {
			System.out.println("B GRADE :"+ mark+"marks");
		}else if (mark > 85 && mark < 100) {
			System.out.println("A GRADE :"+ mark+"marks");
		}
		
		
	}
}