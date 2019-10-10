package ���j_Recursionc;

import java.util.*;

public class C_RU31_��_�e���𲾰ʽL�l {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = Integer.parseInt(sc.nextLine());
		hanoi(size,size,"A","B","C");
	}

	//�Ѫk�Ѧ� https://www.youtube.com/watch?v=2SUvWfNJSsM&t=612s
	public static void hanoi(int n, int disk,String A, String B, String C) {
		if(n == 1) {
	        System.out.printf("Move disk %d from %S to %S\n",disk, A, C);
	    }
	    else {
	        hanoi(n-1,disk-1, A, C, B);//�u�n��n-1���L�l����B
	        hanoi(1, disk,A, B, C);
	        hanoi(n-1, disk-1,B, A, C);//�u�n��n-1���L�l����C
	    }
	}
}
