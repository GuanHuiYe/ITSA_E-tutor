package �ƾ�_Mathematics;
import java.util.Scanner;

public class C_MM09_��_�p��i���誺�� {

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
