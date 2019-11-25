package 字串_Stringsc;
import java.util.*;

public class C_ST42_易_子字串出現次數 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char[] Search=sc.nextLine().toCharArray();
		char[] input=sc.nextLine().toCharArray();
		int ans=0;
		for(int index=0;index<=input.length-Search.length;index++) {
			if(input[index]==Search[0]) {
				Boolean test=true;
				for(int i=1;i<Search.length;i++) {
					if(input[index+i]!=Search[i]) {
						test=false;
						break;
					}
				}
				if(test)ans++;
			}
		}
		System.out.println(ans);

	}

}
