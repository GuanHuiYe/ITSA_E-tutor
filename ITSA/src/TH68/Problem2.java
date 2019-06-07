
package TH68;

import java.math.BigInteger;
import java.util.*;

public class Problem2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String inputstr=sc.nextLine();
		BigInteger input = new BigInteger(inputstr) ;
		boolean test=false;
		
		
		
		
		
		
		String fixinput=inputstr.substring(0, 1);
		for(int n=0;n<inputstr.length()-1;n++) {
			fixinput+="0";
		}		
		for(BigInteger n=new BigInteger(fixinput);n.compareTo(input)==-1;n=n.add(new BigInteger("1"))) {
			if(input.compareTo(s( String.valueOf(n)) )==0) {
				System.out.println(n);
				test=true;
				break;
			}
		}
		if(!test) {
			System.out.println("-1");
		}

	}
	public static BigInteger s(String num) {
		
		BigInteger s=new BigInteger("0");
		boolean test=false;
		while(num.length()>1||test) {
			BigInteger val=new BigInteger(num);
			s=s.add(val);
			if(num.length()!=1) {
				num=num.substring(0, num.length()-1);			
				test=true;
			}
			else{
				test=false;
			}	
			
			
		}
		
		return s;
	}

	public static String ans(int n) {
		String ans="";
		for(int n1=0;n1<=9;n1++) {
			ans= String.valueOf(n1);
		}
		return ans;
	}
}
