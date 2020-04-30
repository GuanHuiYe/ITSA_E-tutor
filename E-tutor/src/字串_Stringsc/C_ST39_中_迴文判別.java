package 字串_Stringsc;
import java.util.*;

public class C_ST39_中_迴文判別 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Boolean test=true;
		String inputStr=sc.nextLine();
		char[] input=inputStr.toCharArray();				
		for(int index=0;index<input.length/2;index++) {
			if(input[index]!=input[input.length-1-index]) {
				test=false;
				break;
			}
		}
		System.out.println(inputStr+" is "+(test?"":"not ")+"a palindrome.");

	}

}
