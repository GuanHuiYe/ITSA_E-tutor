package °}¦C_Array;
import java.util.*;
public class C_AR09_©ö_¨â¼Æ®t­È {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[] input=sc.nextLine().split(",");
		int[] input_arr=new int[input.length];
		for(int index=0;index<input.length;index++) {
			input_arr[index]=Integer.parseInt(input[index]);
		}
		int[] int_arr=sort(input_arr);
		String SB="";
		String BS="";
		for(int index=0;index<int_arr.length;index++) {
			SB+=int_arr[index];
			BS+=int_arr[int_arr.length-1-index];
		}
		System.out.println(Integer.parseInt(BS)-Integer.parseInt(SB));
	}
	
	public static int[] sort(int[] arr) {
		for(int n=0;n<arr.length;n++) {
			for(int nn=0;nn<arr.length-n-1;nn++) {
				if(arr[nn]>arr[nn+1]) {
					int temp=arr[nn];
					arr[nn]=arr[nn+1];
					arr[nn+1]=temp;
				}
			}
		}
		return arr;
	}

}
