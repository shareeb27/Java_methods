package my_project;

import java.util.Scanner;

public class Tables_1 {
		 
	 public static void main(String[] args) {
		    int i, j;
		    Scanner s = new Scanner(System.in);
		    
		    System.out.println("Enter the number");
		    i=s.nextInt();
		   // s.close();
		    
		    
		   for (j=1; j<=20; j++){
			   System.out.printf("%d * %d = %d \n \n",i,j,(i * j));
			   
		   }
	
		   	System.out.println();
	 }
}
