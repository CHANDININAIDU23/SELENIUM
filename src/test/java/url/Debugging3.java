package url;

public class Debugging3 {
	
	public static void main(String[] args) {
		   
	  String str= "welcome";
	  int len= str.length();
	  
	  String rev="";
	  
	  
	  for(int i=len-1;i>0;i--) {
		  
		  rev=rev+str.charAt(i);
	  }
	
	System.out.println(rev);
	
	
	
	}	

}
