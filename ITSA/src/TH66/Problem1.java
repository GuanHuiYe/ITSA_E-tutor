package TH66;
import java.util.*;
public class Problem1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			String[] input=sc.nextLine().split(" ");
			int[] num=new int[input.length];
			for(int n=0;n<input.length;n++) {
				for(int n2=0;n2<input.length;n2++) {
					if(n!=n2) {
						if(input[n].equals(input[n2])) {
							num[n2]++;
						}
					}
					
				}
			}
			String maxnum =input[0];
			int maxnumindex =0;
			for(int n=1;n<num.length;n++) {
				if(num[maxnumindex]<num[n]) {
					maxnum=input[n];
					maxnumindex = n;
				}
			}
			if(num[maxnumindex]>=(int)(input.length/2)) {
				System.out.println(maxnum);
			}
			else {
				System.out.println("NO");
			}
		
		}
	}

}
