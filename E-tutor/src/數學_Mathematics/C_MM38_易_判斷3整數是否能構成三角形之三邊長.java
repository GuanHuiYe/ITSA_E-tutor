package 數學_Mathematics;

import java.util.*;

public class C_MM38_易_判斷3整數是否能構成三角形之三邊長 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String[] input = sc.nextLine().split(" ");
			Boolean test=true;
			for (int n = 0; n < 3; n++) {
				String temp=input[0];
				input[0]=input[1];
				input[1]=temp;
				temp=input[1];
				input[1]=input[2];
				input[2]=temp;
				int x=Integer.parseInt(input[0]);
				int y=Integer.parseInt(input[1]);
				int z=Integer.parseInt(input[2]);
				if((x+y)<=z) {
					test=false;
					break;
				}
			}
			System.out.println(test?"fit":"unfit");
		}
	}

}
