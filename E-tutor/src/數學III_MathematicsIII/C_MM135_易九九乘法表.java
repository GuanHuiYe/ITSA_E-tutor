package 數學III_MathematicsIII;

import java.util.*;

public class C_MM135_易九九乘法表 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int nth=Integer.parseInt(sc.nextLine());
		String[] input=new String[nth];
		
		for(int n=0;n<nth;n++) {
			input[n]=sc.nextLine();
		}
		
		for(int n=0;n<nth;n++) {
			String[] data=input[n].split(" ");
			int start=Integer.parseInt(data[0]);
			int end=Integer.parseInt(data[1]);
			if(end-start<5) {
				printtable(start,end);
				if(n==nth-1) {
					
				}
				else {
					System.out.println("\n");
				}
				
			}
			else {
				while(true) {
					if(end-start<5) {
						printtable(start,end);
						System.out.println("\n");
						break;
					}
					else {
						printtable(start,start+4);
						start+=5;
						System.out.println("\n");
					}
				}
			}
		}

	}
	public static void printtable(int start,int end) {
		for(int b=1;b<10;b++) {
			for(int a=start;a<=end;a++) {
				System.out.print(a+" * "+b+" = ");
				if((a*b)/10==0) {
					System.out.print(" "+(a*b));
				}
				else {
					System.out.print(a*b);
				}
				if(a!=end) {
					System.out.print("     ");					
				}
			}
			System.out.println();
		}
		return;
	}

}
