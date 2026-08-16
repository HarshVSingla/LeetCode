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
    public ListNode reverseBetween(ListNode head, int left, int right) {

        if(head==null || head.next==null || left==right){
            return head;
        }



        ListNode PREV = null;
        ListNode temp = head;
        int a =1;

        for(int i=1;i<left;i++){
            PREV = temp;
            temp = temp.next;
            a = i+1;
        }

        ListNode END = temp;

        ListNode prev = null;

         
        while(temp!=null && a<=right){
            ListNode nextnode = temp.next;
            temp.next = prev;
            prev = temp;
            temp = nextnode;
            a++;
        }
        if(PREV!=null){
            PREV.next = prev;
        }
        else{
            head = prev;
        }

        END.next = temp;
        
        
        return head;
    }
}