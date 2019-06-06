package TH63;

import java.util.*;

public class Problem3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			String[] in = sc.nextLine().split(" ");
			double hg = Double.parseDouble(in[0]);
			double bw = Double.parseDouble(in[1]);
			double ol = Double.parseDouble(in[2]);
			double h = (bw / hg) * 41.2;			
			double c = (hg * bw) / 634.4;
			if (ol >= 30) {
				c += ((int)((ol - 30) / 5)) * 0.15;
			}
			double p = bw * 0.4;
			if (ol >= 28) {
				p += (((int)(ol - 28) / 2)) * 0.25;
			}
			System.out.printf("%.2f %.2f %.2f", h, c, p);
			System.out.println();
			if (Integer.parseInt(sc.nextLine()) == -1) {
				break;
			}

		}
	}

}
