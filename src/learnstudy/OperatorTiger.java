package learnstudy;
/*
 * 案例：两只老虎
 * 定义两个变量
 * 用条件运算符判断老虎体重，体重相同则true，不同则false
 */

public class OperatorTiger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int weight1 = 100 ;
		int weight2 = 200 ;
		/*
		 *理论上没错
		String weight ;
		if (100==100)
			weight = "true";
		else
			weight = "false";
		System.out.println(weight);
		*/
		boolean weight = weight1 == weight2 ? true:false;
		System.out.println("体重："+ weight);
	}

}
