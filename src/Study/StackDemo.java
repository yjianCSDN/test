package Study;

/**
 * @Author
 * @Date
 */
public class StackDemo {
    private Object[] i ;
    private  int index ;

    public StackDemo() {
        this.i = new Object[10];
        this.index = -1;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
    //压栈
    public void push(Object object){
        //查看栈帧是否指向了栈顶元素，如果指向了栈顶，则提示栈已满
        if (index >= i.length-1){
        System.out.println("栈满了！");
        return;
        }
        this.i[++index]=object;
        System.out.println("压栈"+object.toString()+"成功，栈帧指向"+index);
    }



    public void pop(){
        if (index>=0){
            System.out.println("栈内有元素，可以进行弹栈");

            System.out.println("弹栈"+i[index]);
            index--;
            System.out.print("此时栈帧指向"+index);
        }else {
            System.out.println("栈空，无法弹栈");
            return;
        }
    }

    public StackDemo(Object[] i) {
        this.i = i;
    }

    public Object[] getI() {
        return i;
    }

    public void setI(Object[] i) {
        this.i = i;
    }
}
