package TH63;

import java.util.*;

public class Problem2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int n = Integer.parseInt(sc.nextLine()); n > 0; n--) {
			char[] in=sc.nextLine().toCharArray();			
			int a=0,b=0;
			for(int nn=0;nn<in.length;nn++) {
				if(in[nn]=='(') {
					a++;
				}
				else {
					b++;
				}
				
			}
			if(a==b) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
		}
	}

}
