package 數學II_MathematicsII;
import java.util.*;

public class C_MM85_易_完美數問題 {

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String ans = "";
		for (int num = 1; num <= Integer.parseInt(input); num++) {
			if (num == 0)
				continue;
			int sum = 0;
			for (int n = 1; n < num; n++) {
				if (num % n == 0)
					sum += n;
			}
			if (sum == num)
				ans += num + " ";
		}
		if (ans.length() > 0)
			System.out.print(ans);
		System.out.println("is perfect number");

	}

}
