package learnstudy;
/*
 * 案例：逢七过
 * 从任意一个数字开始报数，当你报的数字包含7或是7的倍数时都要说过；在控制台输出1-100至今满足规则的数字，并打印出来
 */
public class EverySeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int x=1;x<=100;x++) {
			if(x%10==7 || x/10%10==7 || x%7==0) {
				System.out.println(x);
			}
		}

	}

}
