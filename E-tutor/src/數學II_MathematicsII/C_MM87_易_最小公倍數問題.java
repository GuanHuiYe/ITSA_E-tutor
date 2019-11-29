package 數學II_MathematicsII;

import java.util.*;

public class C_MM87_易_最小公倍數問題 {

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
		int GCD=0;
		for(int testNum=2;testNum<MaxNum;testNum++) {
			Boolean test=true;
			for(int item:num) {
				if(item%testNum!=0) {
					test=false;
					break;
				}
			}
			if(test)GCD=testNum;
		}
		
		int LCM=1;
		for(int item:num) {
			LCM*=item;
		}
		LCM/=GCD;
		System.out.println(LCM);

	}

}
