package 陣列II_ArrayII;

import java.util.*;

public class C_AR81_易_求Array元素最大值的和 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[9];
		int index = -1;
		for (int y = 0; y < 3; y++) {
			String[] input = sc.nextLine().split(",");
			for (int x = 0; x < 3; x++) {
				arr[++index] = Integer.parseInt(input[x]);
			}
		}
		Arrays.sort(arr);
		int ans = 0;
		for (int nth = arr.length - 1; nth > arr.length - 4; nth--) {

			ans += arr[nth];

		}
		System.out.println(ans);
	}

}
