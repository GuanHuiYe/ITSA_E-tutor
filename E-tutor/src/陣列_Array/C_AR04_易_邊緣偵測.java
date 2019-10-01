package °}¦C_Array;

import java.util.*;

public class C_AR04_©ö_Ãä½t°»´ú {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ans = "";
		for (int N = Integer.parseInt(sc.nextLine()); N > 0; N--) {
			String[] input_NM = sc.nextLine().split(" ");
			int n = Integer.parseInt(input_NM[0]);
			int m = Integer.parseInt(input_NM[1]);

			String[][] graph = new String[n][m];

			for (int y = 0; y < graph.length; y++) {
				String[] input = sc.nextLine().split(" ");
				for (int x = 0; x < graph[y].length; x++) {
					graph[y][x] = input[x];
				}
			}

			for (int y = 0; y < graph.length; y++) {
				for (int x = 0; x < graph[y].length; x++) {
					if (graph[y][x].equals("1")) {
						int count0 = 0;

						if (y + 1 < graph.length) {
							if (graph[y + 1][x].equals("0"))
								count0++;
						}
						if (y - 1 >= 0) {
							if (graph[y - 1][x].equals("0"))
								count0++;
						}
						if (x + 1 < graph[y].length) {
							if (graph[y][x + 1].equals("0"))
								count0++;
						}
						if (x - 1 >= 0) {
							if (graph[y][x - 1].equals("0"))
								count0++;
						}
						ans += count0 > 0 ? "0" : "_";

					} else {
						ans += "_";
					}
					ans += " ";

				}
				ans += "\n";
			}
			
			if (N > 1)
				ans += "\n";

		}
		System.out.print(ans);
	}

}
