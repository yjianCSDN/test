package 继承;

import 继承.Animal;
import 继承.ConfigReader;

public class Test{
    public static void main(String args[]) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        String className = ConfigReader.getclassName();
        Animal animal = (Animal) Class.forName(className).newInstance();//new Instance：实例（新建实例：创建Dog的对象）
        animal.jiao();
    }
}