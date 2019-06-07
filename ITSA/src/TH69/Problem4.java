package TH69;
import java.util.*;
public class Problem4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int nth=Integer.parseInt(sc.nextLine());nth>0;nth--) {
			String input=sc.nextLine();
			int n=0;
			while(n!=input.length()) {
				String str=input.substring(n, n+1);
				
				if(str.equals("a")) {
					String newstr="";
					for(int n1=input.length()-1;n1>n;n1--) {
						newstr+=input.substring(n1,n1+1);
					}
					input=input.substring(0,n+1)+newstr;
					
					
				}
				else if(str.equals("b")) {
					
					input+=input.substring(n+1,input.length());
					
				}
				else if(str.equals("c")) {
					
						if(n>input.length()-3) {
							input=input.substring(0,n+1);
						}				
						else {
							input=input.substring(0,n+1)+input.substring(n+3,input.length());
							
						}						
						
				}
				n++;
				//bcddd
				//bcdddcddd
				//bcdcddd
				//bcdcd
			}
			System.out.println(input);
		}

	}

}
