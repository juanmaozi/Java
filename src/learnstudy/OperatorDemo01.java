package learnstudy;
/*
 关系运算符
 结果都是boolean类型，只有false 或 true
 */
public class OperatorDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a =10;
		int b =20;
		int c =10;
		//==运算符 大于
		System.out.println(a==b); //false
 		System.out.println(a==c); //true
 		//!==运算符 不等于
 		System.out.println("-------");
 		System.out.println(a!=b);//ture
 		System.out.println(a!=c);//false
 		
 		// 不小心将== 写成了=
 		System.out.println(a=b); //20，将b赋值给a
 	
	}

}
