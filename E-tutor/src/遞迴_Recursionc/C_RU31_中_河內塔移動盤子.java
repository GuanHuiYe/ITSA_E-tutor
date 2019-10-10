package 遞迴_Recursionc;

import java.util.*;

public class C_RU31_中_河內塔移動盤子 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = Integer.parseInt(sc.nextLine());
		hanoi(size,size,"A","B","C");
	}

	//解法參考 https://www.youtube.com/watch?v=2SUvWfNJSsM&t=612s
	public static void hanoi(int n, int disk,String A, String B, String C) {
		if(n == 1) {
	        System.out.printf("Move disk %d from %S to %S\n",disk, A, C);
	    }
	    else {
	        hanoi(n-1,disk-1, A, C, B);//只要把n-1的盤子移到B
	        hanoi(1, disk,A, B, C);
	        hanoi(n-1, disk-1,B, A, C);//只要把n-1的盤子移到C
	    }
	}
}
