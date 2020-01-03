package 陣列_Array;

import java.util.*;

public class C_AR15_易_保齡球計分 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] input = sc.nextLine().split(",");
		String ans_str="";
		int ans = 0;
		for (int index = 0; index < input.length - 1; index += 2) {
			String str = input[index];
			Boolean isNum=false;
			if (str.equals("X")) {
				ans += 10;
			} 
			else if(str.equals("-")) {
				isNum=true;
			}
			else {
				ans += Integer.parseInt(str);
				isNum=true;
			}
			
			int count=1;
			for(int i=index+1;i<input.length;i++) {
				if(input[i].equals("-")) {
					if(isNum) {
						break;
					}
					continue;
				}
				if(input[i].equals("X")) {
					ans+=10;
				}
				else if(input[i].equals("/")) {
					ans+=10-Integer.parseInt(input[i-1]);
				}
				else {
					ans+=Integer.parseInt(input[i]);
					if(isNum) {
						break;
					}
				}
				
				if(++count==3) {
					break;
				}
			}
			ans_str+=ans+",";
		}
		System.out.println(ans_str.substring(0,ans_str.length()-1));
	}

}
