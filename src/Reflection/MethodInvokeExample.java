package Reflection;

/**
 * @Author
 * @Date
 */
public class MethodInvokeExample {
    private int password;
    public  String name;

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public void Login(String name, int password){
        this.name=name;
        this.password=password;
    }
}
