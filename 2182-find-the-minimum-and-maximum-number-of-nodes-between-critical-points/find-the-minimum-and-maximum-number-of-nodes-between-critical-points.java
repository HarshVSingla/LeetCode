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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        
        int[] ans = {-1,-1};

        if(head==null || head.next==null || head.next.next==null){
            return ans;
        }

        ListNode prev = head;
        ListNode temp = head.next;
        int ind = 2;

        int mind = Integer.MAX_VALUE;
        int first = -1;
        int last = -1;

        while(temp.next!=null){

            if((temp.val<prev.val && temp.val < temp.next.val) || (temp.val>prev.val && temp.val> temp.next.val)){
                if(first==-1){
                    first = ind;
                    
                }
                else{
                    mind = Math.min(mind,ind-last);
                    
                }
                last = ind;    
            }

            ind++;

            prev = temp;
            temp = temp.next;

        }

        if(first == last){
            return ans;
        }

        ans[0] = mind;
        ans[1] = last - first;
        return ans;

    }
}