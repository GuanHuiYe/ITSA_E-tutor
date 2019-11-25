package 字串_Stringsc;

import java.util.*;
import java.lang.*;

public class C_ST38_中_字數統計 {
	public static class Word {
		String Text;
		int Count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList<Word> map = new LinkedList<Word>();
		String[] input = sc.nextLine().split("\\W+");
		for (String item : input) {
			Boolean isContains = false;
			for (Word wItem : map) {
				if (wItem.Text.toLowerCase().equals(item.toLowerCase())) {
					wItem.Count++;
					isContains = true;
					break;
				}
			}
			if(!isContains) {
				Word w=new Word();
				w.Text=item;
				w.Count=1;
				map.add(w);
			}
		}
		
		for(Word Item:map) {
			System.out.println(Item.Text+" : "+Item.Count);
		}

	}

}
