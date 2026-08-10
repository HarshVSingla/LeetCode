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
        
        int[] ans  = {-1,-1};

        if(head==null || head.next==null || head.next.next==null){
            return ans;
        }

        List<Integer> arr = new ArrayList<>();

        ListNode temp = head.next;
        ListNode prev = head;

        int a =2; 

        while(temp.next!=null){
            if((temp.val<prev.val && temp.val<temp.next.val) || (temp.val>prev.val && temp.val>temp.next.val)){
                arr.add(a);
            }
            a++;
            prev = temp;
            temp = temp.next;
        }

        int n = arr.size();

        if(n<2){
            return ans;
        }
        
        ans[1] = arr.get(n-1) - arr.get(0);

        int min =Integer.MAX_VALUE;

        for(int i=1;i<n;i++){
            min = Math.min(min,arr.get(i) - arr.get(i-1));
        }

        ans[0] = min;
        return ans;
    }
}