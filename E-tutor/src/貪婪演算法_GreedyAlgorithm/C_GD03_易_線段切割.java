package 貪婪演算法_GreedyAlgorithm;
import java.util.*;
public class C_GD03_易_線段切割 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			int n=sc.nextInt();
			int count=0;
			long m=0;
			for(int i=1;;i++) {
				m+=i;
				if(m<=n) {
					count++;
				}
				else {
					break;
				}
			}
			System.out.println(count);
		}
	}

}
