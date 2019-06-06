package TH72;

import java.util.*;

public class Problem_3_¤å¦rª½±Æ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String line = sc.nextLine();
			String spl = sc.nextLine();
			int row = Integer.parseInt(sc.nextLine());
			LinkedList<String> link = new LinkedList<String>();
			for (int nth = 0; nth < line.length(); nth += row) {
				if ((nth + row) > line.length()) {
					link.add(line.substring(nth, line.length() - 1));
				} else {
					link.add(line.substring(nth, nth + row));
				}

			}
			for (int n = 0; n < row; n++) {
				for (int nth = link.size()-1; nth >=0; nth--) {

					if (n > link.get(nth).length())
						System.out.print(" ");
					else
						System.out.print(link.get(nth).substring(n, n + 1));
					if (nth != 0) {
						System.out.print(spl);
					}
				}
				System.out.println();
			}

		}
	}

}
