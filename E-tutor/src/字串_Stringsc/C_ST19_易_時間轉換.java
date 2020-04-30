package 字串_Stringsc;

import java.util.*;

public class C_ST19_易_時間轉換 {
	public static TreeMap<String, Integer> MAP = new TreeMap<String, Integer>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MAP.put("TW", 0);
		MAP.put("USW", -14);
		MAP.put("USE", -12);
		MAP.put("USC", -13);
		MAP.put("JA", 1);
		MAP.put("UK", -8);
		for (int nth = Integer.parseInt(sc.nextLine()); nth > 0; nth--) {
			String[] input = sc.nextLine().split(" ");
			String[] ans=ChangeTime(input[0],input[1],input[2]);
			System.out.println(ans[0]+" "+ans[1]);
		}
	}

	public static String[] ChangeTime(String Time, String oriCountry, String changeCountry) {
		int Hour = Integer.parseInt(Time.substring(0, 2));
		int Minute = Integer.parseInt(Time.substring(2, Time.length()));
		int Shift = 0;
		if (oriCountry.equals("TW")) {
			Shift = MAP.get(changeCountry);
		}
		else if (changeCountry.equals("TW")) {
			Shift = MAP.get(oriCountry) * -1;
		}
		else {
			String[] changeTW=ChangeTime(Time,oriCountry,"TW");
			return ChangeTime(changeTW[0],changeTW[1],changeCountry);
		}
		
		Hour += Shift;
		if (Hour >= 24)
			Hour -= 24;
		else if (Hour < 0)
			Hour += 24;
		return new String[] { String.format("%02d", Hour)+String.format("%02d", Minute), changeCountry };
	}

}
