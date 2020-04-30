package TH65;
import java.util.*;
public class Problem5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true) {
			String[] in=sc.nextLine().split("　");
			if(in[0].equals("0")&&in[1].equals("0")) {
				break;
			}
			int nth=0;
			int sum=0;
			for(int n=1;n<7;n++) {				
				for(int n1=1;n1<7;n1++) {
					
						sum++;
						System.out.println(n+" "+n1);
						//if((n+n1)==2) {
						//	System.out.println(n+" "+n1);
						//	nth++;
						//}
					
				}
			}
			System.out.println(nth+" "+sum+" "+(double)nth/(double)sum);
			
			
		}
		
		

	}
	
	

}
