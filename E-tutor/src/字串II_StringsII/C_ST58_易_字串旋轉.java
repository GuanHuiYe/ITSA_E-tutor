package ¦r¦êII_StringsII;
import java.util.*;
public class C_ST58_©ö_¦r¦ê±ÛÂà {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			String ans="abcdefghijklmnopqrstuvwxyz";
			String[] input=sc.nextLine().split(" ");
			for(String item:input) {
				int shift=Integer.parseInt(item);
				if(shift>0) {
					String sub=ans.substring(0,shift);
					ans=ans.substring(shift)+sub;
				}
				else if(shift<0) {					
					String sub=ans.substring(ans.length()+shift,ans.length());
					ans=sub+ans.substring(0,ans.length()+shift);
				}
			}
			System.out.println(ans);
		}
	}

}
