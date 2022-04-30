package Reflection;

/**
 * @Author
 * @Date
 */
public class TestStudent {
    private String password;
    public String name;
    boolean sex;
    public static int A;
    protected int age;

    public TestStudent(String password, String name, boolean sex, int age) {
        this.password = password;
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public TestStudent(String password, String name, int age) {
        this.password = password;
        this.name = name;
        this.age = age;
    }

    public TestStudent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public TestStudent(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "TestStudent{" +
                "password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                '}';
    }

    public TestStudent() {
        System.out.println("无参构造方法被调用");
    }

    public void login(String name, String password){
        if ((("小明").equals(name))&&("123456".equals(password))){
            System.out.println("登录成功");
        }else{
            System.out.println("登录失败");
        }
    }
    public void exit(){
        System.out.println("退出系统成功");
    }
}
