package Study;




/**
 * @Author
 * @Date
 */
public class Link {

    Node header ;
    public void add(Object element){
    //增加的方法：先判断增加的节点是否是头节点（header）
    //让新加单链表的的尾节点指向添加中间的下一个节点位置
    //让之前单链表的末尾节点指向新对象
        if (header==null){
        header = new Node(element,null);
        }else{
        Node currentLastNode = findLast(header);
        //currentLastNode.next() = new Node(element,null);
        }
    }

    private Node findLast(Node node) {
        if (node==null){
            return node;
        }
        return findLast(node.next());
    }

    public void delete(Object element){

    }

    public void update(Object element){

    }

    public int find(Object element){
    return 1;
    }
}
