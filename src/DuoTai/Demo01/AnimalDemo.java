package DuoTai.Demo01;

/*
多态：
同一个对象，在不同时刻表现出来的不同形态

多态的前提和体现
有继承/实现关系
有方法重写
有父类引向子类对象

多态中成员访问特点
成员变量：编译看左边，执行看左边
成员方法：编译看左边，运行看右边

为什么不一样？
因为成员方法中有重写，而成员变量中没有
 */
public class AnimalDemo {
    public static void main(String[] args) {
        //有父类引向子类对象
        Animal a= new Cat();

        System.out.println(a.age);
//        System.out.println(a.weight);

        a.eat();
//        a.playGame();


    }
}
