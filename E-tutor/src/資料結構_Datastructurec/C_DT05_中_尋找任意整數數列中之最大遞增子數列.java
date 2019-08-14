package 戈挡篶_Datastructurec;

import java.util.*;

public class C_DT05_い_碝тヴ種俱计计いぇ程患糤计 {
	public static class Data {
		public LinkedList<Integer> value;

		public Data() {
			value = new LinkedList<Integer>();
		}
	}

	public static int[] StringArrayToIntArray(String[] input) {
		int[] result = new int[input.length];
		for (int index = 0; index < input.length; index++) {
			result[index] = Integer.parseInt(input[index]);
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] input = sc.nextLine().split(",");
		int[] aims = StringArrayToIntArray(input);
		LinkedList<Data> group = new LinkedList<Data>();
		for (int index = 0; index < aims.length; index++) {
			Data DATA = new Data();

			for (int Index = index; Index < aims.length; Index++) {
				if (DATA.value.size() == 0)
					DATA.value.add(aims[Index]);
				else {
					if (aims[Index] > Collections.max(DATA.value))
						DATA.value.add(aims[Index]);

				}
			}
			group.add(DATA);
		}
		
		Data ans=new Data();
		for(Data item : group) {
			if(ans.value.size()<item.value.size()) {
				ans=item;
			}
		}
		
		String printAns="";
		for(int item : ans.value) {
			printAns+=Integer.toString( item)+",";
		}
		System.out.println(printAns.substring(0,printAns.length()-1));

	}

}
