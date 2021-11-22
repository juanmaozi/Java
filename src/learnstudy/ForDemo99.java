package learnstudy;

public class ForDemo99 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		for(int i =1;i<10;i++) {//外层循环
			for(int j =1;j<=i;j++) {//内层循环
				System.out.print(j+"*"+i+"="+(j*i)+"\t");//"\t" Tab键
			}
			System.out.print("\n");//换行
		}

	}

}
