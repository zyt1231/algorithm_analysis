import java.util.LinkedList;

/**
 * Created by Ting on 1/8/17.
 */

public class LinkedListRemove {
    public class ListNode {
        int val;
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


    public static void main(String[] args) {
        System.out.println();
    }
}
