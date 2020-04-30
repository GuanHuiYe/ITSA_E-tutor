package 字串III_StringsIII;
import java.util.*;

public class C_ST114_易_LED數字顯示 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input="";
//		int count=0;
		while(sc.hasNext()) {
			input+=sc.nextLine();
//			if(++count==6)break;
		}
		while(true) {
			if(input.length()>8) {
				String tmpStr=input.substring(0,8);
				input=input.substring(8);
				int num=0;
				for(char b:tmpStr.toCharArray()) {
					num<<=1;
					if(b=='1') 
						num|=1;
				}
				System.out.println(num);
			}
			else {
				while(input.length()<8) {
					input+="0";
				}
				int num=0;
				for(char b:input.toCharArray()) {
					num<<=1;
					if(b=='1') 
						num|=1;
				}
				System.out.println(num);
				break;
			}
		}

	}

}
