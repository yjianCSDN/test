package Study;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @Author
 * @Date
 */
public class MapDemo {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put(1,"101");
        map.put(2,"102");
        map.put(3,"103");
        map.put(4,"104");
        System.out.println(map.size());

        //便利
        //根据key来拿到value
        Set set = map.keySet();// key set （key集合）
        System.out.println(set);

        Iterator iterator =  set.iterator();
        while (iterator.hasNext()){
            System.out.println(map.get(iterator.next()));
        }

    }
}
