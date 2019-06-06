package TH64;
import java.util.*;
public class Problem4樹的走訪方式 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			String[] in=sc.nextLine().split(" "); 
			int[] input=constrarr(in);
			int height=0;
			for(int n=0;n<input.length;n+=3) {
				if(input[n+1]==1||input[n+2]==1) {
					height++;
				}
				
			}
			for(int n=0;n<input.length;n+=3) {
				
			}
		}
	}
	public static int[] constrarr(String[] in) {
		int[] ans=new int[in.length];
		int nth=0;
		for(String input:in) {
			ans[nth]=Integer.parseInt(input);
			nth++;
		}
		return ans;
	}

}
