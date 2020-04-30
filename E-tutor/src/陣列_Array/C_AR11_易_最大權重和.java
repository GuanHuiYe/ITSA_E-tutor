package 陣列_Array;

import java.util.*;

public class C_AR11_易_最大權重和 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int nth = Integer.parseInt(sc.nextLine()); nth > 0; nth--) {
			String[] input_format = sc.nextLine().split(" ");
			int m = Integer.parseInt(input_format[0]);
			int n = Integer.parseInt(input_format[1]);
			int k = Integer.parseInt(input_format[2]);
			int[][] target = new int[m][n];
			
			for(int mm=0;mm<m;mm++) {
				String[] input=sc.nextLine().split(" ");
				for(int nn=0;nn<n;nn++) {
					target[mm][nn]=Integer.parseInt(input[nn]);
				}	
			}
			
			int ans = 0;
			for (int y = 0; y < target.length - k + 1; y++) {
				for (int x = 0; x < target[y].length - k + 1; x++) {
					int sum = 0;
					for (int mm = 0; mm < k; mm++) {
						for (int nn = 0; nn < k; nn++) {
							sum += target[y+mm][x+nn];
						}
					}
					if (sum > ans)
						ans = sum;
				}
			}
			System.out.println(ans);
		}
	}

}
