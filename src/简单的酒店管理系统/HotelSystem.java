package 简单的酒店管理系统;

import java.util.Scanner;

/**
 * @Author
 * @Date
 */
public class HotelSystem {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
//        hotel.print();

            System.out.println("欢迎使用酒店导航系统");
            System.out.println("请根据选项来选择你要使用的功能。1.查询房间状态。2.订房。3.退房。4.退出系统");
            Scanner sc = new Scanner(System.in);
            int i = sc.nextInt();
        while(true) {
            //死循环，为了不让酒店管理系统运行一次就结束
            //使用if语句来判断用户输入，获得用户想要的功能并进行下一步操作
            //缺点：对于已经订房的房间进行再次预定会产生报错
            if(i==1){
                hotel.print();
            }else if(i==2){
                System.out.println("请输入要订的房间号");
                int j = sc.nextInt();
                hotel.order(j);
            }else if(i==3){
                System.out.println("请输入要退的房间号");
                int k = sc.nextInt();
                hotel.exit(k);
            }else if(i==4){
                System.out.println("欢迎下次再来");
                return;
            }else{
                System.out.println("输入无效，请重新输入");
            }
        }
    }
}
