package 字串II_StringsII;

import java.util.*;

public class C_ST95_易_文章加密 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> al = new ArrayList<String>();
		al.add("a");
		al.add("e");
		al.add("i");
		al.add("o");
		al.add("u");
		for (int nth = Integer.parseInt(sc.nextLine()); nth > 0; nth--) {
			char[] input = sc.nextLine().toCharArray();
			String str = "";
			String ans = "";
			for (char item : input) {
				if (Character.isLetter(item))
					str += String.valueOf(item);
				else {
					if (!al.contains(str.substring(0, 1).toLowerCase())) {
						ans += str.substring(1) + str.substring(0, 1);
					}
					else {
						ans+=str;
					}
					str = "";
					ans+="ay"+String.valueOf(item);
				}
			}
			if(str.length()>0) {
				if (!al.contains(str.substring(0, 1).toLowerCase())) {
					ans += str.substring(1) + str.substring(0, 1)+"ay";
				}
				else {
					ans+=str+"ay";
				}	
			}
				
		
			System.out.println(ans);
		}

	}

}
