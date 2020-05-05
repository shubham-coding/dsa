package permutation;

public class permutation {
	public static void main(String[] args) {
		
		String s = "abc";
		
		permute(s, 0, s.length()-1);
		
		
	}
	
	public static void permute(String str, int l , int r) {
		
		if( l==r) {
			System.out.println(str);
			}
		
		else {
			for(int i =l;i<=r;i++) {
				str=swap(str,l,i);
				permute(str, l+1, r);
				str = swap(str,l,i);
			}
		}
		
	
	}
	
	public static String swap(String s , int i , int j) {
		
		char temp ;
		char[] charArr = s.toCharArray();
		temp = charArr[i];
		charArr[i]=charArr[j];
		charArr[j] = temp;
		
		return String.valueOf(charArr);
	}

}
