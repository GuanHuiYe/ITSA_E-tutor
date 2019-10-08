package 陣列_Array;

import java.util.*;

public class C_AR07_中_有違反數獨的規則嗎 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] map = new int[9][9];
		for (int y = 0; y < 9; y++) {
			char[] input = sc.nextLine().toCharArray();
			for (int x = 0; x < 9; x++) {
				map[y][x] = Character.getNumericValue(input[x]);
			}
		}
		String ans = "";
		for (int y = 0; y < 9; y++) {
			LinkedList<Integer> count = new LinkedList<Integer>();
			Boolean test = true;
			for (int x = 0; x < 9; x++) {
				if (count.contains(map[y][x])) {
					if (map[y][x] != 0) {
						ans += "row" + (y + 1) + " #" + map[y][x] + "\n";
						test = false;
						break;
					}
				} else
					count.add(map[y][x]);
			}

		}
		for (int x = 0; x < 9; x++) {
			LinkedList<Integer> count = new LinkedList<Integer>();
			Boolean test = true;
			for (int y = 0; y < 9; y++) {
				if (count.contains(map[y][x])) {
					if (map[y][x] != 0) {
						ans += "column" + (x + 1) + " #" + map[y][x] + "\n";
						test = false;
						break;
					}
				} else
					count.add(map[y][x]);
			}

		}
		int block = 0;
		for (int y = 0; y < 9; y += 3) {
			for (int x = 0; x < 9; x += 3) {
				block++;
				Boolean test = true;
				LinkedList<Integer> count = new LinkedList<Integer>();
				for (int yy = y; yy < y + 3; yy++) {
					for (int xx = x; xx < x + 3; xx++) {
						if (count.contains(map[yy][xx])) {
							if (map[yy][xx] != 0) {
								ans += "block" + block + " #" + map[yy][xx] + "\n";
								test = false;
								break;
							}
						} else
							count.add(map[yy][xx]);

					}
					if (!test)
						break;
				}

			}

		}
		if (ans.equals(""))
			ans = "true\n";
		System.out.print(ans);

	}

}
