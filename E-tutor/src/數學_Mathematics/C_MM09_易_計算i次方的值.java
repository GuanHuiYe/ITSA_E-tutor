package 數學_Mathematics;
import java.util.Scanner;

public class C_MM09_易_計算i次方的值 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int in = sc.nextInt();
		if (in < 32) {
			System.out.println(Math.round(Math.pow(2, in)));
		}
		else {
			System.out.println("Value of more than 31");
		}
	}

}
