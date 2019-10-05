package ºî¦X_Comprehensive;

import java.util.*;

public class C_CH10_¤¤_The3n¥[1problem {
	public static TreeMap<Integer, ArrayList<Integer>> TM;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TM = new TreeMap<Integer, ArrayList<Integer>>();

		while (sc.hasNext()) {
			String[] input = sc.nextLine().split(" ");
			if(Integer.parseInt(input[0])>Integer.parseInt(input[1])) {
				String temp=input[0];
				input[0]=input[1];
				input[1]=temp;
			}
			int max_cyclelength = 0;
			for (int num = Integer.parseInt(input[0]); num <= Integer.parseInt(input[1]); num++) {
				int CL = getCycleLength(num);
				if (CL > max_cyclelength)
					max_cyclelength = CL;
			}
			System.out.println(input[0] + " " + input[1] + " " + max_cyclelength);
		}
	}

	public static int getCycleLength(int num) {
		if (TM.containsKey(num))
			return TM.get(num).size();
		else {
			TM.put(num, new ArrayList<Integer>());
			int n = num;
			while (true) {
				TM.get(num).add(num);
				if (n == 1)
					break;
				if (n % 2 != 0)
					n = 3 * n + 1;
				else
					n = n / 2;
			}
			return TM.get(num).size();
		}
	}

}
