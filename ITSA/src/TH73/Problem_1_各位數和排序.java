package TH73;

import java.util.*;

public class Problem_1_各位數和排序 {

	public static class item {
		public String str;
		public Long count;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		String[] strArr = sc.nextLine().split(" ");
		item[] ans = new item[num];

		for (int n = 0; n < strArr.length; n++) {			
			ans[n]=new item();
			ans[n].str = strArr[n];
			ans[n].count = (long) 0;
			char[] charArr = strArr[n].toCharArray();
			for (char item : charArr) {
				ans[n].count += Integer.parseInt(String.valueOf(item));
			}	
		}

		for(int n=0;n<ans.length-1;n++) {
			for(int nn=0;nn<ans.length-n-1;nn++) {
				if(ans[nn].count>ans[nn+1].count) {
					item temp=ans[nn+1];
					ans[nn+1]=ans[nn];
					ans[nn]=temp;
				}
				else if(ans[nn].count==ans[nn+1].count) {
					if(Integer.parseInt(ans[nn].str)>Integer.parseInt(ans[nn+1].str)) {
						item temp=ans[nn+1];
						ans[nn+1]=ans[nn];
						ans[nn]=temp;
					}
				}
			}
		}
		for(int n=0;n<ans.length;n++) {
			System.out.print(ans[n].str);
			if(n==ans.length-1) {
				System.out.println();
			}
			else {
				System.out.print(" ");
			}
		}
		

	}

}
