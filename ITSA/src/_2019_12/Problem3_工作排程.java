package _2019_12;
import java.util.*;

public class Problem3_工作排程 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		for (int nth = Integer.parseInt(sc.nextLine()); nth > 0; nth--) {
		String[] input=sc.nextLine().split(" ");
		int ans=0;
		int[] num=new int[input.length-2];
		for(int index=1;index<input.length-1;index++) {
			num[index-1]=Integer.parseInt(input[index]);
		}
		
		if(input[input.length-1].equals("B")) {			
			Arrays.sort(num);
		}
		
		
		for(int index=0;index<num.length;index++) {
			int sum=0;
			for(int n=0;n<index;n++) {
				sum+=num[n];
			}
			ans+=sum;
		}
		System.out.println(ans);
		}
	}

}
