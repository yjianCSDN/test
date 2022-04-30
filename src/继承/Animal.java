package 继承;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author
 * @Date
 */
public class Animal{
    public static void main(String[] args) {
        Animal a = new Dog1();
        Animal b = new Bird();
        List<Animal> list = new ArrayList<>();
        list.add(a);
        list.add(b);
        for (int i =0;i<list.size();i++){
            if (list.get(i)instanceof Bird){
                Bird d = (Bird) list.get(i);
                d.fiy();
            }
        }

        a.jiao();
        System.out.println(a);
    }
    public  void jiao(){
        System.out.println("动物叫");
    }
 }
 class Dog1 extends Animal{
    public Dog1(){

        System.out.println("Dog的无参构造函数");
    }
    public void jiao(){

        System.out.println("汪汪");
    }
 }

 class Bird extends Animal{
    public void jiao(){
        System.out.println("鸟儿在唱歌");
    }
    public void fiy(){
        System.out.println("鸟儿在飞翔");
    }
 }
