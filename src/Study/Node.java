package Study;



/**
 * @Author
 * @Date
 * 单链表
 * 优点：随机增删的效率较高
 * 缺点：查找的效率较低，每一次查找结点都需要从头开始查找
 */
public class Node {
    Object element;
    Node node;

    public Node(Object element, Node node){
    this.element = element;
    this.node = node;
    }

    public Node next() {
        return node;
    }
}
