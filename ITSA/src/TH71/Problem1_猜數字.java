package TH71;

import java.util.*;

public class Problem1_猜數字 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();	
		while(true) {
			String aims=sc.nextLine();
			if(aims.equals("0000"))break;
			int a=0,b=0;
			for(int index =0;index<aims.length();index++) {
				int aimsIndex=input.indexOf(aims.substring(index, index+1));
				if(aimsIndex>-1) {
					if(aimsIndex==index)a++;
					else b++;
				}
			}
			System.out.println(a+"A"+b+"B");
		}

	}

}
