package 字串_Stringsc;

import java.util.*;

public class C_ST05_易_選讀大學 {
	public static class school {
		public String Name;
		public String Property;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int school_size = Integer.parseInt(sc.nextLine());
		school[] schools = new school[school_size];
		for (int index = 0; index < school_size; index++) {
			school temp = new school();
			String input = sc.nextLine();
			temp.Name = input.substring(0, input.indexOf(" "));
			temp.Property = input.substring(input.indexOf(" ") + 1);
			schools[index]=temp;
		}
		String ans="";
		for (int nth = Integer.parseInt(sc.nextLine()); nth > 0; nth--) {
			String[] input=sc.nextLine().split("[+]");
			String temp_ans="";
			for (int index = 0; index < input.length; index++) {
				String[] need = input[index].split(" ");
				for (school item : schools) {
					Boolean test = true;
					for (String need_item : need) {
						if (item.Property.indexOf(need_item) == -1) {
							test = false;
							break;
						}
					}
					if(test)temp_ans+=item.Name+" ";
				}
			}
			ans+=temp_ans.substring(0,temp_ans.length()-1)+"\n";
		}
		System.out.print(ans);
	}

}
