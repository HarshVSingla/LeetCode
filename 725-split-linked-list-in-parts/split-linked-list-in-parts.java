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
    public ListNode[] splitListToParts(ListNode head, int k) {

        

        ListNode[] arr = new ListNode[k];
        if(head==null){
            return arr;
        }

        ListNode temp = head;
        int n=0;

        while(temp!=null){
            n++;
            temp = temp.next;
        }
        temp = head;

        int base = n/k;
        int extra = n%k;

        int a =0;

        while(temp!=null){

            int currentsize = base;
            if(extra>0){
                currentsize++;
                extra--;
            }

            for(int i=0;i<currentsize-1;i++){
                temp = temp.next;
            }
            ListNode newnode = temp;
            temp= temp.next;
            newnode.next = null;
            arr[a++] = head;
            head = temp;

        }

        return arr;     
        
    }
}