package °}¦C_Array;

import java.util.*;

public class C_AR14_©ö_¿}ªG¤À¨É {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int nth = Integer.parseInt(sc.nextLine()); nth > 0; nth--) {
			String[] format = sc.nextLine().split(" ");
			int[][] table = new int[Integer.parseInt(format[1])][Integer.parseInt(format[0])];
			for (int n = 0; n < Integer.parseInt(format[2]); n++) {
				String[] position = sc.nextLine().split(" ");
				int x = Integer.parseInt(position[0])-1;
				int y = Integer.parseInt(position[1])-1;
				table[y][x]++;
				if (y - 1 >= 0)
					table[y - 1][x]++;
				if (y + 1 < table.length)
					table[y + 1][x]++;
				if (x - 1 >= 0)
					table[y][x - 1]++;
				if (x + 1 < table[y].length)
					table[y][x + 1]++;
			}
			
			Boolean test=true;
			for(int y=0;y<table.length;y++) {
				for(int x=0;x<table[y].length;x++) {
					if(table[y][x]==0) {
						test=false;
						break;
					}
				}
				if(!test)break;
			}
			System.out.println(test?"Y":"N");
		}

	}

}
