package 字串II_StringsII;

import java.util.*;

public class C_ST64_易_春聯平仄音調判斷 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] rule = new int[][] { { 0, 1, 0, 2, 1, 1, 2, 0, 2, 0, 1, 2, 2 },
				{ 0, 2, 0, 1, 1, 2, 2, 0, 1, 0, 2, 2, 1 } };

		String[] input = sc.nextLine().split(" ");
		Boolean Test = true;
		for(int ruleIndex=0;ruleIndex<rule.length;ruleIndex++) {
			for(int index=0;index<input.length;index++) {
				int item=Integer.parseInt(input[index]);
				if(index<rule[ruleIndex].length) {
					if(rule[ruleIndex][index]!=0) {
						if((item==1||item==2)&&rule[ruleIndex][index]!=1) {
							Test=false;
							break;
						}
						if((item==3||item==4)&&rule[ruleIndex][index]!=2) {
							Test=false;
							break;
						}
					}
				}
				else {
					if(!(item==1||item==2)) {
						Test=false;
						break;
					}
				}
			}
			if(Test)break;
		}
		System.out.println(Test?"OK!":"Error!");

	}

}
