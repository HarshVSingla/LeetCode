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
    public ListNode sortList(ListNode head) {
        
        if(head==null || head.next==null){
            return head;
        }
        ListNode temp = head;
        List<ListNode> arr = new ArrayList<>();
        int n=0;
        while(temp!=null){
            arr.add(temp);
            temp = temp.next;
        }

        Collections.sort(arr,(a,b) -> Integer.compare(a.val,b.val));

        ListNode newhead = arr.get(0);
        ListNode temp2 = newhead;

        for(int i=1;i<arr.size();i++){
            temp2.next = arr.get(i);
            temp2 = temp2.next;
        }
        temp2.next = null;

        return newhead;
    }
}