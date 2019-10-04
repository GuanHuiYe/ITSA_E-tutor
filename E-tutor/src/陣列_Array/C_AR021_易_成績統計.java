package 陣列_Array;
import java.util.*;
public class C_AR021_易_成績統計 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int mans=Integer.parseInt(sc.nextLine());	
		double[] ans=new double[4];
		for(int n=mans;n>0;n--) {
			String[] input=sc.nextLine().split(" ");			
			ans[1]+=Integer.parseInt(input[0]);
			ans[2]+=Integer.parseInt(input[1]);
			ans[3]+=Integer.parseInt(input[2]);			
		}
		System.out.printf("%.1f ",(double)(ans[1]+ans[2]+ans[3])/(double)(3*mans));
		System.out.printf("%.1f ",(double)ans[1]/(double)mans);
		System.out.printf("%.1f ",(double)ans[2]/(double)mans);
		System.out.printf("%.1f\n",(double)ans[3]/(double)mans);
	}

}
