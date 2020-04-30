package 字串III_StringsIII;
import java.util.*;

public class C_ST123_易_是迴文吧 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int ans=0;
		for(int nth=Integer.parseInt(sc.nextLine());nth>0;nth--) {
			Boolean test=true;
			String inputStr=sc.nextLine().toLowerCase();
			char[] input=inputStr.toCharArray();				
			for(int index=0;index<input.length/2;index++) {
				if(input[index]!=input[input.length-1-index]) {
					test=false;
					break;
				}
			}
			if(test)ans++;
		}
		System.out.println(ans);

	}

}
