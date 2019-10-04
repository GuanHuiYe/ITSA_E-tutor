package 陣列_Array;

import java.util.*;

public class C_AR50_易_產生集合元素 {
	public static TreeMap<Long,Integer> TM; 
	public static int size;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		TM=new TreeMap<Long,Integer>(); 
		size=Integer.parseInt(sc.nextLine());
		TM.put(Long.parseLong("1"),0);
		countAns(1,0);		
		for(int n=0;n<size;n++) {
			Long num=TM.firstKey();
			System.out.println(num);
			TM.remove(num);
		}
	}
	public static void countAns(long num,long count) {
		if(count>=Math.sqrt(size))return;
		if(2*num+1>0) {
			TM.put(2*num+1,0);
			countAns(2*num+1,count+1);	
		}
		if(3*num+1>0) {
			TM.put(3*num+1,0);
			countAns(3*num+1,count+1);	
		}
		
	}

}
