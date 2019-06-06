package TH63;
import java.util.*;
public class Problem5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			char[] in=sc.nextLine().toCharArray();
			int m=Character.getNumericValue(in[0])*1+Character.getNumericValue(in[2])*2+Character.getNumericValue(in[3])*3+Character.getNumericValue(in[4])*4+Character.getNumericValue(in[6])*5+Character.getNumericValue(in[7])*6+Character.getNumericValue(in[8])*7+Character.getNumericValue(in[9])*8+Character.getNumericValue(in[10])*9;
			
			if(m%11==Character.getNumericValue(in[12])||in[12]=='X'&&m%11==10) {
				System.out.println("Pass");
			}
			else {
				System.out.println("Fail");
			}
		}
		
	}

}
