package °}¦C_Array;

import java.util.*;

public class C_AR032_©ö_±ÛÂà»PÃè®g´Ñ½L {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = Integer.parseInt(sc.nextLine());
		String[][] arr = new String[size][size];
		for (int y = 0; y < size; y++) {
			for (int x = 0; x < size; x++) {
				arr[y][x] = String.valueOf((char) (y + 65)) + String.valueOf(x+1);
			}
		}

		for (int n = 8; n > 0; n--) {
			for (int y = 0; y < size; y++) {
				for (int x = 0; x < size; x++) {
				System.out.print(arr[y][x]+(x==size-1?"\n":" "));
				}
			}
			if(n>1)System.out.println();
			String[][] newArr = new String[size][size];
			for (int x = 0, new_y = 0; new_y < size; x++, new_y++) {
				for (int y = size - 1, new_x = 0; new_x < size; y--, new_x++) {
					newArr[new_y][new_x] = arr[y][x];
				}
			}			
			arr = newArr;
			if(n==5) {
				newArr = new String[size][size];
				for(int y=0;y<size;y++) {
					for(int x=0,ori_x=size-1;x<size;x++,ori_x--) {
						newArr[y][x]=arr[y][ori_x];
					}
				}
				arr = newArr;
			}
			
		}
	}

}
