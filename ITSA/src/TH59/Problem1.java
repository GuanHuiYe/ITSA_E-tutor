package TH59;

import java.util.Arrays;
import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int n = Integer.parseInt(sc.nextLine()); n > 0; n--) {
			String[] in=sc.nextLine().split(" ");
			String[] intwo=sc.nextLine().split(" ");
			int[] tmk =arraybooltoint(intwo);
			int count=0;
			for(int nn=0;nn<Integer.parseInt(in[1]);nn++) {
				count+=tmk[nn];
			}
			if(Integer.parseInt(in[0])>=count) {
				System.out.println(count);
			}
			else {
				System.out.println("Impossible");
				
			}
			
			
		}
	}
	public static int[] arraybooltoint(String [] arraystr) {
		int [] intarrray =new int[arraystr.length];
		for(int i =0;i<arraystr.length;i++)
		{
			intarrray[i]=Integer.parseInt(arraystr[i]);
		}
		Arrays.sort(intarrray);
		return intarrray;
	}

}
