package 字串II_StringsII;
import java.util.*;

public class C_ST54_中_最長相同數字子數列 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			char[] input=sc.nextLine().toCharArray();
			String MaxStr="";
			String TmpStr="";
			char ch=0;
			for(int index=0;index<input.length;index++) {
				char item=input[index];
				if(item!=ch) {
					if(TmpStr.length()>MaxStr.length()) 
						MaxStr=TmpStr;
					else if(TmpStr.length()==MaxStr.length())
						if(TmpStr.compareTo(MaxStr)>0)
							MaxStr=TmpStr;
					
					ch=item;
					TmpStr="";
				}
				TmpStr+=String.valueOf(item);
				if(index==input.length-1) {
					if(TmpStr.length()>MaxStr.length()) 
						MaxStr=TmpStr;
					else if(TmpStr.length()==MaxStr.length())
						if(TmpStr.compareTo(MaxStr)<0)
							MaxStr=TmpStr;
				}
			}
			System.out.println(MaxStr);
		}

	}

}
