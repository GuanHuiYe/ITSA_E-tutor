package 字串_Stringsc;
import java.util.*;
import java.lang.*;

public class C_ST50_中_Token切割及統計 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String splitStr=sc.nextLine();
		String Token=sc.nextLine();
		String str=sc.nextLine();
		String[] NewStr=str.split("["+splitStr.substring(1,splitStr.length())+"]+");
		int ans=0;
		for(String item:NewStr) {
			if(item.toLowerCase().equals(Token.toLowerCase())) 
				ans++;
		}
		System.out.println(ans);

	}

}
