package Study;

import java.util.*;

/**
 * @Author
 * @Date
 */
public class ListDemo {
    public static void main(String[] args) {
        List list = new ArrayList();
        //list列表是不安全的，但是可以通过Collection.synchronizedList的方法来让list变成安全的
        //但是linkedList是安全的（双向链表）
        Collections.synchronizedList(list);
        for (int i =0;i<5;i++){
            list.add(i);
        }
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("a");
        list.add(4,"e");
        //list特有方法，插入元素：元素位置，元素
        list.set(1,"ddd");
        //list特有方法，修改集合元素：元素位置，元素
        //这种方式是list特有的方式
        Iterator i = list.iterator();
//        while(i.hasNext()){
//            System.out.println(i.next());
//        }
        //通过循环来便利list数组里面的元素
        for (int j =0;j<list.size();j++){
            System.out.println(list.get(j));
        }
        System.out.println();
        //对集合中的元素进行索引查找，返回该元素的下标
        //方法是indexof方法
        System.out.println(list.indexOf("ddd"));
        System.out.println();
        //返回该元素在集合中最后一次出现的下标
        System.out.println(list.lastIndexOf("a"));
    }

}
