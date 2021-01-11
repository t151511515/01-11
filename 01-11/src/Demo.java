import java.util.HashSet;
import java.util.Set;

public class Demo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();    //Set的泛型定义了set只能为String类，此Demo只为解释泛型，一般以整个集合为定义
        set.add("河池学院");        //当给set赋值的是String类时，不会报错
        set.add(1);                 //当给set赋值的是其他类比如int类时，就会报错
    }
}
