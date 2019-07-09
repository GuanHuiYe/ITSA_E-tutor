package TH71;
import java.util.*;
public class p3 {
	public static String ANS = "";

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String ST = sc.nextLine();
			int[] A = new int[ST.length()];
			for (int i = 0; i < ST.length(); i++) {
				A[i] = Integer.parseInt(ST.substring(i, i + 1));
			}
			GG(A);
			String SHINANS = "";
			for (int i = 0; i < ANS.length(); i++) {
				if (Integer.parseInt(ANS.substring(i, i + 1)) != 0)
					SHINANS += ANS.substring(i, i + 1);
			}
			System.out.println(SHINANS);
			ANS = "";
		}
	}

	public static int GG(int[] NN) {
		int[] TT = new int[NN.length];
		int SZ = 0;
		for (int X : NN) {
			int i = 0, j = SZ;
			while (i != j) {
				int M = (i + j) / 2;
				if (TT[M] >= X)
					i = M + 1;
				else
					j = M;
			}
			TT[i] = X;
			if (i == SZ)
				++SZ;
		}
		for (int i = 0; i < NN.length; i++) {
			ANS += TT[i];
		}
		return SZ;
	}

}
