package 回溯法_Backtracking;

import java.util.*;

public class C_BT02_中_遞迴走迷宮 {


	public static int ExitX;
	public static int ExitY;
	
	public static String[][] MAZE;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue<String[]> queue = new LinkedList<String[]>();
		String[] input = sc.nextLine().split(" ");
		queue.offer(input);
		int y = 1;
		int x = input.length;

		while (true) {
			y++;
			String[] nextinput = sc.nextLine().split(" ");
			queue.add(nextinput);
			Boolean test = false;
			for (int n = 0; n < input.length; n++) {
				if (nextinput[n].equals("0")) {
					test = true;
					break;
				}
			}
			if (!test)
				break;
		}
		MAZE = new String[y][x];
		ExitX = x - 2;
		ExitY = y - 2;
		y = 0;
		while (!queue.isEmpty()) {
			String[] outinput = queue.poll();
			for (int n = 0; n < outinput.length; n++) {
				MAZE[y][n] = outinput[n];
			}
			y++;
		}

		
		LinkedList<Integer> pathx = new LinkedList<Integer>();
		LinkedList<Integer> pathy = new LinkedList<Integer>();
		x=1;
		y=1;
		while (x <= ExitX && y <= ExitY) {
			MAZE[x][y] = "#";
			if (MAZE[x - 1][y] .equals("0")) {
				x -= 1;
				pathx.add( x);
				pathy.add(y);
			} else if (MAZE[x + 1][y].equals("0")) {
				x += 1;
				pathx.add(x);
				pathy.add(y);
			} else if (MAZE[x][y - 1].equals("0")) {
				y -= 1;
				pathx.add(x);
				pathy.add(y);
			} else if (MAZE[x][y + 1].equals("0")) {
				y += 1;
				pathx.add(x);
				pathy.add(y);
			} else if (chkExit(x, y, ExitX, ExitY) ==1)
				break;
			else {
				MAZE[x][y] = "2";
				pathx.removeLast();
				pathy.removeLast();
				x = pathx.getLast();
				y = pathy.getLast();
			}
		}		
		
		for (int n = 0; n < MAZE.length; n++) {
			for (int n1 = 0; n1 < MAZE[n].length; n1++) {
				if(MAZE[n][n1].equals("2"))
					System.out.print(0);
				else 
					System.out.print(MAZE[n][n1]);
				if(n1<MAZE[n].length-1)
					System.out.print(" ");
			}
			System.out.println();
		}

	}


	public static int chkExit(int x, int y, int ex, int ey) {
		if (x == ex && y == ey) {
			if (MAZE[x - 1][y].equals("1") || MAZE[x + 1][y] .equals("1")|| MAZE[x][y - 1] .equals("1") || MAZE[x][y + 1] .equals("#"))
				return 1;
			if (MAZE[x - 1][y].equals("1") || MAZE[x + 1][y] .equals("1") || MAZE[x][y - 1].equals("#")|| MAZE[x][y + 1] .equals("1"))
				return 1;
			if (MAZE[x - 1][y] .equals("1") || MAZE[x + 1][y].equals("#")|| MAZE[x][y - 1].equals("1") || MAZE[x][y + 1] .equals("1"))
				return 1;
			if (MAZE[x - 1][y].equals("#") || MAZE[x + 1][y] .equals("1") || MAZE[x][y - 1] .equals("1")|| MAZE[x][y + 1].equals("1"))
				return 1;

		}
		return 0;
	}
}
