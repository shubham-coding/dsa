package practice;

public class RemoveDuplicatesArray {

	
	public static void main(String[] a) {
		
		int arr[] = {1, 2,2,3,3,3,4,4};
		
		int j=0;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]!=arr[i+1]) {
				arr[j]=arr[i];
				j++;
			}
		}
		arr[j] = arr[arr.length-1];
		
		for(int i=0;i<=j;i++) {
			System.out.println(arr[i]);
		}
	}
}
