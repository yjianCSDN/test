package 线程;

/**
 * @Author
 * @Date
 */
public class ThreadTest {
    public static void main(String[] args) {
        ThreadDemo t =new ThreadDemo();
        test02 i = new test02();
        t.start();
        i.start();
    }
}
