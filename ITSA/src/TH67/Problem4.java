package TH67;
import java.util.*;
public class Problem4 {

	public static void main(String[] args) {		
		Scanner sc=new Scanner(System.in);
		String[] input=sc.nextLine().split(" ");
		char[] maininput=sc.nextLine().toCharArray();
		char[][] arr=new char[Integer.parseInt(input[0])+1][Integer.parseInt(input[0])+1];
		for(int n=1;n<arr.length;n++) {
			String[] input2=sc.nextLine().split(" ");
			for(int n2=1;n2<arr.length;n2++) {
				arr[n][n2]=input2[n2-1].charAt(0);
			}
		}
		System.out.print(input[1]);
		int index=Integer.parseInt(input[1]);
		for(char in : maininput) {
			for(int n=0;n<arr[index].length;n++) {
				if(in==arr[index][n]) {
					System.out.print(n);
					index=n;
					
				}
			}
		}
		System.out.println();
	}

}
