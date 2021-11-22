package learnstudy;
/*
 * 案例：三个和尚身高
 * 
 */

public class OperatorHesang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int height1 = 195 ;
		int height2 = 198 ;
		int height3 = 175 ;
		int a = (height1>height2) ? height1:height2 ;
		int b = (height3>height2) ? height3:height2 ;
		int c = (a>b)? a:b;
		System.out.println("身高最高的是："+ c);

	}

}
