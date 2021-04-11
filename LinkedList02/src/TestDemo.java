/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HuYu
 * Date: 2021-04-10
 * Time: 00:44
 */
public class TestDemo {
    public static void main(String[] args) {
        MySingleLinkedList mySingleLinkedList = new MySingleLinkedList();
        mySingleLinkedList.createLinked();
        mySingleLinkedList.display();
        System.out.println("==============");
        mySingleLinkedList.addIndex(2,30);
        mySingleLinkedList.display();
    }
    public static void main6(String[] args) {
        MySingleLinkedList mySingleLinkedList = new MySingleLinkedList();
        mySingleLinkedList.createLinked();
        mySingleLinkedList.display();
        System.out.println("==============");

    }

    public static void main7(String[] args) {
        MySingleLinkedList mySingleLinkedList = new MySingleLinkedList();
        mySingleLinkedList.createLinked();
        mySingleLinkedList.display();
        System.out.println("==============");
        mySingleLinkedList.addFirst(2);
        mySingleLinkedList.addFirst(18);
        mySingleLinkedList.addFirst(8);
        mySingleLinkedList.display();
        System.out.println("==============");
        mySingleLinkedList.addLast(52);
        mySingleLinkedList.display();
        System.out.println("===============");


    }
    public static void main4(String[] args) {
        MySingleLinkedList mySingleLinkedList = new MySingleLinkedList();
        mySingleLinkedList.createLinked();//返回值为node类型的头节点
        mySingleLinkedList.display();
        System.out.println("=========");
        System.out.println(mySingleLinkedList.contains(22));
    }
    public static void main3(String[] args) {
        MySingleLinkedList mySingleLinkedList = new MySingleLinkedList();
        mySingleLinkedList.createLinked();//返回值为node类型的头节点
        mySingleLinkedList.display();
        System.out.println("=========");
        int ret = mySingleLinkedList.size();
        System.out.println(ret);
    }
    public static void main2(String[] args) {
        MySingleLinkedList mySingleLinkedList = new MySingleLinkedList();
        mySingleLinkedList.createLinked();//返回值为node类型的头节点
        mySingleLinkedList.display();
        System.out.println("=========");
        int n= 3;
        Node ret = mySingleLinkedList.FindN(n);
        System.out.println("第"+n+"个节点为"+ret.val);

        int ret2 = mySingleLinkedList.size();
        System.out.println(ret2);
    }
    public static void main1(String[] args) {
        MySingleLinkedList mySingleLinkedList = new MySingleLinkedList();
        mySingleLinkedList.createLinked();//返回值为node类型的头节点
        mySingleLinkedList.display();
        System.out.println("============");
        Node ret = mySingleLinkedList.FindLastNode();
        System.out.println(ret.val);
        System.out.println("============");
        Node ret2 = mySingleLinkedList.FindLastTwoNode();
        System.out.println(ret2.val);
        mySingleLinkedList.FindN(3);
        System.out.println("============");

        }

    }
