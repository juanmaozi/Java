package learnstudy;
import java.util.Random;
/*
 * Random作用：产生一个随机数 //首字母大写
 * 1.导包：import java.util.Random
 * 2.创建对象：Random r = new Random(); 其中r为变量，其他不允许变
 * 3.获取随机数：int number =r.nextInt(10); //获取数据的范围：[0,10) 包括0，但不包括10
                   numbe是变量名，可以变，数字10可以变，其他不允许变。
  */

public class RandomDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r =new Random();
		//用循环获取10个随机数
		for(int i=0;i<10;i++) {
			int number = r.nextInt(10);
		System.out.println("number:"+number);
		}
		

	}

}
