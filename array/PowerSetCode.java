package powerSet;

public class PowerSetCode {
	
	static int count=0;
	static int  powerSet(String str, int index, String curr)

	{
		int n = str.length();

		if (index == n) {
			count++;
			System.out.println(curr);
			return count;
		}

		powerSet(str, index + 1, curr + str.charAt(index));
		powerSet(str, index + 1, curr);
		
		return count;

	}

	public static void main(String[] args) {
		String str = "abcd";
		int index = 0;
		String curr = "";
		System.out.println(powerSet(str, index, curr));

	}

}
