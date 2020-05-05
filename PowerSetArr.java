package powerSet;

public class PowerSetArr {

	
	static int count=0;
	static int  powerSet(String[] arr, int index, String curr)

	{
		int n = arr.length;

		if (index == n) {
			count++;
			System.out.println(curr);
			return count;
		}

		powerSet(arr, index + 1, curr + arr[index]);
		powerSet(arr, index + 1, curr);
		
		return count;

	}

	public static void main(String[] args) {
		String arr[] = {"a","b","c"};
		//String str = "abcd";
		int index = 0;
		String curr = "";
		System.out.println(powerSet(arr, index, curr));

	}


}
