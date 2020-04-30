package 字串II_StringsII;

import java.util.*;

public class C_ST66_易_文字直排 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String insert = sc.nextLine();
		int size = Integer.parseInt(sc.nextLine());
		int width=input.length()/size;
		if(input.length()%size>0)width+=1;
		String[][] ansArr =new String[size][width];
		for(int x=width-1;x>=0;x--) {
			for(int y=0;y<size;y++) {
				ansArr[y][x]=input.substring(0,1);
				input=input.substring(1);
			}
		}
		for(int y=0;y<size;y++) {
			for(int x=0;x<width;x++) {
				System.out.print(ansArr[y][x]);
				if(x!=width-1)System.out.print(insert);
			}
			System.out.println();
		}
				

	}

}
