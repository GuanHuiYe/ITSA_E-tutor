package �}�CII_ArrayII;

import java.util.*;

public class C_AR60_��_���|���D {
	public static Long[][] map;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		map = new Long[16][16];
		for (int y = 0; y < map.length; y++) {
			for (int x = 0; x < map[y].length; x++) {
				map[y][x] = Long.valueOf(-1);
			}
		}
		
		for (int nth = Integer.parseInt(sc.nextLine()); nth > 0; nth--) {
			int aims = Integer.parseInt(sc.nextLine());
			System.out.println(GO(aims, aims));
		}
	}

//�q���I�}�l��^�ӧ�
	public static Long GO(int x, int y) {
		if (y > x)// y>x�����
			return Long.valueOf(0);
		if (x < 0 || y < 0)// ��-1�]�����
			return Long.valueOf(0);
		if (x == 0 && y == 0) {// ��0�N�|��1
			return Long.valueOf(1);
		}
		if (map[y][x] != -1)
			return map[y][x];
		else
			return map[y][x] = GO(x - 1, y) + GO(x - 1, y - 1) + GO(x, y - 1);
	}

}
