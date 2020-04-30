package 綜合_Comprehensive;

import java.util.*;

public class C_CH07_易_標準體重計算 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String[] input = sc.nextLine().split(" ");
			switch (Integer.parseInt(input[1])) {
			case 1:
				System.out.printf("%.1f\n", (Double.parseDouble(input[0]) - 80) * 0.7);
				break;
			case 2:
				System.out.printf("%.1f\n", (Double.parseDouble(input[0]) - 70) * 0.6);
				break;
			}
		}
	}

}
