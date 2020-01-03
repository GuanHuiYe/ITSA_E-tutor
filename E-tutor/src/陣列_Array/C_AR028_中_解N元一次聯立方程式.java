package 陣列_Array;

import java.util.*;

public class C_AR028_中_解N元一次聯立方程式 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String[]> AL_input = new ArrayList<String[]>();
		while (sc.hasNext()) {
			String i = sc.nextLine();
			if (i.equals("0"))
				break;
			AL_input.add(i.split(","));
		}
		Double[][] input = new Double[AL_input.size()][AL_input.get(0).length];
		for (int y = 0; y < input.length; y++) {
			String[] AL_Row = AL_input.get(y);
			for (int x = 0; x < input[y].length; x++) {
				input[y][x] = Double.parseDouble(AL_Row[x]);
			}
		}
		
		for (int col = 0; col < input[0].length - 1; col++) {
						
			if(input[col][col]!=1.0) {
				int SearchIndex=col;
				Double MaxNum=input[col][col];
				for(int index=col+1;index<input.length;index++) {
					if(input[index][col]==1.0) {
						SearchIndex=index;
						break;
					}
					if(input[index][col]>MaxNum) {
						SearchIndex=index;
						MaxNum=input[index][col];
					}
				}
				if(SearchIndex!=col) {
					Double[] tmp=input[col];
					input[col]=input[SearchIndex];
					input[SearchIndex]=tmp;
				}
				if(input[col][col]!=1.0) {
					Double num=1.0/input[col][col];
					for(int index=0;index<input[col].length;index++) {
						if(input[col][index]!=0) {
							input[col][index]*=num;
						}
					}
				}
				
			}
			
			for (int row = col + 1; row < input.length; row++) {
				Double num = (input[row][col] * -1) / input[col][col];
				for (int index = 0; index < input[row].length; index++) {
					input[row][index] += (input[col][index] * num);
				}
			}

//			for (int y = 0; y < input.length; y++) {
//				for (int x = 0; x < input[y].length; x++) {
//					System.out.print(input[y][x] + "\t");
//				}
//				System.out.println();
//			}
//			System.out.println();
		}
		
		
		
		for(int y=input.length-1;y>=0;y--) {
			if(input[y][y]!=0.0) {
				for(int x=y+1;x<input[y].length-1;x++) {
					if(input[y][x]!=0.0) {
						input[y][x]*=input[x][input[x].length-1];
						input[y][input[y].length-1]+=input[y][x]*-1.0;
						input[y][x]=0.0;
					}
				}
			}
		}
		
	
		
		for(int index=0;index<input.length;index++) {
			String ans=String.format("%.6f", input[index][input[index].length-1]);
			System.out.println("x"+index+"="+ans.substring(0,ans.length()-1));
		}
	}

	
}
