package 數學IV_MathematicsIV;
import java.util.*;

public class C_MM185_中_輸出Pascal三角形 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true) {
			int n=sc.nextInt();
			if(n==0)break;
			int[][] graph=new int[n][n];
			graph[0][0]=1;
			for(int y=1;y<n;y++) {
				for(int x=0;x<n;x++) {
					if(x==0)graph[y][x]=1;
					else graph[y][x]=graph[y-1][x]+graph[y-1][x-1];
				}
			}
			for(int y=0;y<n;y++) {
				for(int x=0;x<n;x++) {
					if(graph[y][x]==0)break;
					System.out.print(graph[y][x]+" ");
				}
				System.out.println();
			}
		}

	}

}
