package 字串II_StringsII;
import java.util.*;

public class C_ST53_易_矩陣數字顯示 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		TreeMap<Character,String[]> map=new TreeMap<Character,String[]>();
		map.put('0', new String[] {
			"*****",
			"*   *",
			"*   *",
			"*   *",
			"*****"});
		map.put('1', new String[] {
			"*",
			"*",
			"*",
			"*",
			"*"});
		map.put('2', new String[] {
			"*****",
			"    *",
			"*****",
			"*    ",
			"*****"});
		map.put('3', new String[] {
			"*****",
			"    *",
			"*****",
			"    *",
			"*****"});
		map.put('4', new String[] {
			"*   *",
			"*   *",
			"*****",
			"    *",
			"    *"});
		map.put('5', new String[] {
			"*****",
			"*    ",
			"*****",
			"    *",
			"*****"});
		map.put('6', new String[] {
			"*****",
			"*    ",
			"*****",
			"*   *",
			"*****"});
		map.put('7', new String[] {
			"*****",
			"    *",
			"    *",
			"    *",
			"    *"});
		map.put('8', new String[] {
			"*****",
			"*   *",
			"*****",
			"*   *",
			"*****"});
		map.put('9', new String[] {
			"*****",
			"*   *",
			"*****",
			"    *",
			"*****"});
	
		
		
		char[] input=sc.nextLine().toCharArray();
		for(int nth=0;nth<5;nth++) {
			for(int index=0;index<input.length;index++) {
				System.out.print(map.get(input[index])[nth]);
				if(index<input.length-1)System.out.print(" ");
			}
			System.out.println();
		}

	}

}
