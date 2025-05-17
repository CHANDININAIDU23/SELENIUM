package url;

public class Breakpoints {// debugging

	public static void main(String[] args) {
		int a=0;
		int b=1;
		for (int i=0;i<5;i++) {
			int c=a+b;                        // 1) fix break point by doubleclicking 2) press  F11  3) press  F6
			
			System.out.println(c);
			
			a=b;
			b=c;
			
			
		}

	}

}
