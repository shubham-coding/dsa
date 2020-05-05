package others;


/**
 * Java Program to reverse a String in place, 
 * without any additional buffer in Java.
 *
 * @author WINDOWS 8
 *
 */
public class StringReversal {

    /**
     * Java method to reverse a String in place
     * @param str 
     * @return  reverse of String
     */
	
	public static void main(String[] args) {
		
		System.out.println(reverse("abcd"));
	}
    public static String reverse(String str) {
        if(str == null || str.isEmpty()){
            return str;
        }
        char[] characters = str.toCharArray();
        int i = 0;
        int j = characters.length - 1;
        while (i < j) {
            swap(characters, i, j);
            i++;
            j--;
        }
        return new String(characters);
    }

    /**
     * Java method to swap two numbers in given array
     * @param str
     * @param i
     * @param j 
     */
    private static void swap(char[] str, int i, int j) {
        char temp = str[i];
        str[i] = str[j];
        str[j] = temp;
    }

    
}
