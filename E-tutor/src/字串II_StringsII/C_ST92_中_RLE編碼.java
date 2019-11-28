package ¶r¶ÍII_StringsII;
import java.util.*;

public class C_ST92_§§_RLEΩsΩX {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char[] input=sc.nextLine().toCharArray();
		char str=input[0];
		int count=1;
		for(int index=1;index<input.length;index++) {
			if(input[index]==str)count++;
			else {
				System.out.print(String.valueOf(str)+count);
				str=input[index];
				count=1;
			}
		}
		System.out.print(String.valueOf(str)+count);		
		System.out.println();
			

	}

}
