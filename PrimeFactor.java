package practice;

public class PrimeFactor {
	
	public static void main(String[] aegs) {
		
		int n=25;
		
		// print till the no is even
		while(n%2==0) {
			System.out.println("2");
			n=n/2;
		}
		
		// now the number is odd
		
		for(int i=3;i<=Math.sqrt(n);i=i+2) {
			
			while(n%i==0) {
				System.out.println(i);
			n=n/i;
			}
			
		}
		
		// no if no is greater than 2 just print no itself
		if(n>2)
			System.out.println(n);
	}

}
