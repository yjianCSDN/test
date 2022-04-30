package Study;

/**
 * @Author
 * @Date
 */
public class Conversion {
    public static void main(String[] args) {
        //String转化为int类型
        int demo =  Integer.parseInt("200");
        System.out.println(demo+1);

        //int转化为String类型：通过链接的方式可以转化为字符串
        String demo2 = 100+"";
        System.out.println(demo2);

        //Integer转化为String类型： 通过Integer.valueOf方法能够将字符串转化为Integer类型
        Integer demo3 = Integer.valueOf("123456");
        System.out.println(demo3);

        //String转化为Integer类型
        String demo4 = String.valueOf(demo3);
        System.out.println(demo4);
    }
}
