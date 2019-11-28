package ¶r¶ÍII_StringsII;

import java.util.*;

public class C_ST71_§§_¶r¶Í≤’¶X {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> al = new ArrayList<String>();
		String input = sc.nextLine();
		for (int si = 0; si < input.length(); si++) {
			for (int ei = si + 1; ei < input.length() + 1; ei++) {
				String item = input.substring(si, ei);
				if (!al.contains(item))
					al.add(item);
			}
		}
		Object[] ans=al.toArray();
		Arrays.sort(ans);
		for (Object item : ans) {
			System.out.println(item);
		}
	}

}
