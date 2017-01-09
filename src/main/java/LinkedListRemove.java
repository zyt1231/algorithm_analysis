import java.util.LinkedList;

/**
 * Created by Ting on 1/8/17.
 */

public class LinkedListRemove {
    public class ListNode {
        private int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }

    public void removeNode(ListNode node) {
            if(node==null){
                return;
            }
            node.val=node.next.val;
        node.next=node.next.next;
    }

    public void run(){
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        one.next = two;
        two.next = three;
        System.out.println(one.next.val);
        removeNode(two);
        System.out.println(one.next.val);

    }
    public static void main(String[] args) {
        LinkedListRemove r = new LinkedListRemove();
        r.run();
        System.out.println();
    }
}
