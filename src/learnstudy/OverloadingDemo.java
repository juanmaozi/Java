package learnstudy;
/*
 * 方法重载练习
 * 使用方法重载思想，设计比较两个整数是否相同，兼容全整数类型
 */

public class OverloadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//方法调用byte
		boolean result = number((byte)1,(byte)2);
		System.out.println(result);
		//short
		boolean result2 = number((short)6,(short)8);
		System.out.println(result2);
		//int
		boolean result3 = number((int)11,(int)11);
		//long
		System.out.println(result3);
		boolean result4 = number(198L,292L);
		System.out.println(result4);

	}
	//byte
	public static boolean number(byte a,byte b) {
		System.out.println("byte");
		if(a==b) {
			return true;
		}else {
			return false;
		}
	}
	//short
	public static boolean number(short a,short b) {
		System.out.println("short");
		if(a==b) {
			return true;
		}else {
			return false;
		}
	}
	//int
	public static boolean number(int a,int b) {
		System.out.println("int");
		if(a==b) {
			return true;
		}else {
			return false;
		}
	}
	//long
	public static boolean number(long a,long b) {
		System.out.println("long");
		if(a==b) {
			return true;
		}else {
			return false;
		}
	}

}
