package 綜合_Comprehensive;

import java.util.*;

public class C_CH13_中_坑洞路面 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		String[] input = sc.nextLine().split(" ");
		int[] road = new int[input.length];
		for (int index = 0; index < road.length; index++) {
			road[index] = Integer.parseInt(input[index]);
		}
		Boolean water = false;
		int ans = 0;
		int temp_count = 0;
		int temp_height=road[0];
		for (int index = 1; index < road.length; index++) {
			if (temp_height > road[index]) {
				water = true;
				temp_count += temp_height-road[index];
			} else {
				if (water) {
					water = false;
					ans += temp_count;
					temp_count = 0;
					temp_height=road[index];
				}
			}
		}
		System.out.println(ans);
	}

}
