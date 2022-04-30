package 集合;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @Author
 * @Date
 */
public class set {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add(1f);
        set.add("asdsa");
        set.add(114514);
        set.add("asdsa");
        set.remove(1f);

        System.out.println("数组一共有"+set.size()+"个。");
        /*for(Object i:set ){
            System.out.println(i);
        }*/
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println("迭代数为"+iterator.next());
        }
    }
}

