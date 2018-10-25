package ArrayList;

public class LargestIndexRange {
	public static void main(String[] args) {

		int a[] = new int[] { 3, 2, 1, 4, 3, 1, 1, 5, 7, 2, 3, 2, 1, 2, 5 };// 38
		int max = 0;
		int index = 0;
		int m = 3;
		int sum;
		int temp = 0;

		for (int i = 0; i < a.length; i++) {
			sum = 0;
			for (int j = i; j < a.length; j++) {

				sum = sum + a[j];
				if (sum % m == 0 && temp < sum) {
					temp = sum;
					max = i;
					index = j;
				}
			}

			// System.out.println("Index position of Maximum value in an array
			// is : " + max +"index"+index);
		}
		System.out.println("Index range from start index :  " + max + ":end index:" + index + "\n::SUM::" + temp);
	}
}