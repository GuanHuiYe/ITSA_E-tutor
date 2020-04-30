package 陣列II_ArrayII;

import java.util.*;

public class C_AR63_易_矩陣相加 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] input = sc.nextLine().split(" ");
		int[][] matrix = new int[Integer.parseInt(input[0])][Integer.parseInt(input[1])];
		for (int y = 0; y < matrix.length; y++) {
			input = sc.nextLine().split(" ");
			for (int x = 0; x < matrix[y].length; x++) {
				matrix[y][x] = Integer.parseInt(input[x]);
			}
		}

		input = sc.nextLine().split(" ");
		int[][] matrix1 = new int[Integer.parseInt(input[0])][Integer.parseInt(input[1])];
		for (int y = 0; y < matrix1.length; y++) {
			input = sc.nextLine().split(" ");
			for (int x = 0; x < matrix1[y].length; x++) {
				matrix1[y][x] = Integer.parseInt(input[x]);
			}
		}
		for (int y = 0; y < matrix.length; y++) {
			for (int x = 0; x < matrix[y].length; x++) {
				System.out.print((matrix[y][x] + matrix1[y][x]) + (x == matrix[y].length - 1 ? "\n" : " "));
			}
		}

	}

}
