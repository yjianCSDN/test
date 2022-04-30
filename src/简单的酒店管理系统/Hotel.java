package 简单的酒店管理系统;

/**
 * @Author
 * @Date
 */
public class Hotel {

    private Room[][] rooms;
    public  Hotel(){
        rooms = new Room[3][10];
        for (int i =0;i<rooms.length;i++){
            for (int j =0;j<rooms[i].length;j++){
                if (i==0) {
                    rooms[i][j] = new Room((i + 1) * 100 + j+1, "单人间", true);
                }else if (i==1) {
                    rooms[i][j] = new Room((i + 1) * 100 + j+1, "标准间", true);
                }else if(i==2){
                    rooms[i][j] = new Room((i + 1) * 100 + j+1,"豪华间",true);
                }
            }
        }
    }
    public void print(){
        //打印房间的状态以及编号
        for(int i=0;i<rooms.length;i++){
            for (int j =0;j<rooms[i].length;j++){
            Room room = rooms[i][j];
                System.out.print(room);
            }
            System.out.println();
            System.out.println();
        }

    }
    public void order(int no){
        //订房，从获取房间的编号来判断房间是否被租借出去，用布尔类型来表示
        //如果被借出去就将状态改成1（false）

        Room room = rooms[no / 100 - 1][no % 100 - 1];
        room.setStauts(false);
        System.out.println(no+"已订房");
    }
    public void exit(int no){
        //退房，从获取房间的编号来判断房间是否被租借出去，用布尔类型表示
        //如果被借出去就将状态改成1（true）

        Room room = rooms[no / 100 - 1][no % 100 - 1];
        room.setStauts(true);
        System.out.println(no+"已退房");
    }

}

