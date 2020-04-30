package 陣列_Array;

import java.util.*;

public class C_AR17_中_不同基底整數轉換 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int ori = Integer.parseInt(sc.nextLine());
		int to = Integer.parseInt(sc.nextLine());
		try {
			System.out.printf("%S\n", Long.toString(Long.parseLong(Integer.valueOf(input, ori).toString()), to));
		}
		catch(Exception e) {
			System.out.println("Input Error");
		}
	}
}
