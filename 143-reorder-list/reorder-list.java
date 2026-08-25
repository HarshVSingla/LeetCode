/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {

        if(head==null || head.next==null){
            return ;
        }

        // ListNode slow = head;
        // ListNode fast = head;
        // ListNode end = head;

        // while(fast!=null && fast.next!=null){
        //     fast = fast.next.next;
        //     end = slow;
        //     slow = slow.next;

        // }

        // ListNode prev = null;
        // ListNode temp = slow;

        // end.next= null;


        // while(temp!=null){
        //     ListNode nextnode= temp.next;
        //     temp.next = prev;
        //     prev = temp;
        //     temp = nextnode;
        // }

        // temp = head;
        // while(temp.next!=null && prev.next!=null){
        //     ListNode nextor = temp.next;
        //     ListNode nextre = prev.next;

        //     temp.next = prev;
        //     prev.next = nextor;
        //     temp = nextor;
        //     prev = nextre;
        // }

        // if(temp.next==null){
        //     temp.next = prev;
        // }
        // else{
        //     prev.next = temp;
        // }


        // return ;


        // optimising 
        

        
        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null&&  fast.next!=null){
            fast= fast.next.next;
            slow = slow.next;
        }

        ListNode second = slow.next;
        slow.next = null;

        ListNode prev = null;
        while(second!=null){
            ListNode nextnode= second.next;
            second.next = prev;
            prev = second;
            second =nextnode;
        }

        ListNode temp = head;

        while(prev!=null){
            ListNode next1 =temp.next;
            ListNode next2 =prev.next;
            temp.next = prev;
            prev.next = next1;

            temp= next1;
            prev = next2;
        }

        return ;
    }
}