package 字串II_StringsII;
import java.util.*;

public class C_ST83_易_聯集 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<Integer>();
		String[] A = sc.nextLine().split(",");
		String[] B = sc.nextLine().split(",");
		for (int i = 0; i < A.length; i++) {			
			if (!al.contains(Integer.parseInt(A[i])))
				al.add(Integer.parseInt(A[i]));
		}
		for (int i = 0; i < B.length; i++) {			
			if (!al.contains(Integer.parseInt(B[i])))
				al.add(Integer.parseInt(B[i]));
		}
		
			Object[] ans = al.toArray();
			Arrays.sort(ans);
			for (int index = 0; index < ans.length; index++) {
				System.out.print(ans[index] + (index < ans.length - 1 ? " " : "\n"));
			}
		
		
	}

}
