package 綜合_Comprehensive;

import java.util.*;

public class C_CH05_易_比較數字大小 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] input = sc.nextLine().split(" ");
		int[] ans = new int[input.length];
		for (int index = 0; index < input.length; index++) {
			ans[index] = Integer.parseInt(input[index]);
		}
		Arrays.sort(ans);
		for (int index = ans.length - 1; index >= 0; index--) {
			System.out.print(ans[index] + (index == 0 ? "\n" : ">"));
		}
	}

}
