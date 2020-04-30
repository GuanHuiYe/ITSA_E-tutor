package 數學III_MathematicsIII;

import java.util.*;

public class C_MM102_易_小蝸牛 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] Nstr = sc.nextLine().split(" ");
		String[] Rstr = sc.nextLine().split(" ");
		String[] Dstr = sc.nextLine().split(" ");
		double N = GetCM(Nstr), R = GetCM(Rstr), D = GetCM(Dstr);
		int day = 0;
		double cm = 0;
		while (cm < N) {
			cm += R;
			cm -= D;
			day++;
		}
		System.out.println(day);
	}

	public static double GetCM(String[] str) {
		if (str[1].equals("cm"))
			return Double.parseDouble(str[0]);

		return Double.parseDouble(str[0]) * 100;
	}

}
