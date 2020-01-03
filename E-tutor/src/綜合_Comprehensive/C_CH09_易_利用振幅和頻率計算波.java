package 綜合_Comprehensive;
import java.util.*;

public class C_CH09_易_利用振幅和頻率計算波 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String ans="";
		for(int nth=Integer.parseInt(sc.nextLine());nth>0;nth--) {
			int A=Integer.parseInt(sc.nextLine());
			int F=Integer.parseInt(sc.nextLine());
			while(--F>=0) {
				for(int n=1;n<=A;n++) {
					for(int i=0;i<n;i++) {
						ans+=n;
					}
					ans+="\n";
				}
				for(int n=A-1;n>=1;n--) {
					for(int i=0;i<n;i++) {
						ans+=n;
					}
					ans+="\n";
				}
				ans+="\n";
			}
			
		}
		System.out.println(ans.substring(0,ans.length()-2));
	}

}
