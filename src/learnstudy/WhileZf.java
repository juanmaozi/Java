package learnstudy;
/*
 * 珠穆朗玛峰为8844430毫米，假如我有一张纸，厚度0.1毫米，我要叠多少次才能叠成珠穆朗玛高度
 */

public class WhileZf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//定义一个计数器，初始值为0
		int count = 0 ;
		//定义纸张厚度
		double paper = 0.1 ;
		//定义峰高度
		int zf = 8844430;
		//
		while(paper<zf) {
			paper *=2 ;
			count++;
		}
		System.out.println("总共叠："+ count);

	}

}
