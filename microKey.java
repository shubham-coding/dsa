package KeyPatternA;

public class microKey {

	public static void main(String[] args) {

		int N = 11;
		// for(int N=1;N<=20;N++)
		System.out.println(getNumber(N));
	}

	public static int getNumber(int N) {

		if (N <= 6)
			return N;

		int arr[] = new int[N];

		int b;
		int n;

		for (n = 1; n <= 6; n++)
			arr[n - 1] = n;

		for (n = 7; n <= N; n++) {

			arr[n - 1] = 0;

			for (b = n - 3; b >= 1; b--) {

				int curr = (n - b - 1) * arr[b - 1];
				if (curr > arr[n - 1])
					arr[n - 1] = curr;
			}
		}

		return arr[N - 1];
	}

}
