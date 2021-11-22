package MyExtends.ExtendsDemo03;
/*

子类中所有的构造方法默认都会访问父类中无参构造方法
1.因为子类会继承父类中的数据，可能还会使用父类数据。所以，在子类初始化前，一定要先完成父类数据初始化
2.每个子类构造方法的第一条语句默认都是：super()

如果父类中没有无参构造方法，只有带参构造方法，怎么办？
1.通过使用super关键字去显示的调用父类的带参构造方法
2.在父类中自己提供一个无参构造方法（推荐）
 */
public class Demo03 {
    public static void main(String[] args) {
        Zi z =new Zi();
        Zi z2 =new Zi(20);

    }
}
