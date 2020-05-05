package practice;

public class Segreagate0and1 {
	
	public static void main(String[] ag) {
		
		int a[]= {0,1,1,0,1,2,1,2,0,0,0,1};
		
		int low=0;
		int mid=0;
		int high=a.length-1;
		
		while(mid<=high) {
			switch(a[mid]) {
			case 0:
				int temp=0;
				temp=a[low];
				a[low]=a[mid];
				a[mid]=temp;
				low++;
				mid++;
				break;
			case 1:
				mid++;
				break;
			case 2:
				int temp1=0;
				temp1=a[mid];
				a[mid]=a[high];
				a[high]=temp1;
				high--;
				break;
			}
		}
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}
