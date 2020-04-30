package TH71;

import java.util.*;

public class Problem3_最大單調遞減數字子序列 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String input = sc.nextLine();
			String ans = "";
			String Max = "";
			while (!Max.equals("0") && input.length() >= ans.length()) {
				Max = Max(input);
				String newans = sortString(input.substring(input.indexOf(Max), input.length()));
				if (newans.length() > ans.length())
					ans = newans;
				input = input.replace(Max, "");
			}
			System.out.println(ans);
		}
	}

	public static String Max(String input) {
		int Max = 0;
		for (int index = 0; index < input.length(); index++) {
			if (Integer.parseInt(input.substring(index, index + 1)) > Max)
				Max = Integer.parseInt(input.substring(index, index + 1));
		}
		return String.valueOf(Max);
	}

	public static String sortString(String input) {
		for (int index = 1; index < input.length(); index++) {
			int origin = Integer.parseInt(input.substring(index - 1, index));
			int step = Integer.parseInt(input.substring(index, index + 1));
			if (origin < step)
				input = input.substring(0, index) + input.substring(index + 1, input.length());
		}
		return input;
	}
	
	public static Boolean test(String input) {
		for(int n=1;n<input.length();n++) {
			if(Integer.parseInt(input.substring(n-1, n))<Integer.parseInt(input.substring(n, n+1))) return false;
		}
		return true;
	}

}
