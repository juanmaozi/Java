package learnstudy;

public class Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		double a = 6.0 ;
		int b = 4 ;
		double c = a / b ; //运算符 除
		System.out.println(c );
*/
/*		System.out.println("IT" +  "传智"); //字符串+操作
	}
*/
		int i = 10 ;
				System.out.println("i:" + i);
                 /*i = i + 20 */
			//	i += 20 ; // += 把左边和右边的数据做加法操作，结果赋值给左边
			System.out.println("i:" + i ); //结果为30
			short s =10;
			// s += 20 ; //+=隐含强转操作
			s = (short) (s + 20); //20为int类型 需要强转
			System.out.println("s:" + s);
			/* i -= 5 ; //将10-5的值赋值给i
			System.out.println("i-:" + i);
			*/
			//自增自减运算符
			int a =199;
			int b =100 ;
			System.out.println(a++);
			System.out.println(a); //a+1 = 200
			System.out.println(b--);
			System.out.println(b); //b-1 = 99
			//参与操作使用
			int j = ++ i; 
			int k = i ++ ;
			System.out.println("i:" + i);
			System.out.println("j:" + j);
			System.out.println("k:" + i);
			}
}
