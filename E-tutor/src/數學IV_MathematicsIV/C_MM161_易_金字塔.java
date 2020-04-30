package 數學IV_MathematicsIV;
import java.util.*;

public class C_MM161_易_金字塔 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			int N=Integer.parseInt(sc.nextLine());
			int item=0;
			int step=0;
			while(item<N) {
				item+=++step;
			}
			System.out.println(step-1);
		}

	}

}
