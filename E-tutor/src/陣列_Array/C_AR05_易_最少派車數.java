package 陣列_Array;
import java.util.*;
public class C_AR05_易_最少派車數 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int piece=Integer.parseInt(sc.nextLine());
		int[][] clock=new int[piece][2];
		String[] input=sc.nextLine().split(" ");
		for(int n=0;n<piece;n++) {			
			clock[n][0]=Integer.parseInt(input[n*2]);
			clock[n][1]=Integer.parseInt(input[n*2+1]);
		}
		clock=sort(clock); //排序起點時間
		int ans=1;		
		int e=clock[0][1];
		clock[0][0]=0;
		clock[0][1]=0;
		Boolean test=true;
		while(test) {
			for(int index=0;index<clock.length;index++) {
				if(clock[index][0]==0)continue;//被取過的
				if(clock[index][0]<e)continue;//起點時間比終點小的
				e=clock[index][1];
				clock[index][0]=0;
				clock[index][1]=0;
			}
			test=false;
			for(int[] item:clock) {
				if(item[0]!=0||item[1]!=0) {
					test=true;
					e=item[1];
					item[0]=0;
					item[1]=0;
					ans++;
					break;
				}
			}
			
		}
		System.out.println(ans);
	}
	public static int[][] sort(int[][] arr){
		for(int n=0;n<arr.length;n++) {
			for(int nn=0;nn<arr.length-n-1;nn++) {
				if(arr[nn][0]>arr[nn+1][0]) {
					int[] temp=arr[nn];
					arr[nn]=arr[nn+1];
					arr[nn+1]=temp;
				}
			}
		}
		return arr;
	}
	

}
