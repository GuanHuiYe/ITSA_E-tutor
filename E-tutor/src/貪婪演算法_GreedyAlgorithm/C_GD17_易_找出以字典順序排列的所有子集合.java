package 貪婪演算法_GreedyAlgorithm;
import java.util.*;
public class C_GD17_易_找出以字典順序排列的所有子集合 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str[] = sc.nextLine().split(" ");

		int nCnt = str.length;

		int nBit = (0xFFFFFFFF >>> (32 - nCnt));
		System.out.println("{}");
		String ans="";
		String ansfix="";
		Queue<String> qu=new LinkedList<String>();
		for (int i = 1; i <= nBit; i++) {
			
			for (int j = 0; j < nCnt; j++) {
				if ((i << (31 - j)) >> 31 == -1) {
					ans+=str[j];
				}
			}
			ansfix="{";
			for(int n=0;n<ans.length();n++) {
				ansfix+=ans.substring(n,n+1);
				if(n<ans.length()-1) {
					ansfix+=",";
				}
			}
			ansfix+="}";
			qu.offer(ansfix);
			ans="";
			ansfix="";
		}
		

	}

}
