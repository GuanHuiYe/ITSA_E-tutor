package 數學_Mathematics;
import java.util.Scanner;

public class C_MM13_易_停車費計算 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] in = sc.nextLine().split(" ");
		String[] out = sc.nextLine().split(" ");
		int ts = Integer.parseInt(in[0]) * 60 + Integer.parseInt(in[1]);
		int te = Integer.parseInt(out[0]) * 60 + Integer.parseInt(out[1]);
		int tt = te - ts;
		int a = 0;
		if (tt < 120) {
			a = tt / 30;
		} else if (tt < 240) {
			a = 120 + ((tt - 120) / 30 * 40);
		} else {
			a = 120 + 160 + ((tt - 240) / 30 * 60);
		}
		System.out.println(a);

	}

}
