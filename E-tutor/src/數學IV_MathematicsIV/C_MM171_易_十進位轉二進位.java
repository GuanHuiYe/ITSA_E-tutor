package 數學IV_MathematicsIV;
import java.util.*;
import java.lang.*;

public class C_MM171_易_十進位轉二進位 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true) {
			int input=Integer.parseInt(sc.nextLine());
			if(input==0)break;
			String ans=Integer.toBinaryString(input);
			System.out.printf("%0"+(8-ans.length())+"d%S\n",0,ans);
			
		}

	}

}
