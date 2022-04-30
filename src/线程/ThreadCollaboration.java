package 线程;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author
 * @Date
 */
public class ThreadCollaboration {
    private static List<Integer> hotDogs = new ArrayList<Integer>();

    public static void main(String[] args) {
        for (int i = 0; i <= 3; i++) {
            new Cooker(i).start();
        }
        for (int i = 0; i <= 10; i++) {
            new Consumer(i).start();
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    static class Cooker extends Thread {
        int i = 1;
        int pid;

        public Cooker(int id) {
            this.pid = id;
        }

        public void run() {
            while (true) {
                synchronized (hotDogs) {
                    if (hotDogs.size() < 10) {
                        hotDogs.add(pid * 10000 + i);
                        System.out.println("生产者" + pid + "正在生产热狗，热狗编号为" + pid * 1000 + i);
                        i++;
                        hotDogs.notifyAll();
                    } else {
                        try {
                            //sleep(1000);
                            System.out.println("热狗数量到达上限（10个），等待顾客买热狗！");
                            hotDogs.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }

            }
        }
    }


    static class Consumer extends Thread {
        int id;

        public Consumer(int i) {
            this.id = i;
        }

        public void run() {
            while (true) {
                synchronized (hotDogs) {
                    try {
                        sleep(200);

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if (hotDogs.size() > 0) {
                        System.out.println("消费者"+id+"正在消费热狗，热狗编号为"+hotDogs.remove(0));
                        hotDogs.notifyAll();
                    }else{
                        try {
                            //sleep(1000);
                            System.out.println("没有热狗了，等待商家生产");
                            hotDogs.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }
}

