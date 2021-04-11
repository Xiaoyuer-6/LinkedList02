import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HuYu
 * Date: 2021-04-10
 * Time: 00:44
 */
//链表的实现
    class Node{
        int val;
        public Node next;
        //提供构造方法
    public Node(){//无参

    }
    public Node(int val){//有参，new一个新节点时，必须给val一个值
        this.val = val;
    }
            }
public class MySingleLinkedList {
    public Node head;//表示链表的头，默认为null；
        //创建一个链表
        public void createLinked(){
            this.head = new Node(12);
            Node node2 = new Node(22);
            Node node3 = new Node(32);
            Node node4 = new Node(42);
            head.next = node2;
            node2.next = node3;
            node3.next = node4;
    }
   //找到链表的第n个节点；
    public Node FindN(int N){
            Node head = this.head;
            Node cur = this.head;
            int count = 1;
            if(head==null){//链表为空
                System.out.println("链表为空");
                return null;
            }
            if(N <0){
                System.out.println("n不符合要求！");
                return null;
            }
            if(N>size()){
                System.out.println("n超出链表长度");
                return null;
            }

            while (count != N ){
                cur= cur.next;
                count++;
            }
            return cur;
    }
    //找倒数第一个
    public Node FindLastNode(){
        Node cur = this.head;
        if(head==null){
            System.out.println("链表为空");
            return null;

        }
        if(head.next == null){
            System.out.println("只有一个节点！");
            return null;
        }
        while (cur.next!= null){
            cur= cur.next;
        }
        return cur;
    }

    //找倒数第二个
    public Node FindLastTwoNode(){
        Node cur = this.head;
        if(head==null){
            System.out.println("链表为空");
            return null;
        }
        while (cur.next.next != null){
            cur= cur.next;
        }
        return cur;
    }
    // 查找是否包含关键字key是否在单链表当中
    public boolean contains(int key) {
            Node cur =this.head;
            if(head==null){
            System.out.println("链表为空");
            }
            while (cur!=null){
                if(cur.val==key){
                    return true;
                }
                cur = cur.next;
            }
            return false;
    }
    //头插法
    public void addFirst(int data) {
            Node node = new Node(data);
            if(head==null){
             this.head = node;
           }
            node.next= this.head;//先绑后边的
            this.head = node;
            //优化：
        //node.next= this.head;//先绑后边的
        //this.head = node;
    }

    // 尾插法
    public void addLast(int data) {
            Node node = new Node(data);
            Node cur = this.head;
            if(head ==null){
                this.head= node;
            }
            //找到最后一个结点
        while (cur.next!=null){
            cur = cur.next;
        }
        cur.next=node;
        node.next= null;
    }

    // 任意位置插入,第一个数据节点为0号下标
    public void addIndex(int index, int data) {
            if(index<0 || index> size()){
                System.out.println("");
            }
            if(index==0){
                addFirst(data);
            }
            if(index ==size()){
                addLast(data);
            }
            Node cur = this.head;
            Node node = new Node(data);
            int count =0;
            while (count != index-1){
                cur = cur.next;
                count++;
            }
             node.next = cur.next;
             cur.next=node;
    }


    //删除第一次出现关键字为key的节点
    public void remove(int key) {


    }

    //删除所有值为key的节点
    public void removeAllKey(int key) {

    }
    // 得到单链表的长度
    public int size(){
            Node cur = this.head;
            int count=0;
            if(head==null){
                System.out.println("链表为空");
            }
            while (cur !=null ){
                cur= cur.next;
                count++;
            }
            return count;
}
    public void display(){
        Node head = this.head;
        Node cur = this.head;
        while (cur!=null){
            System.out.print(cur.val+" ");
            cur= cur.next;
        }
        }
     public void clear(){

     }


}
