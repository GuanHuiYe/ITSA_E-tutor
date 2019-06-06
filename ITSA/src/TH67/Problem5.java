package TH67;
import java.util.*;
public class Problem5 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			String[] input=sc.nextLine().split(" ");
			int[][] arr=new int[Integer.parseInt(input[0])][Integer.parseInt(input[1])];
			for(int n=0;n<arr.length;n++) {
				String[] input2=sc.nextLine().split(" ");
				for(int n2=0;n2<arr[n].length;n2++) {
					arr[n][n2]=Integer.parseInt(input2[n2]);
				}
			}
			System.out.println(ans(0,0,arr,0));
		}
		
	}	
	public static int ans(int x,int y,int[][] arr,int sum) {
		if(x>=arr.length||y>=arr.length||x<0||y<0) {
			System.out.println(x+" "+y);
			return 0;
		}
		
		System.out.println(x+" "+y);
		sum+=arr[x][y];
		
		
		int anssum=0;
		int[] sumarr=new int[4];
		sumarr[0]=ans(x+1,y,arr,sum);
		sumarr[1]=ans(x,y+1,arr,sum);
		sumarr[2]=ans(x-1,y,arr,sum);
		sumarr[3]=ans(x,y-1,arr,sum);
		for(int n=0;n<sumarr.length-1;n++) {
			if(sumarr[n]<sumarr[n+1]) {
				anssum=sumarr[n];
			}
			else {
				anssum=sumarr[n+1];
			}
		}
		return anssum;
	}
	
	

}
