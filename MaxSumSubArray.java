package practice;

public class MaxSumSubArray {

	public static void main(String[] args) {
		
		int a[]= {4,-3,-2,2,3,1,-2,-3,4,2,-6,-3,-1,3,1,2};
		
		int maxSum=a[0];
		int temp=0;
		
		int start=0;
		int end=0;
		int s=0;
		
		for(int i=0;i<a.length;i++) {
			temp=temp+a[i];
			
			if(maxSum<temp) {
				maxSum=temp;
				start=s;
				end=i;
			}
			
			if(temp<0) {
				temp=0;
				s=i+1;
			}
		}
		
		System.out.println("max sum is- "+maxSum);
		System.out.println("start -"+start);
		System.out.println("end -"+end);
	}
}
