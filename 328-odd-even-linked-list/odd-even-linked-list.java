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
    public ListNode oddEvenList(ListNode head) {

        if(head==null || head.next==null||head.next.next==null){
            return head;
        }
        
        ListNode evenhead = head.next;
        ListNode temp = head;
        ListNode temp2 = head.next;

        while(temp2!=null && temp2.next!=null){

            temp.next = temp.next.next;
            temp2.next = temp2.next.next;
            temp = temp.next;
            temp2 = temp2.next;

        }

        temp.next = evenhead;

        return head;
    }
}