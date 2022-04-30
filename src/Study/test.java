package Study;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Author
 * @Date
 */
public class test {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        a.add(true);
        a.add(123);
        a.add("abc");
        Iterator S =a.iterator();
        while (S.hasNext()){
            System.out.println(S.next());
            //迭代器删除元素方法为remove()删除迭代器当前的元素
            //迭代器删除元素时，会自动更新迭代器，并且更新集合（删除集合中的元素）
            //删除的一定是迭代器指向的元素
            S.remove();
        }
        System.out.print(a);
    }
}
