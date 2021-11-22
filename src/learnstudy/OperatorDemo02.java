package learnstudy;
/*
 * 逻辑运算符
 */
public class OperatorDemo02 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		int a = 10 ;
		int b = 20 ;
		int c = 30 ;
		//& （简化与）有false则false 	
		System.out.println((a>b) & (a>c));//false & false = false
		System.out.println((a<b) & (a>c));//true & false = false
		System.out.println((a>b) & (a<c));//false & true = false
		System.out.println((a<b) & (a<c));//true & true = true
		System.out.println("---------");
		//| (简化或) 有true则true
		System.out.println((a>b) |  (a>c));//false |  false = false
		System.out.println((a<b) |  (a>c));//true |  false = true
		System.out.println((a>b) |  (a<c));//false |  true = true
		System.out.println((a<b) |  (a<c));//true |  true = true
		System.out.println("---------");
		//^(异或)& 相同为false，不同为true
		System.out.println((a>b) ^ (a>c));//false ^ false = false
		System.out.println((a<b) ^ (a>c));//true ^ false = true
		System.out.println((a>b) ^ (a<c));//false ^ true = true
		System.out.println((a<b) ^ (a<c));//true ^ true = false
		System.out.println("---------");		
		//! 非）奇数！为相反；偶数为相同
		System.out.println((a>b));//false
		System.out.println(!(a>b));//!false =true
		System.out.println(!!(a>b));//!!false=false
		System.out.println(!!!(a>b));//!!!false=true
		System.out.println("---------");
		/*
		 * 短路逻辑运算符
		 */
		        //&& （与）有false则false 	
				System.out.println((a>b) & (a>c));//false & false = false
				System.out.println((a<b) & (a>c));//true & false = false
				System.out.println((a>b) & (a<c));//false & true = false
				System.out.println((a<b) & (a<c));//true & true = true
				System.out.println("---------");
				//|| (或) 有true则true
				System.out.println((a>b) |  (a>c));//false |  false = false
				System.out.println((a<b) |  (a>c));//true |  false = true
				System.out.println((a>b) |  (a<c));//false |  true = true
				System.out.println((a<b) |  (a<c));//true |  true = true
				System.out.println("---------");
		//&&和& 作用相同，&&具有短路效果 同理||也是如此
				/*
				System.out.println((a++ > 100) & (b++ > 100));//false&false=false
				System.out.println("a:" + a);//a:11
				System.out.println("b:" + b);//b:21
				*/
				System.out.println((a++ > 100) && (b++ > 100));//false&false=false
				System.out.println("a:" + a);//a:11
				System.out.println("b:" + b);//b:20(短路&判断了(a++>100)为false，后面就不执行)
		
		
	}

}
