package 陣列_Array;
import java.util.*;
public class C_AR46_易_陣列平方和問題 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[] input=sc.nextLine().split(" ");
		double ans=0.0;
		for(int index=0;index<input.length;index++) {
		ans+=Math.pow(Double.parseDouble(input[index])*1000000,2);
		}
		ans=(double)Math.round(ans)/1000000.0;
		System.out.printf("%.6f\n",ans);
	}

}
