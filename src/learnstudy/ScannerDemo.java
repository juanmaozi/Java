package learnstudy;
/*
 * 数据输入
 */
import java.util.Scanner;//导包

public class ScannerDemo {

	public static void main(String[] args) {
		// 创建对象
		Scanner sc = new Scanner(System.in);//sc为变量，其他固定；
		//接收数据
			int a 	 =sc.nextInt();

			//输出数据
				System.out.println("a:"+ a);
	}

}
