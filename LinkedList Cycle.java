//  https://leetcode.com/problems/linked-list-cycle/



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
    public boolean hasCycle(ListNode head) {
        ListNode tortoise=head;
        ListNode hare=head;
        if(head==null  ){
            return false;
        }
        
        while(hare.next!=null && hare.next.next!=null){
            
            tortoise=tortoise.next;
            hare=hare.next.next;
           
            if(hare==tortoise){
                return true;
            }
            
            
        }
        return false;
    }
}
