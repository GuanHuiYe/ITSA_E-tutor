package 數學_Mathematics;

import java.util.*;

public class C_MM39_易_判斷是何種三角形 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String[] input = sc.nextLine().split(" ");
			Boolean test = true;
			for (int n = 0; n < 3; n++) {
				String temp = input[0];
				input[0] = input[1];
				input[1] = temp;
				temp = input[1];
				input[1] = input[2];
				input[2] = temp;
				int x = Integer.parseInt(input[0]);
				int y = Integer.parseInt(input[1]);
				int z = Integer.parseInt(input[2]);
				if ((x + y) <= z) {
					test = false;
					break;
				}
			}
			if (test) {
				int[] input_arr = new int[input.length];
				for (int n = 0; n < input_arr.length; n++) {
					input_arr[n] = Integer.parseInt(input[n]);
				}
				Arrays.sort(input_arr);
		
				if((Math.pow(input_arr[0], 2)+Math.pow(input_arr[1], 2))==Math.pow(input_arr[2], 2))
					System.out.println("Right Triangle");
				else {
					test=true;
					for (int n = 0; n < 3; n++) {
						int temp = input_arr[0];
						input_arr[0] = input_arr[1];
						input_arr[1] = temp;
						temp = input_arr[1];
						input_arr[1] = input_arr[2];
						input_arr[2] = temp;
						
						if ((Math.pow(input_arr[0], 2)+Math.pow(input_arr[1], 2))<=Math.pow(input_arr[2], 2)) {
							test = false;
							break;
						}
					}
					
					if(test) 
						System.out.println("Acute Triangle");					
					else 
						System.out.println("Obtuse Triangle");
				}
				
			} else
				System.out.println("Not Triangle");
		}
	}

}
