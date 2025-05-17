package url;

import java.util.Scanner;

public class Getinput {

	public static void main(String[] args) {
	
       Scanner sc= new Scanner(System.in);
       System.out.println("enter the number");
       int i= sc.nextInt();
       
       if(i%2==0) {
       System.out.println("even number");
       }
       else {
    	  System.out.println("odd number");
       }
       
       
	}

}
