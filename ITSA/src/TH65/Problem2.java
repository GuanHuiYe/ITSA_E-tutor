package TH65;
import java.util.*;
public class Problem2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true) {
			String in=sc.nextLine();
			if(in.equals("0")) {
				break;
			}
			
			double ans=4;
			int nth=1;
			boolean test=true;
			
			for(double n=3;nth<Integer.parseInt(in);n+=2) {
				if(Integer.parseInt(in)==1) {
					break;
				}
				if(test) {
					ans-=4/n;
				}
				else {
					ans+=4/n;
				}
				test=!test;
				nth++;
			}
			System.out.printf("%.5f\n",ans);
			
		}
	}

}
