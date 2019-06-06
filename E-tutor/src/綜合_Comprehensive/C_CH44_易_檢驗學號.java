package 綜合_Comprehensive;
import java.util.Scanner;

public class C_CH44_易_檢驗學號 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] in = sc.nextLine().split(" ");
		String[] str = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
				"T", "U", "V", "W", "X", "Y", "Z" };
		for (int n = 0; n < Integer.parseInt(in[0]); n++) {
			int[] c = new int[13];
			for (int nn = 0; nn < 12; nn++) {
				c[nn] = Integer.parseInt(in[n + 1].substring(nn, nn + 1));
			}
			int v = 26 - (((c[0] + c[2] + c[4] + c[6] + c[8] + c[10]) + 3 * (c[1] + c[3] + c[5] + c[7] + c[9] + c[11]))
					% 26);
			if (in[n + 1].substring(12, 13).equals(str[v - 1])) {
				System.out.println("valid");
			} else {
				System.out.println("invalid");

			}
		}

	}

}
