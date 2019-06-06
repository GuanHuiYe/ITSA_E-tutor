package TH62;
import java.util.*;
public class Problem4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int nth = Integer.parseInt(sc.nextLine()); nth > 0; nth--) {
			int n = Integer.parseInt(sc.nextLine());
	        int [] pk = new int[n];
	        String[] in = sc.nextLine().split(" ");
	               
	        for(int i=0; i<n; i++){
	        	pk[i] = Integer.parseInt(in[i]);
	        }
	        int ans = pk[0];
	        for(int i=1; i<n; i++){
	        	ans^=pk[i];
	        }	        
	        if(ans==0)
	            System.out.println("yes");
	        else
	            System.out.println("no");
		}
	}

}
