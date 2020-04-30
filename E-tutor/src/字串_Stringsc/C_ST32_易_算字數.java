package 字串_Stringsc;
import java.util.*;

public class C_ST32_易_算字數 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	
		 while(true) {
			 String input=sc.nextLine();
			 if(input.equals("-1"))break;
			 String[] splitStr=input.split(" ");	
			 int ans=splitStr.length;
			 for(String item:splitStr) {
				 Boolean flag=false;
				 for(char c : item.toCharArray()) {
					 if(isEnPunc(c)) {
						 ans++;
						 flag=true;
					 }
					 else {
						 if(flag) {
							 ans++;
							 flag=false;
						 }
					 }
				 }
			 }
			 System.out.println(ans);
		 }

	}
	
	public static boolean isEnPunc(char ch){  
        if (0x21 <= ch && ch <= 0x22) return true;  
      if (ch == 0x27 || ch == 0x2C) return true;  
      if (ch == 0x2E || ch == 0x3A) return true;  
      if (ch == 0x3B || ch == 0x3F) return true;  
  
      return false;  
    } 


}
