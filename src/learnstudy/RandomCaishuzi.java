package learnstudy;
/*
 * 案例：猜数字
 */
import java.util.Scanner;
import java.util.Random;
public class RandomCaishuzi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//输入的数字	
		//随机数
		Random r = new Random();
		int b = r.nextInt(100)+1;
		System.out.println("随机数为："+b);
		//输入的数字	
		System.out.println("请输入一个0-100数字：");
		while(true) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		//随机数

		//进行比较
		if(a>b) {
			System.out.println("你猜的数字大了");
		}else if(a<b) {
			System.out.println("你猜的数字小了");
		}else if(a==b){
			System.out.println("恭喜你猜中了");
			break;//猜中结束终止
			
		}}

	}

}
