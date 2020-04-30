package _2019_12;

import java.util.*;
import java.lang.*;

public class Problem2_加密解密 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int nth = Integer.parseInt(sc.nextLine()); nth > 0; nth--) {

			char[] input = sc.nextLine().toCharArray();
			char[] newInput = new char[input.length];
			try {

				newInput[0] = String.valueOf((Integer.parseInt(String.valueOf(input[0])) + 7) % 10).toCharArray()[0];
				newInput[1] = input[1];
				newInput[2] = String.valueOf((Integer.parseInt(String.valueOf(input[2])) + 7) % 10).toCharArray()[0];
				newInput[3] = String.valueOf((Integer.parseInt(String.valueOf(input[3])) + 7) % 10).toCharArray()[0];
				newInput[4] = input[4];
				newInput[5] = String.valueOf((Integer.parseInt(String.valueOf(input[5])) + 7) % 10).toCharArray()[0];
				newInput[6] = String.valueOf((Integer.parseInt(String.valueOf(input[6])) + 7) % 10).toCharArray()[0];
				newInput[7] = input[7];
				newInput[8] = String.valueOf((Integer.parseInt(String.valueOf(input[8])) + 7) % 10).toCharArray()[0];

				int num0 = Integer.parseInt(String.valueOf(newInput[0]));
				int num2 = Integer.parseInt(String.valueOf(newInput[2]));
				int num3 = Integer.parseInt(String.valueOf(newInput[3]));
				int num5 = Integer.parseInt(String.valueOf(newInput[5]));
				int num6 = Integer.parseInt(String.valueOf(newInput[6]));
				int num8 = Integer.parseInt(String.valueOf(newInput[8]));

				String mathStr = "";

				switch (newInput[4]) {
				case '+':
					mathStr += num0 + "+" + num8;
					mathStr += num3 + "+" + num5;
					mathStr += num2 + "+" + num6;
					break;
				case '-':
					mathStr += num0 + "-" + num8;
					mathStr += num3 + "-" + num5;
					mathStr += num2 + "-" + num6;
					break;
				case '*':
					mathStr += num0 + "*" + num8;
					mathStr += num3 + "*" + num5;
					mathStr += num2 + "*" + num6;
					break;
				case '/':
					mathStr += num0 + "/" + num8;
					mathStr += num3 + "/" + num5;
					mathStr += num2 + "/" + num6;
					break;
				}
				mathStr = mathStr.substring(0, 3) + newInput[1] + mathStr.substring(3);
				mathStr = mathStr.substring(0, 7) + newInput[7] + mathStr.substring(7);
				while (true) {				
					mathStr = mathStr.replace("+", ",+,");
					mathStr = mathStr.replace("-", ",-,");
					mathStr = mathStr.replace("*", ",*,");
					mathStr = mathStr.replace("/", ",/,");
					String[] strSp = mathStr.split(",");
					if (strSp.length == 1)
						break;

					int selectIndex = -1;
					for (int index = 0; index < strSp.length; index++) {
						if (strSp[index].equals("*") || strSp[index].equals("/")) {
							selectIndex = index;
							break;
						}
						if (strSp[index].equals("+") || strSp[index].equals("-")) {
							selectIndex = index;							
						}
					}
					if (selectIndex == -1)
						break;
					
					mathStr="";
					for(int index=0;index<selectIndex-1;index++) {
						mathStr+=strSp[index];
					}
					
					if (strSp[selectIndex].equals("*")) {
						mathStr+=Integer.parseInt(strSp[selectIndex-1])*Integer.parseInt(strSp[selectIndex+1]);
					} else if (strSp[selectIndex].equals("/")) {
						mathStr+=Integer.parseInt(strSp[selectIndex-1])/Integer.parseInt(strSp[selectIndex+1]);
					} else if (strSp[selectIndex].equals("+")) {
						mathStr+=Integer.parseInt(strSp[selectIndex-1])+Integer.parseInt(strSp[selectIndex+1]);
					} else if (strSp[selectIndex].equals("-")) {
						mathStr+=Integer.parseInt(strSp[selectIndex-1])-Integer.parseInt(strSp[selectIndex+1]);
					}
					for(int index=selectIndex+2;index<strSp.length;index++) {
						mathStr+=strSp[index];
					}

				}
				System.out.println(Integer.parseInt(mathStr));
			} catch (Exception e) {
				System.out.println("error");
			}
		}

	}

}
