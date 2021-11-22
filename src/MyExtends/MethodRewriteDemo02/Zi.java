package MyExtends.MethodRewriteDemo02;

public class Zi extends Fu {
    /*
    父类中私有方法，子类中不可能方法重写
    @Override //报错
    private void show(){
        System.out.println("Zi中show()方法被调用");
    }

     */
    /*
    @Override
    public void  method(){
        System.out.println("Zi中method()方法被调用");
    }

     */
    @Override
    //子类方法重写时，访问权限不能比父类低（public>默认>private ）
    public void  method(){
        System.out.println("Zi中method()方法被调用");
    }
}
