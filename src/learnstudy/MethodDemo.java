package learnstudy;
/*
 * 方法的定义
 * 语法格式:
 * 修饰符 返回值类型 方法名(参数类型 参数名1,参数类型 参数名2){
       方法体;
       return 返回值;
  }
  例子：public static int max(int num1,int num2){
    int result = 0;
    if(num1>num2){
    result=num1;
    }else{
    result=num2;
   }
   return result; 
  }
 * 
 * 重点：方法先定义后调用，否则程序报错
 */
public class MethodDemo {

	public static void main(String[] args) {
		/*
		// 调用方法
		isnumber();

	}
	// 需求：定义一个方法，在方法中定义一个变量，判断是否为偶数
	public static void isnumber() {
		//定义变量
		int number = 199;
		//判断是否为偶数
		if(number%2==0) {
			System.out.println(number + "是偶数");
		}else {
			System.out.println(number + "不是偶数");
		}
		*/
		
		//带参数方法的定义和调用
		//形参：方法定义中的参数:int number
		//实参：方法调用中的参数：199 number
		//常量值的调用
		//isnumber(199);
		//变量的调用
		int number =199;
		isnumber(number);
	}
	public static void isnumber(int number) {
			if(number%2==0) {
				System.out.println(true);
			}else {
				System.out.println(false);
			}
			
		}
}
