package 數學_Mathematics;
import java.util.Scanner;

public class C_MM12_易_相遇時間計算 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int in=sc.nextInt();
		System.out.println(Math.round(Math.ceil(in/(1-0.30*2.54))));
	}
}
