import java.util.ArrayList;
import java.util.List;

public class Listdemo {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(1);
        list.add("河池学院");
        list.add(123456F);
        list.add(1);
        for(int i=0;i<list.size();i++){
            System.out.println("list.get(i)");
    }
    }
}
