package TH71;

import java.util.*;

public class Problem4_奇妙數列 {
	public static LinkedList<Integer> S = new LinkedList<Integer>();
	public static LinkedList<Integer> T = new LinkedList<Integer>();
	public static void main(String[] args) {
		S.add(0);
		T.add(0);
		S.add(1);
		T.add(2);
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int ans=Serch_S(Integer.parseInt(sc.nextLine()));
			System.out.println(ans);
		}

	}

	public static int Serch_S(int index) {
		if (index >= S.size()) {
			S.add(Serch_S(index - 1) + Serch_T(index - 1));
			return S.get(index);
		} else
			return S.get(index);
	}

	public static int Serch_T(int index) {
		if (index >= T.size()) {
			int aims = S.get(index);
			for (int num = 1; num < S.get(index); num++) {
				if (!S.contains(num)&&!T.contains(num)) {
					aims = num;
					break;
				}
			}
			T.add(aims==S.get(index)? aims+1:aims);
			return T.get(index);

		} else
			return T.get(index);

	}

}
