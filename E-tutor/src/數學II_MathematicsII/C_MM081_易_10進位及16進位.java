package 數學II_MathematicsII;
import java.util.*;

public class C_MM081_易_10進位及16進位 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		if(input.substring(0,2).equals("0x")) {
			System.out.println(Integer.parseInt(input.substring(2),16));
		}
		else {
			System.out.printf("0x%X\n",Integer.parseInt(input));
		}
		

	}

}
