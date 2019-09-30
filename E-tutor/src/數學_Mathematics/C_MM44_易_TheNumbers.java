package ¼Æ¾Ç_Mathematics;
import java.util.*;
public class C_MM44_©ö_TheNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			String[] input=sc.nextLine().split(" ");
			int index=0;
			int count=0;
			while(true) {
			 index=input[1].indexOf(input[0],index)+1;
			 if(index>0)count++;
			 else break;
			}
			System.out.println(count);
		}
	}

}
