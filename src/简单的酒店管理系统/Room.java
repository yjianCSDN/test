package 简单的酒店管理系统;

import java.util.Arrays;
import java.util.Objects;

/**
 * @Author
 * @Date
 */
public class Room {
    private int no;
    private String type;
    private  boolean stauts;

    Room[][] rooms = new Room[3][10];

    //for(int i =0;i<){

//    }

        public Room() {
    }

    public Room(int no, String type, boolean stauts) {
        this.no = no;//房间编号
        this.type = type;//房间状类型
        this.stauts = stauts;//房间状态
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room1 = (Room) o;
        return no == room1.no &&
                stauts == room1.stauts &&
                Objects.equals(type, room1.type) &&
                Arrays.equals(rooms, room1.rooms);
    }


    public void order(int no){
    //订房，从获取房间的编号来判断房间是否被租借出去，用布尔类型来判断是否被借出去
    //如果被借出去就将状态改成1
    this.no =no;
          rooms[no / 100 - 1][no % 100 - 1].stauts = false;
    }
    public void exit(int no){
        //订房，从获取房间的编号来判断房间是否被租借出去，用布尔类型来判断是否被借出去
        //如果被借出去就将状态改成1
        this.no =no;
        rooms[no / 100 - 1][no % 100 - 1].stauts = true;
    }
    @Override
    public String toString() {
        return "["+no+type+(stauts?"空闲":"占用")+"]";
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isStauts() {
        return stauts;
    }

    public void setStauts(boolean stauts) {
        this.stauts = stauts;
    }
}
