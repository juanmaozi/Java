package DuoTai.Demo02;
/*
多态的好处：提高了程序的扩展性
弊端：不能使用子类特有的功能
 */
public class AnimalDemo {
    public static void main(String[] args) {
        //创建动物操作类的对象，调用方法
        AnimalOperator ao =new AnimalOperator();
        Cat c =new Cat();
        ao.useAnimal(c);

        Dog d =new Dog();
        ao.useAnimal(d);

        Pig p =new Pig();
        ao.useAnimal(p);
    }
}
