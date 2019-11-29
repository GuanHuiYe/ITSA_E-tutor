package 數學II_MathematicsII;

import java.util.*;

public class C_MM86_易_公因數問題 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] input = sc.nextLine().split(" ");
		int[] num = new int[input.length];
		for (int index = 0; index < num.length; index++) {
			num[index] = Integer.parseInt(input[index]);
		}
		System.out.print("Common factor in ascending order:");
		int MaxNum = 0;
		for (int item : num) {
			if (item > MaxNum)
				MaxNum = item;
		}
		for(int testNum=2;testNum<MaxNum;testNum++) {
			Boolean test=true;
			for(int item:num) {
				if(item%testNum!=0) {
					test=false;
					break;
				}
			}
			if(test)System.out.print(" "+testNum);
		}
System.out.println();
	}

}
