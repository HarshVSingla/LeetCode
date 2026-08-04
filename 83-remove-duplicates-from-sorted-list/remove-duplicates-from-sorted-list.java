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

        // if(head==null || head.next==null){
        //     return head;
        // }

        // HashSet<Integer> set = new HashSet<>();

        // ListNode temp= head.next;
        // ListNode prev = head;

        // set.add(head.val);
        // while(temp!=null){
        //     if(!set.contains(temp.val)){
        //         set.add(temp.val);
        //         prev = temp;
        //         temp = temp.next;
        //     }

        //     else{
        //         prev.next = temp.next;
        //         temp = prev.next;
        //     }

        // }

        // return head; 


        // 2nd approach

        if(head==null || head.next==null){
            return head;
        }

        ListNode temp = head.next;
        ListNode prev = head;

        while(temp!=null){
            if(temp.val == prev.val){
                prev.next = temp.next;
                temp = prev.next;
            }
            else{
                prev = temp;
                temp = temp.next;
            }
        }

        return head;
        
    }
}