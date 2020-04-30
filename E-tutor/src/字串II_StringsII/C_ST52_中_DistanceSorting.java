package 字串II_StringsII;
import java.util.*;

public class C_ST52_中_DistanceSorting {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[][] arr=new int[Integer.parseInt(sc.nextLine())][3];
		for(int index=0;index<arr.length;index++) {
			String[] input=sc.nextLine().split(" ");
			for(int i=0;i<arr[index].length;i++) {
				arr[index][i]=Integer.parseInt(input[i]);
			}
		}
		
		for(int index=0;index<arr.length-1;index++) {
			for(int i=0;i<arr.length-index-1;i++) {
				if(arr[i][2]>arr[i+1][2]) {
					int[] tmp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=tmp;
				}
			}
		}
		
		for(int index=0;index<arr.length;index++) {
			System.out.println(arr[index][0]+" "+arr[index][1]+" "+arr[index][2]);
		}

	}

}
