package 數學II_MathematicsII;

import java.util.*;

public class C_MM064_中_公司每年獲利問題 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Double Revenue = 50000.0;
		Double R_Up = 0.36;
		Double cost = 10000.0;
		Double C_Up = 0.02;
		Double US = 35.2;
		Double US_Up = -0.2;
		int year = Integer.parseInt(sc.nextLine());
		for (int nth = year; nth > 0; nth--) {
			Revenue+=Revenue*R_Up;
			cost+=cost*C_Up;
			US+=US_Up;
		}
		System.out.println("The Company will earn " +(int)Math.floor( (Revenue-cost) / US )+ " US dollars after " + year + " year");
	}

}
