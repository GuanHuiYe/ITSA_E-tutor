package 數學IV_MathematicsIV;
import java.util.*;

public class C_MM180_易_射飛鏢 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String[] input = sc.nextLine().split(" ");
			double x = Double.parseDouble(input[0]);
			double y = Double.parseDouble(input[1]);
			double cm = Math.sqrt(Math.pow(x - 10, 2) + Math.pow(y - 10, 2));
			int ans=10-(int)Math.ceil(cm);			
			System.out.println(ans<=0?0:ans==10?10:ans+1);			
		}
	}

}
