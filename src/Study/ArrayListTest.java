package Study;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

/**
 * @Author
 * @Date
 */
public class ArrayListTest {
    public static void main(String[] args) {
        //创建ArrayList的构造方法
        List list = new ArrayList();//默认初始化容量为10

        List list1 = new ArrayList(100);//容量为100

        //通过该构造方法就可以将HashSet集合转变为ArrayList集合
        Collection c = new HashSet();
        c.add(100);
        c.add(200);
        c.add(300);
        c.add(50);
        List list2 = new ArrayList(c);
    }
}
