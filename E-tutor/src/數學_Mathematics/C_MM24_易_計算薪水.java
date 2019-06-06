package 數學_Mathematics;
import java.util.*;
public class C_MM24_易_計算薪水 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[] in=sc.nextLine().split(" ");
		int t=Integer.parseInt(in[0]);
		int m=Integer.parseInt(in[1]);
		double ans=0;
		if(t<=60) {
			ans=t*m;
		}
		else if(t<=120) {
			ans=60*m+(t-60)*(m*1.33);
		}
		else {
			ans=60*m+60*(m*1.33)+(t-120)*(m*1.66);
		}
		System.out.println(ans);
	}

}
