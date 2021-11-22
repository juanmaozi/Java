package learnstudy;
/*
 * 统计水仙花数一共有多少个，并在控制台输出个数
 */
public class ForNarcissusCensus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		for(int i=100;i<1000;i++) {
			int a =i/100;//求百位
			int b =i/ 10 % 10;//求十位
			int c =i% 10 ;//求个位
			if(a*a*a + b*b*b + c*c*c == i){
				count++;
			
				
			}
		}
        System.out.println("水仙花数为："+ count+"个");
	}

}
