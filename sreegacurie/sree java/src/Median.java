import java.util.Arrays;
import java.util.Scanner;
import java.util.SortedSet;

public class Median {

	public static void main(String[] args) {
		int num1[] = new int[100];
		int num2[] = new int[100];
		int m, n;
		Scanner obj = new Scanner(System.in);
		System.out.println("enter the 1st array size");
		m = obj.nextInt();
		System.out.println("enter the 2nd array size");
		n = obj.nextInt();

		System.out.println("enter the 1st array elements");
		for (int i = 0; i < m; i++) {
			num1[i] = obj.nextInt();
		}
		System.out.println("enter the 2nd array elements");
		for (int i = 0; i < n; i++) {
			num2[i] = obj.nextInt();
		}

		// if (m != n) {
		/*
		 * if (m < n) { int j = 0; int d = m; for (int i = d; i < (m + n); i++)
		 * { num1[i] = num2[j]; j++; } } else { int j = 0; int l = m; for (int i
		 * = n; i <=m; i++) { num1[l] = num2[j]; j++; l++; }
		 * 
		 * 
		 * } for (int i = 0; i < (m + n); i++) { for (int j = 0; j < (m + n) - i
		 * - 1; j++) { if (num1[j] > num1[j + 1]) { int temp = num1[j]; num1[j]
		 * = num1[j + 1]; num1[j + 1] = temp; } } }
		 * 
		 * } else { int j = 0; for (int i = m; i <= (m + n); i++) { num1[i] =
		 * num2[j]; j++; } for (int i = 0; i < (m + n); i++) { for (int l = 0; l
		 * < (m + n) - i - 1; l++) { if (num1[l] > num1[l + 1]) { int temp =
		 * num1[l]; num1[l] = num1[l + 1]; num1[l + 1] = temp; } } }
		 * 
		 * 
		 * }
		 */
		System.arraycopy(num2, 0, num1, m, (m + n));
		Arrays.sort(num1, 0, (m + n));

		if ((m + n) % 2 == 0) {
			int mid = (m + n) / 2;
			float sum = num1[mid] + num1[mid - 1];
			sum = sum / 2;
			System.out.println("the median is:" + sum);
		} else {

			int mid = (m + n) / 2;

			System.out.println("the median is:" + num1[mid]);
		}

	}
}
