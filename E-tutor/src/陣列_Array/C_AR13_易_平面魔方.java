package 陣列_Array;

import java.util.*;

public class C_AR13_易_平面魔方 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ans="";
		for (int nth = Integer.parseInt(sc.nextLine()); nth > 0; nth--) {
			int size = Integer.parseInt(sc.nextLine());
			int[][] magic = new int[size][size];
			int count = 0;
			for (int y = 0; y < size; y++) {
				for (int x = 0; x < size; x++) {
					magic[y][x] = ++count;
				}
			}
			char[] input = sc.nextLine().toCharArray();
			for (char item : input) {
				int[][] newMagic = new int[size][size];
				switch (item) {
				case 'R':
					for (int x = 0, new_y = 0; new_y < size; x++, new_y++) {
						for (int y = size - 1, new_x = 0; new_x < size; y--, new_x++) {
							newMagic[new_y][new_x] = magic[y][x];
						}
					}
					break;
				case 'L':
					for (int x = size - 1, new_y = 0; new_y < size; x--, new_y++) {
						for (int y = 0, new_x = 0; new_x < size; y++, new_x++) {
							newMagic[new_y][new_x] = magic[y][x];
						}
					}
					break;
				case 'N':
					for (int y = size - 1, new_y = 0; new_y < size; y--, new_y++) {
						for (int x = 0, new_x = 0; new_x < size; x++, new_x++) {
							newMagic[new_y][new_x] = magic[y][x];
						}
					}
					break;
				}
				magic = newMagic;

			}
			for (int y = 0; y < size; y++) {
				for (int x = 0; x < size; x++) {
					ans+=String.format("%5d", magic[y][x]);					
				}
				ans+="\n";
			}
			if(nth>1)ans+="\n";
			
		}
		System.out.print(ans);
	}

}
