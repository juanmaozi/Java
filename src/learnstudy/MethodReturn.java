package learnstudy;
/*
 * 带返回值的方法定义
 * public static 数据类型 方法名（参数）{
           return 数据;
     }
     例：public static boolean isnumber(int number){
     return true;
     }
     public static int isnumber(int a,int b ){
     return 100;
     }
     注意：方法定义中retur后面的返回值与方法定义上的数据类型要匹配，否则程序会出错
     
     带返回值方法的调用
    格式：方法名(参数);
    例：is number(5);
    格式：数据类型 变量名=方法名(参数);
    例：boolean flag = is number(5);
    注意：方法的返回值通常会使用变量接受，否则该返回值将毫无意义    
     
 */

public class MethodReturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//方法名（参数）; 一般没有意义
		//isnumber(10);
		//true; 
		
		//数据类型 变量名=方法名(参数);
		boolean falg = isnumber(10);
		//boolean falg = true;
		System.out.println(falg);

	}
	// 需求：定义一个方法，该方法接受一个参数，判断是否为偶数
	public static boolean isnumber(int number) {
		if(number%2==0) {
			return true;
		}else {
			return false;
		}
	}

}
