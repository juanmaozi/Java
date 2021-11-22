package learnstudy;
/*
 * 案例：百钱百鸡
 * 公鸡5块，母鸡3块，小鸡一只三块，请问100块如何买到一百只鸡
 */

public class Chickens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//公鸡范围
		for(int x=0;x<20;x++) {
			//母鸡范围
			for(int y=0;y<33;y++) {
				//小鸡的范围
				int z = 100 - x - y;
				if(z%3==0 && 5*x+3*y+z/3==100) {
					System.out.println("x:"+x+"|"+"y:"+y+"|"+"z:"+z);
				}
			}
		}

	}

}
