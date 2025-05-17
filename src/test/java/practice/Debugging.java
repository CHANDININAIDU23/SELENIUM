package practice;

public class Debugging {

	public static void main(String[] args) {
		int a=3;
		int b=5;
		
		for(int i=1;i<=12;i++) {
			
	       int c= a+b;
	       
	       int d=i*c;
	       System.out.println(d);
	       
	       if(d%5==0) {
	    	   System.out.println("divisble by both 8 and 5");
	       }
	     
	       else {
	    	   System.out.println("divisble by 8");
	       }
			
		}

	}

}
