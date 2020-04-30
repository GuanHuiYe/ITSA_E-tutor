package 綜合_Comprehensive;

import java.util.*;

public class C_CH11_易_貨船載貨最大數 {
	public static class BOX {
		public String Name;
		public int width;
		public Boolean use;

		public BOX(String Name, int width) {
			this.Name = Name;
			this.width = width;
			this.use = false;
		}
	}

	public static int max_Width;
	public static int max_Count;
	public static BOX[] items;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] input = sc.nextLine().split(",");
		max_Width = Integer.parseInt(input[0]);
		max_Count = Integer.parseInt(input[1]);
		items = new BOX[input.length - 3];
		for (int index = 3; index < input.length; index++) {
			items[index - 3] = new BOX("k" + (index - 3), Integer.parseInt(input[index]));
		}
		items = sort(items);
		String[] ans = new String[max_Count];
		chose(ans, 0, 0);
	}

	public static BOX[] sort(BOX[] arr) {
		for (int nth = 0; nth < arr.length - 1; nth++) {
			for (int index = 0; index < arr.length - 1 - nth; index++) {
				if (arr[index].width > arr[index + 1].width) {
					BOX temp = arr[index];
					arr[index] = arr[index + 1];
					arr[index + 1] = temp;
				}
			}
		}
		return arr;
	}

	public static Boolean chose(String[] arr, int INDEX, int width) {

		for (int index = items.length - 1; index >= 0; index--) {
			if (items[index].use)
				continue;
			if (items[index].width + width > max_Width)
				continue;
			arr[INDEX] = items[index].Name;
			items[index].use = true;
			if (INDEX == arr.length - 1) {
				for (int n = arr.length - 1; n >= 0; n--) {
					System.out.print(arr[n] + (n == 0 ? "\n" : ","));
				}
				return true;
			} else {
				if(chose(arr, INDEX + 1, width + items[index].width))return true;
				else items[index].use = false;
			}
		}
		return false;
	}
}
