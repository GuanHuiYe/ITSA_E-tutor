package ��X_Comprehensive;
import java.util.*;

public class C_CH06_��_�P�_��J�ܼƪ��Φ� {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			String input=sc.nextLine();
			String ans="";			
			try {				
				Double num=Double.parseDouble(input);
				if(num*10%10>0) {
					ans="float";
				}
				else {
					ans="int";
				}
			}
			catch(Exception ex) {
				try {
					if(input.length()==1) {
						ans="char";
					}
					else {
						ans="string";
					}
				}
				catch(Exception e) {
					
				}
			}			
			System.out.println(ans);
			
		}

	}

}
