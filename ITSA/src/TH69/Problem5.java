package TH69;
import java.util.*;
public class Problem5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		for(int nth=Integer.parseInt(sc.nextLine());nth>0;nth--) {
			String[] nm=sc.nextLine().split(" ");
			int[] m=new int[Integer.parseInt(nm[1])+1];
			
			int[][] test=new int[Integer.parseInt(nm[0])][Integer.parseInt(nm[1])+1];
			for(int n=0;n<Integer.parseInt(nm[0]);n++) {
				String[] nl=sc.nextLine().split(" ");
				for(int nn=1;nn<nl.length;nn++) {
					if(Integer.parseInt(nl[nn])<0) {
						test[n][Integer.parseInt(nl[nn])]=2;
					}
					else {
						test[n][Integer.parseInt(nl[nn])]=1;
					}					
				}
				System.out.println();
				
			}
		}

	}

}
