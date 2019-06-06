package TH58;

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int nn=0;nn<n;nn++) {
			int a=0;
			int test=sc.nextInt();
			for(int nnn=0;nnn<=test;nnn++) {
				if(nnn%3==0) {
					a+=nnn;
				}
			}
			System.out.println(a);
		}

	}

}
