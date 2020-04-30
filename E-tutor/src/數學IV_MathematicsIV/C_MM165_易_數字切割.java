package 數學IV_MathematicsIV;
import java.util.*;

public class C_MM165_易_數字切割 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true) {
			char[] input=sc.nextLine().toCharArray();
			if(input.length==1&&input[0]=='0')break;
			for(char item:input) {
				System.out.print(item+" ");				
			}
			System.out.println();
		}
	}

}
