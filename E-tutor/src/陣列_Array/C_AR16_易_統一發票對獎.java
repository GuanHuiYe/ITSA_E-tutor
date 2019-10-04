package 陣列_Array;

import java.util.*;

public class C_AR16_易_統一發票對獎 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] map = new String[4];
		int[] ans1 = new int[7];
		int ans = 0;
		for (int index = 0; index < map.length; index++) {
			map[index] = sc.nextLine();
		}
		for (int nth = Integer.parseInt(sc.nextLine()); nth > 0; nth--) {
			String input = sc.nextLine();
			// 特獎
			if (input.equals(map[0]))
				ans1[0]++;
			else {
				int getN = 7;
				for (int index = 1; index < map.length; index++) {
					// 頭 2 3 4 5 6獎
					for (int n = 0; n < 6; n++) {
						if (input.substring(n,8).equals(map[index].substring(n, 8))) {
							if (n + 1 < getN)
								getN = n + 1;
							break;
						}
					}
				}
				if(getN!=7)ans1[getN]++;
			}

		}
		
		for(int index=0;index<7;index++) {
			System.out.print(ans1[index]+(index==6?"\n":" "));
			switch(index) {
			case 0:
				ans+=ans1[index]*2000000;
				break;
			case 1:
				ans+=ans1[index]*200000;
				break;
			case 2:
				ans+=ans1[index]*40000;
				break;
			case 3:
				ans+=ans1[index]*100000;
				break;
			case 4:
				ans+=ans1[index]*4000;
				break;
			case 5:
				ans+=ans1[index]*1000;
				break;
			case 6:
				ans+=ans1[index]*200;
				break;
			}
		}
		System.out.println(ans);

	}

}
