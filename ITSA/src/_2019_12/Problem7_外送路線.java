package _2019_12;
import java.util.*;
public class Problem7_¥~°e¸ô½u {

	public static void main(String[] args) {
		Scanner SC=new Scanner(System.in);
		SC.nextInt();
		while(SC.hasNextInt()){
			int A=SC.nextInt();
			int GG[][]=new int[A+1][A+1];
			for(int i=0;i<A+1;i++){
				for(int j=0;j<A+1;j++){
					GG[i][j]=999999;
					if(i==j)GG[i][j]=0;
				}
			}
			int H=SC.nextInt();
			while(H!=-1){
				GG[H][SC.nextInt()]=SC.nextInt();
				H=SC.nextInt();
			}
			for(int k=0;k<A+1;k++){
				for(int i=0;i<A+1;i++){
					for(int j=0;j<A+1;j++){
						GG[i][j]=Math.min(GG[i][j],GG[i][k]+GG[k][j]);
					}
				}
			}
			int MAX=-1;
			int YAJI=-1;
			for(int i=0;i<A+1;i++){
				if(MAX<GG[0][i]){
					MAX=GG[0][i];
					YAJI=i;
				}
			}
			System.out.println(YAJI+" "+MAX);
		}
	}

}
