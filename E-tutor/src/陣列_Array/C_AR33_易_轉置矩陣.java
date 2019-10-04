package °}¦C_Array;

import java.util.*;

public class C_AR33_©ö_Âà¸m¯x°} {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] input = sc.nextLine().split(" ");
		int size_y = Integer.parseInt(input[0]), size_x = Integer.parseInt(input[1]);
		String[][] arr = new String[size_y][size_x];
		for (int y = 0; y < size_y; y++) {
			String[] input_row = sc.nextLine().split(" ");
			for (int x = 0; x < size_x; x++) {
				arr[y][x] = input_row[x];
			}
		}
		for (int x = 0; x < size_x; x++) {
			for (int y = 0; y < size_y; y++) {
				System.out.print(arr[y][x] + (y == size_y - 1 ? "\n" : " "));
			}
		}

	}

}
