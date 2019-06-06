package TH72;

import java.util.*;

public class Problem_4_¤å³¹¬d¸ß {

	public static class TextIteam {
		public String text;
		public String leftText;
		public String rightText;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			String P = sc.nextLine().toLowerCase();
			int N = Integer.parseInt(sc.nextLine());
			String S = sc.nextLine();
			String text = sc.nextLine().toLowerCase();

			LinkedList<TextIteam> searchList = new LinkedList<TextIteam>();

			int aimsIndex = text.indexOf(P);
			while (true) {

				if (aimsIndex == -1)
					break;

				TextIteam iteam = new TextIteam();

				iteam.text = P.toUpperCase();
				iteam.leftText = "";
				iteam.rightText = "";
				String[] leftStrArray = text.substring(0, aimsIndex - 1).split(" ");
				for (int index = leftStrArray.length - 1; index >= 0; index--) {
					iteam.text = leftStrArray[index] + " " + iteam.text;
					iteam.leftText = leftStrArray[index] + (index == leftStrArray.length - N ? "" : " ");
					if (index == leftStrArray.length - N)
						break;

				}

				if (aimsIndex + P.length() + 1 < text.length()) {
					String[] rightStrArray = text.substring(aimsIndex + P.length() + 1, text.length()).split(" ");
					for (int index = 0; index < rightStrArray.length; index++) {
						iteam.text += " " + rightStrArray[index];
						iteam.rightText += (index == 0 ? "" : " ") + rightStrArray[index];
						if (index == N - 1)
							break;

					}
				}

				searchList.add(iteam);
				aimsIndex = text.indexOf(P, aimsIndex + 1);
			}

			TextIteam[] ansArray = searchList.toArray(new TextIteam[searchList.size()]);

			if (S.equals("L")) {

				for (int n = 0; n < ansArray.length - 1; n++) {
					for (int nn = 0; nn < ansArray.length - n - 1; nn++) {
						if (ansArray[nn].leftText.compareTo(ansArray[nn + 1].leftText) > 0) {
							TextIteam temp = ansArray[nn];
							ansArray[nn] = ansArray[nn + 1];
							ansArray[nn + 1] = temp;
						}
					}
				}

			} else {

				for (int n = 0; n < ansArray.length - 1; n++) {
					for (int nn = 0; nn < ansArray.length - n - 1; nn++) {
						if (ansArray[nn].rightText.compareTo(ansArray[nn + 1].rightText) > 0) {
							TextIteam temp = ansArray[nn];
							ansArray[nn] = ansArray[nn + 1];
							ansArray[nn + 1] = temp;
						}
					}
				}

			}

			for (TextIteam ans : ansArray) {
				System.out.println(ans.text);
			}

		}

	}

}
