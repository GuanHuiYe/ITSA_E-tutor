package 數學_Mathematics;
import java.util.Scanner;

public class C_MM11_易_購票計算 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int in = sc.nextInt();
		int a, b, c;
		a = in / 10;
		b = (in - a * 10) / 5;
		c = in - a * 10 - b * 5;
		System.out.println("NT10=" + a + "\nNT5=" + b + "\nNT1=" + c);
	}
}
