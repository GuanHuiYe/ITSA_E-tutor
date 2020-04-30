package 字串_Stringsc;

import java.util.*;

public class C_ST37_中_字串比對 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] input = sc.nextLine().toCharArray();
		char[] searchInput = sc.nextLine().toCharArray();
		int index = -1;
		for (int i = 0; i <= input.length - searchInput.length; i++) {
			if (input[i] == searchInput[0]) {
				Boolean test = true;
				for(int si=1;si<searchInput.length;si++) {
					if(input[i+si]!=searchInput[si]) {
						test=false;
						break;
					}						
				}
				if(test) {
					index=i;
					break;
				}
			}
		}
		System.out.println(index);

	}

}
