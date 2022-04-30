package 集合;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author
 * @Date
 */
public class Mapa {
    public static void main(String[] args) {
        Map map = new HashMap();
        String A = "Spring, in climatology, season of the year between winter and summer during which temperatures gradually rise. It is generally defined in the Northern Hemisphere as extending from the vernal equinox (day and night equal in length), March 20 or 21, to the summer solstice (year's longest day), June 21 or 22, and in the Southern Hemisphere from September 22 or 23 to December 22 or 23. The spring temperature transition from winter cold to summer heat occurs only in middle and high latitudes; near the Equator, temperatures vary little during the year. Spring is very short in the polar regions. For physical causes of the seasons, see season.";
        A = A.replace(",", "").replace("!", "").replace(".", "").replace(" ", "").replace("(","").replace(")","").replace(";","").replace("'","");
        String[] B = A.split("");
        System.out.println(B.length);
        for (String word : B) {
            System.out.println(word+" ");

            if(map.containsKey(word)){
                int temp = (int)map.get(word);
                map.put(word,++temp);
            }else{
                map.put(word,1);}

    }
        System.out.println(map);

        }
    }

