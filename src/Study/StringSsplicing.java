package Study;

/**
 * @Author
 * @Date
 */
public class StringSsplicing {
    public static void main(String[] args) {
        //StringBuffer创建了一个容量为16大小的数组，可以使用append()方法来对字符串进行拼接
        StringBuffer sb = new StringBuffer();
        sb.append('a');
        sb.append(12);
        sb.append(3.1415);
        sb.append(false);
        System.out.println(sb);

        //使用StringBuilder也可以进行字符串拼接
        StringBuilder demo = new StringBuilder();
        demo.append(123);
        demo.append(3.1);
        demo.append(false);
        demo.append("你好");
        System.out.println(demo);
    }
}
