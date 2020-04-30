package _2019_12;
import java.util.*;
public class Problem9_古代遺跡機關 {

	public static void main(String[] args) {
		Scanner SC=new Scanner(System.in);
		while(SC.hasNextInt()){
			int N=SC.nextInt();
			int []GG=new int[N];
			for(int i=0;i<N;i++){
				GG[i]=SC.nextInt();
			}
			int ANS=0;
			int GGN=0;
			while(GGN<N-1){
				int MIN=999999;
				int GY=-1;
				for(int i=0;i<N;i++){
					if(GG[i]==999999)continue;
					int YAJI=1;
					while(true){
						if(i+YAJI>=N)break;
						if(GG[i+YAJI]==999999)YAJI++;
						else break;
					}
					if(i+YAJI>=N)continue;
					if(GG[i] >= GG[i+YAJI] && MIN >= GG[i]){
						MIN=GG[i];
						GY=i+YAJI;
					}
					else if(GG[i] <= GG[i+YAJI] && MIN >= GG[i+YAJI]){
						MIN=GG[i+YAJI];
						GY=i;
					}
				}
				GG[GY]=999999;
				ANS+=MIN;
				GGN++;
			}
			System.out.println(ANS);
		}
	}

}
