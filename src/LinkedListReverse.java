import java.util.ArrayList;
import java.util.List;

//迭代
public class LinkedListReverse {
    public static void main(String[] args) {
        LinkedList node5 = new LinkedList(5,null);
        LinkedList node4 = new LinkedList(4,node5);
        LinkedList node3 = new LinkedList(3,node4);
        LinkedList node2 = new LinkedList(2,node3);
        LinkedList node1 = new LinkedList(1,node2);

        LinkedList node = node1;
        while(node != null){
            System.out.print(node.val+"->");
            node =  node.next;
        }

        System.out.println("反转后为");
        node1 = reserve1(node1);
        while(node1 != null){
            System.out.print(node1.val+"->");
            node1 =  node1.next;
        }


    }

    //反转
    public static LinkedList reserve1(LinkedList org){
        LinkedList prev = null, next;
        LinkedList curr = org;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

}



class LinkedList{
    Integer val;
    LinkedList next;

    public LinkedList() {
    }

    public LinkedList(Integer val, LinkedList next) {
        this.val = val;
        this.next = next;
    }

    public Integer getVal() {
        return val;
    }

    public void setVal(Integer val) {
        this.val = val;
    }

    public LinkedList getNext() {
        return next;
    }

    public void setNext(LinkedList next) {
        this.next = next;
    }
}
