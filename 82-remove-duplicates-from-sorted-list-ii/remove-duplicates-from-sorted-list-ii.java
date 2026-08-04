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
    public ListNode deleteDuplicates(ListNode head) {

        if(head==null || head.next==null){
            return head;
        }
        
        while(head!=null && head.next!=null && head.val == head.next.val){
            ListNode newhead = head.next;
            while(newhead!=null && head.val == newhead.val){
                ListNode temp = head;
                head = newhead;
                newhead = newhead.next;
                temp.next=null;
            
            }
            head = newhead;
            
        }
        if(head==null || head.next==null){
            return head;
        }

        ListNode prev = head;
        ListNode temp = head.next;

        while(temp!=null && temp.next!=null){

            if(temp.val != temp.next.val){
                prev = temp;
                temp = temp.next;
            }
            else{
                int x = temp.val;
                while(temp.next!=null && temp.next.val ==x){
                    temp = temp.next;
                }
                prev.next = temp.next;
                temp = prev.next;
            }
        }

        return head;        
    }
}