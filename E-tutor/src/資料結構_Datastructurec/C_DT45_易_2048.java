package 資料結構_Datastructurec;

import java.util.*;

public class C_DT45_易_2048 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			char command = sc.nextLine().toCharArray()[0];
			int[][] map = new int[4][4];
			for (int y = 0; y < map.length; y++) {
				String[] input = sc.nextLine().split(" ");
				for (int x = 0; x < input.length; x++) {
					map[y][x] = Integer.parseInt(input[x]);
				}
			}
			switch (command) {
			case 'U':
				for (int x = 0; x < 4; x++) {
					for (int y = 0; y < 4; y++) {
						if (y + 1 != 4) {
							if (map[y][x] == map[y + 1][x] || map[y][x] == 0 && map[y + 1][x] != 0) {
								map[y][x] += map[y + 1][x];
								map[y + 1][x] = 0;
							}

						}
					}
				}
				break;
			case 'D':
				for (int x = 0; x < 4; x++) {
					for (int y = 3; y >= 0; y--) {
						if (y - 1 >= 0) {
							if (map[y][x] == map[y - 1][x] || map[y][x] == 0 && map[y - 1][x] != 0) {
								map[y][x] += map[y - 1][x];
								map[y - 1][x] = 0;
							}

						}
					}
				}
				break;
			case 'L':
				for (int y = 0; y < 4; y++) {
					for (int x = 0; x < 4; x++) {
						if (x + 1 < 4) {
							if (map[y][x] == map[y][x + 1] || map[y][x] == 0 && map[y][x + 1] != 0) {
								map[y][x] += map[y][x + 1];
								map[y][x + 1] = 0;
							}
						}
					}
				}
				break;
			case 'R':
				for (int y = 0; y < 4; y++) {
					for (int x = 3; x >= 0; x--) {
						if (x - 1 >= 0) {
							if (map[y][x] == map[y][x - 1] || map[y][x] == 0 && map[y][x - 1] != 0) {
								map[y][x] += map[y][x - 1];
								map[y][x - 1] = 0;
							}
						}
					}
				}
				
				break;
			}
			for (int y = 0; y < 4; y++) {
				for (int x = 0; x < 4; x++) {
					System.out.print(map[y][x] + (x < 3 ? " " : "\n"));
				}
			}
		}
	}

}
