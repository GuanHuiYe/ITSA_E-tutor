package 陣列II_ArrayII;

import java.util.*;

public class C_AR55_易_撲克遊戲 {

	public static class Card {
		public String flower;
		public int num;

		public Card(String flower, int num) {
			this.flower = flower;
			this.num = num;
		}
	}

	public static class Man {
		public Card[] card;
		public Boolean is_StraightFlush;
		public Card[] FourofKind;
		public Card Fullhouse;
		public Card ThreeOfkind; 

		private Card[] sort(Card[] arr) {
			for (int nth = 0; nth < arr.length - 1; nth++) {
				for (int index = 0; index < arr.length - 1 - nth; index++) {
					int compare = arr[index].flower.compareTo(arr[index + 1].flower);
					if (compare > 0) {
						Card temp = arr[index];
						arr[index] = arr[index + 1];
						arr[index + 1] = temp;
					} else if (compare == 0) {
						if (arr[index].num > arr[index + 1].num) {
							Card temp = arr[index];
							arr[index] = arr[index + 1];
							arr[index + 1] = temp;
						}
					}
				}
			}
			return arr;
		}

		private void fun_StraightFlush() {
			String target = card[0].flower;
			int num = card[0].num;
			for (int index = 1; index < card.length; index++) {
				if (!target.equals(card[index].flower) || num + 1 != card[index].num) {
					is_StraightFlush = false;
					return;
				}
			}
			is_StraightFlush = true;
		}

		private void fun_FourofKind() {
			TreeMap<Integer, ArrayList<Card>> TM = new TreeMap<Integer, ArrayList<Card>>();
			for (Card item : card) {
				if (TM.containsKey(item.num))
					TM.get(item.num).add(item);
				else
					TM.put(item.num, new ArrayList<Card>());
			}
			for (Map.Entry<Integer, ArrayList<Card>> item : TM.entrySet()) {
				if (item.getValue().size() == 4) {
					Card[] newArr = new Card[4];
					int index = 0;
					for (Card Citem : item.getValue()) {
						newArr[index] = Citem;
						index++;
					}
					FourofKind = newArr;
				}
			}
			FourofKind = null;
		}

		private void fun_Fullhouse() {
			TreeMap<Integer, ArrayList<Card>> TM = new TreeMap<Integer, ArrayList<Card>>();
			for (Card item : card) {
				if (TM.containsKey(item.num))
					TM.get(item.num).add(item);
				else
					TM.put(item.num, new ArrayList<Card>());
			}
			if(TM.size()!=2) {
				Fullhouse = null;
				return;
			}
			
			for (Map.Entry<Integer, ArrayList<Card>> item : TM.entrySet()) {
				Card[] newArr = new Card[item.getValue().size()];	
				int index = 0;
				for (Card Citem : item.getValue()) {
					newArr[index] = Citem;
					index++;
				}
				newArr=sort(newArr);				
				Fullhouse = newArr[newArr.length-1];
			}
			
		}
		
		private void fun_THreeOfkind() {
			TreeMap<Integer, ArrayList<Card>> TM = new TreeMap<Integer, ArrayList<Card>>();
			for (Card item : card) {
				if (TM.containsKey(item.num))
					TM.get(item.num).add(item);
				else
					TM.put(item.num, new ArrayList<Card>());
			}
			if(TM.size()!=2) {
				Fullhouse = null;
				return;
			}
			
			for (Map.Entry<Integer, ArrayList<Card>> item : TM.entrySet()) {
				Card[] newArr = new Card[item.getValue().size()];	
				int index = 0;
				for (Card Citem : item.getValue()) {
					newArr[index] = Citem;
					index++;
				}
				newArr=sort(newArr);				
				Fullhouse = newArr[newArr.length-1];
			}
		}
		private Man(String[] input) {
			card = new Card[input.length];
			for (int index = 0; index < card.length; index++) {
				card[index] = new Card(input[index].substring(0, 1),
						Integer.parseInt(input[index].substring(1, input[index].length())));
			}
			card = sort(card);
			fun_StraightFlush();
			fun_FourofKind();
			fun_Fullhouse();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			String[] input_a = sc.nextLine().split(" ");
			Man a = new Man(input_a);
			String[] input_b = sc.nextLine().split(" ");
			Man b = new Man(input_b);
			b.card = new Card[input_b.length];

			Boolean a_isBig = false;

			if (a.is_StraightFlush && b.is_StraightFlush) {
				// 比數字
				if (a.card[0].num > b.card[0].num)
					a_isBig = true;
				else if (a.card[0].num == b.card[0].num)
					// 比顏色
					if (a.card[0].flower.compareTo(b.card[0].flower) > 0)
						a_isBig = true;
			} else if (a.is_StraightFlush && !b.is_StraightFlush)
				a_isBig = true;
			else if(a.FourofKind!=null&&b.FourofKind!=null) {
				//比數字
				if(a.FourofKind[0].num>b.FourofKind[0].num)a_isBig = true;
			}
			else if(a.Fullhouse!=null&&b.Fullhouse!=null) {
				// 比數字
				if (a.Fullhouse.num > b.Fullhouse.num)
					a_isBig = true;
				else if (a.Fullhouse.num == b.Fullhouse.num)
					// 比顏色
					if (a.Fullhouse.flower.compareTo(b.Fullhouse.flower) > 0)
						a_isBig = true;
			}

			System.out.println(a_isBig ? "1" : "0");
			if (Integer.parseInt(sc.nextLine()) == -1)
				break;
		}
	}

}
