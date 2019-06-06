package 數學_Mathematics;

import java.util.Scanner;

public class C_MM15_易_判斷座標是否在正方形的範圍內 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[] in=sc.nextLine().split(" ");
		int a=Integer.parseInt(in[0]),b=Integer.parseInt(in[1]);
		if(a<=100&&b<=100) {
			System.out.println("inside");
		}
		else {
			System.out.println("outside");
		}
	}

}
