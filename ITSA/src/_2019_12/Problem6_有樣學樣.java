package _2019_12;
import java.util.*;

public class Problem6_有樣學樣 {

	public static void main(String[] args) {
		Scanner SC=new Scanner(System.in);
		SC.nextLine();
		String S1="ZAQ!ZXSW@XCDE#CVFR$VBGT%BNHY^NMJU&M<KI*<>LO(>?:P)?";
		String S2="!QAZ!@WSX@#EDC#$RFV$%TGB%^YHN^&UJM&*IK<*(OL>()P:?)";
		String S3="!@#$%^&*()!QWERTYUIOPQASDFGHJKL:AZXCVBNM<>?Z";
		String S4=")(*&^%$#@!)POIUYTREWQP:LKJHGFDSA:?><MNBVCXZ?";
		String GG[][]={{"!","@","#","$","%","^","&","*","(",")"} , 
						{"Q","W","E","R","T","Y","U","I","O","P"},
						{"A","S","D","F","G","H","J","K","L",":"},
						{"Z","X","C","V","B","N","M","<",">","?"}};
		while(SC.hasNextLine()){
			String ST[]=SC.nextLine().split("\\s+");
			String A1=ST[1];
			int YAJIX=-1;
			int YAJIY=-1;
			for(int i=0;i<4 && YAJIX==-1;i++){
				for(int j=0;j<10;j++){
					if(GG[i][j].equals(ST[0].substring(0,1))){
						YAJIX=i;
						YAJIY=j;
						break;
					}
				}
			}
			int ANSX=-1;
			int ANSY=-1;
			for(int i=0;i<4 && ANSX==-1;i++){
				for(int j=0;j<10;j++){
					if(GG[i][j].equals(ST[1])){
						ANSX=i;
						ANSY=j;
						break;
					}
				}
			}
			for(int k=1;k<ST[0].length();k++)
			{
				int HX=-1;
				int HY=-1;
				for(int i=0;i<4;i++){
					for(int j=0;j<10;j++){
						if(GG[i][j].equals(ST[0].substring(k,k+1))){
							HX=i;
							HY=j;
						}
					}
				}
				int GX=ANSX+HX-YAJIX;
				int GY=ANSY+HY-YAJIY;
				if(GX<0)GX+=4;
				else if(GX>4)GX-=4;
				else if(GX==4)GX=0;
				if(GY<0)GY+=10;
				else if(GY>10)GY-=10;
				else if(GY==10)GY=0;
				
				A1+=GG[GX][GY];
			}
			String ANS="";
			if(ST[2].equals("0")){
				System.out.println(A1);
			}
			else if(ST[2].equals("1")){
				for(int i=0;i<A1.length();i++){
					ANS+=S1.substring(S1.indexOf(A1.substring(i,i+1))+1,S1.indexOf(A1.substring(i,i+1))+2);
				}
				System.out.println(ANS);
			}
			else if(ST[2].equals("2")){
				for(int i=0;i<A1.length();i++){
					ANS+=S2.substring(S2.indexOf(A1.substring(i,i+1))+1,S2.indexOf(A1.substring(i,i+1))+2);
				}
				System.out.println(ANS);
			}
			else if(ST[2].equals("3")){
				for(int i=0;i<A1.length();i++){
					ANS+=S3.substring(S3.indexOf(A1.substring(i,i+1))+1,S3.indexOf(A1.substring(i,i+1))+2);
				}
				System.out.println(ANS);
			}
			else if(ST[2].equals("4")){
				for(int i=0;i<A1.length();i++){
					ANS+=S4.substring(S4.indexOf(A1.substring(i,i+1))+1,S4.indexOf(A1.substring(i,i+1))+2);
				}
				System.out.println(ANS);
			}
		}
	}

}
