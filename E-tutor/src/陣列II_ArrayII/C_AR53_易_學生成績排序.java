package �}�CII_ArrayII;

import java.util.*;

public class C_AR53_��_�ǥͦ��Z�Ƨ� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		int[] ans = new int[Integer.parseInt(sc.nextLine())];
		for (int index = 0; index < ans.length; index++) {
			ans[index] = Integer.parseInt(sc.nextLine());
		}
		Arrays.sort(ans);
		for (int item : ans) {
			System.out.println(item);
		}
	}

}
