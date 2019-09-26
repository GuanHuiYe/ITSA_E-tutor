package TH73;

import java.util.*;

public class Problem_5_¤p½_¦Ì¹A³õ {
	public static int ans = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String[] input = sc.nextLine().split(" ");
			int[][] world = new int[Integer.parseInt(input[1])][Integer.parseInt(input[0])];

			for (int n = 0; n < world.length; n++) {
				String[] input2 = sc.nextLine().split(" ");
				for (int nn = 0; nn < world[n].length; nn++) {
					world[n][nn] = Integer.parseInt(input2[nn]);
				}
			}
			int[][] countWorld = new int[Integer.parseInt(input[1])][Integer.parseInt(input[0])];

			int ansCount = 1;
			for (int n = 0; n < world.length; n++) {
				for (int nn = 0; nn < world[n].length; nn++) {
					if (deep(nn, n, world, countWorld, world[n][nn]))
						ansCount++;

				}
			}
			ansCount--;
			System.out.println(ansCount);
			System.out.println(ans);
		}

	}

	public static Boolean deep(int x, int y, int[][] origin, int[][] arr, int count) {
		if (x < 0 || y < 0 || y > arr.length - 1)
			return false;
		else if (x > arr[y].length - 1)
			return false;
		else if (arr[y][x] > 0)
			return false;
		else if (origin[y][x] > 0) {
			arr[y][x] = arr[y][x] + count;
			if (arr[y][x] > ans)
				ans = arr[y][x];
			deep(x, y - 1, origin, arr, arr[y][x] + count);
			deep(x + 1, y, origin, arr, arr[y][x] + count);
			deep(x, y + 1, origin, arr, arr[y][x] + count);
			deep(x - 1, y, origin, arr, arr[y][x] + count);
			return true;
		}
		return false;

	}



}
