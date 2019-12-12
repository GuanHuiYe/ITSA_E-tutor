package _2019_12;
import java.util.*;

public class Problem5_¤À¼Æ­pºâ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		for (int nth = Integer.parseInt(sc.nextLine()); nth > 0; nth--) {
			String[] input=sc.nextLine().split(",");
			String[] a=input[0].split("/");
			int A1=Integer.parseInt(a[0]) ,A2=Integer.parseInt(a[1]);
			String[] b=input[1].split("/");
			int B1=Integer.parseInt(b[0]),B2=Integer.parseInt(b[1]);
						
			ans(A1*B2+B1*A2,A2*B2,A2);
			ans(A1*B2-B1*A2,A2*B2,A2);
			ans(A1*B1,A2*B2,A2);
			ans(A1*B2,A2*B1,A2);
			
		}

	}
	public static void ans(int a,int b,int c) {
		for(int i=c;i>1;i--){
	    	while(true){
	    		if(a % i==0 && b % i==0){
	    			 a/=i;
	    			 b/=i;
	    		}
	    		else break;
	    	}
	    }
		 System.out.println(a+"/"+b);
	}
	

}
