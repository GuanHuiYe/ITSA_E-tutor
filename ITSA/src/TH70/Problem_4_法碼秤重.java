package TH70;

import java.util.*;

public class Problem_4_法碼秤重 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int nth = Integer.parseInt(sc.nextLine()); nth > 0; nth--) {
			String[] nm = sc.nextLine().split(" ");
			String[] nweight = sc.nextLine().split(" ");
			int[] n=new int[nweight.length];
			for (int nn=0;nn<nweight.length;nn++) {
				n[nn] =Integer.parseInt(nweight[nn]);
			}
			String[] item = sc.nextLine().split(" ");
			int sum = 0;
			for (int nn = 0; nn < item.length; nn++) {

				if (test(Integer.parseInt(item[nn]), n)) {
					sum++;
				}
			}
			System.out.println(sum);

		}
	}

	public static Boolean test(int weight, int[] strs) {
		int n = strs.length;
		int nbit = 1 << n;
		for (int i = 0; i < nbit; i++) {			
			int sum=0;
			for (int j = 0; j < n; j++) {
				int tmp = 1 << j;
				if ((tmp & i) != 0) {
					sum+=strs[j];
					
				}
			}	
		
			if(weight==sum) {
				
				return true;
			}
		}
		return false;
	}

}
