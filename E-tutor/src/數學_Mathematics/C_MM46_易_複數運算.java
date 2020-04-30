package 數學_Mathematics;
import java.util.*;
public class C_MM46_易_複數運算 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String ans="";
		for(int n=Integer.parseInt(sc.nextLine());n>0;n--) {
			String[] input=sc.nextLine().split(" ");
			int a=Integer.parseInt(input[1]),b=Integer.parseInt(input[2]);
			int c=Integer.parseInt(input[3]),d=Integer.parseInt(input[4]);
			int ans_a=0,ans_b=0;
		
			switch(input[0]){
				case "+":
					ans_a=a+c;
					ans_b=b+d;
					break;
				case "-":
					ans_a=a-c;
					ans_b=b-d;
					break;
				case "*":
					ans_a=a*c-b*d;
					ans_b=a*d+b*c;
					break;
			}
		
			System.out.println(ans_a+" "+ans_b);
		}
		
	}

}
