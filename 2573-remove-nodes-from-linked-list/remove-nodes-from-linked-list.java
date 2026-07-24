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
    public ListNode removeNodes(ListNode head) {
        
        // ListNode curr = head;
        // ListNode prev = null;

        // while(curr!=null){
        //     ListNode Next = curr.next;
        //     curr.next = prev;
        //     prev = curr;
        //     curr = Next;
        // }
        // ListNode reverseagain = prev;
        // int max = prev.val;
        // ListNode newcurr = prev.next;

        // while(newcurr!=null){
        //     if(newcurr.val < max){
        //         prev.next = newcurr.next;
        //         newcurr = newcurr.next;
        //     }
        //     else{
        //         prev = newcurr;
        //         max = prev.val;
        //         newcurr = newcurr.next;

        //     }

        // }

        // ListNode newprev = null;
        // while(reverseagain!=null){
        //     ListNode newNe= reverseagain.next;
        //     reverseagain.next = newprev;
        //     newprev = reverseagain;
        //     reverseagain = newNe;
        // }

        // return newprev;



        // 2nd approach - recursion

        if(head == null || head.next==null){
            return head;
        }

        ListNode newhead = removeNodes(head.next);
        
        if(head.val >= newhead.val){
            head.next = newhead;
            newhead = head;
            return newhead;
        }
        else{
            head.next = null;
            return newhead;
        }
    }
}