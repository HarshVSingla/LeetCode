/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {

        // ListNode temp = head;
        // int a =0;

        // HashMap<ListNode,Integer> map = new HashMap<>();

        // while(temp!=null){
        //     if(!map.containsKey(temp)){
        //         map.put(temp,a++);
        //         temp = temp.next;

        //     }
        //     else{
        //         return temp;
        //     }
        // }
        // return null;



        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow==fast){
                ListNode ptr = head;

                while(ptr!=slow){
                    slow = slow.next;
                    ptr = ptr.next;
                }

                return ptr;
            }
        }

        return null;

        
        }
}