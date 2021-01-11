abstract class person {
    public int a;         //抽象类可以声明变量

    public abstract void name();   //抽象方法，且不能有方法体，子类必须重写(使用)

    public void play() {             //普通方法，子类非必须使用
        System.out.println(name + "玩");
    }
}

class man extends person{

    @Override
    public void name() {
        String name=""
    }
}