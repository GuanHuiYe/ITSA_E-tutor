package �ƾ�_Mathematics;
import java.util.Scanner;

public class C_MM08_��_�p���ƩM������� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] in = sc.nextLine().split(" ");
		int a = Integer.parseInt(in[0]), b = Integer.parseInt(in[1]);
		System.out.println(Math.round(Math.pow((a + b), 2)));
	}

}
