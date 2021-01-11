package Listandset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class setdemo {
    public static void main(String[] args) {
        Set set=new HashSet();
        set.add(1);
        set.add("河池学院");
        set.add(8888.88f);
        set.add(false);
        set.add(1);
        //因为set的特性，没有set.get，所以set想要输出经常使用以下代码
        System.out.println("当前集合的元素个数"+set.size());
        Iterator iterator=set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
