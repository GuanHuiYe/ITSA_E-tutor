package TH60;

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int nend=sc.nextInt();
		for(int n=0;n<nend;n++) {
			int year=sc.nextInt();
			if(year%4==0) {
				if(year%100==0) {
					if(year%400==0) {
						System.out.println("Bissextile Year");
					}
					else {
						System.out.println("Common Year");	
					}
					
				}
				else {
					System.out.println("Bissextile Year");
				}
				
			}
			else {
				System.out.println("Common Year");
			}
		}
	}

}
