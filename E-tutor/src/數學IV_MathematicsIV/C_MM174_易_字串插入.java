package 數學IV_MathematicsIV;
import java.util.*;

public class C_MM174_易_字串插入 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true) {
			String str=sc.nextLine();
			if(str.equals("end"))break;
			String insert=sc.nextLine();
			int index=Integer.parseInt(sc.nextLine());
			System.out.print(str.substring(0,index)+insert);
		if(index<str.length())System.out.println(str.substring(index));
		else System.out.println();
		}

	}

}
