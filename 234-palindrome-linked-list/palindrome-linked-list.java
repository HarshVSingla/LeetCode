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
    public boolean isPalindrome(ListNode head) {
        
        if(head==null){
            return false;
        }

        if(head.next==null){
            return true;
        }

        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode prev = null;
        while(slow!=null){
            ListNode nextnode = slow.next;
            slow.next = prev;
            prev = slow;
            slow = nextnode;
        }

        boolean h = true;
        while(head!=null && prev!=null){
            if(head.val != prev.val){
                h = false;
                break;
            }
            head = head.next;
            prev = prev.next;
        }

        return h;        
    }
}