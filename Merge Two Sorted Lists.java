// https://leetcode.com/problems/merge-two-sorted-lists/



class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode pp=new ListNode(0,null);
        ListNode answer=pp;
        
        while(list1!=null && list2!=null){
            if(list1.val<=list2.val){
                answer.next=list1;
                answer=answer.next;
                list1=list1.next;
            }
            
            else{
                answer.next=list2;
                answer=answer.next;
                list2=list2.next;
            }
        }
        
        if(list1==null){
            answer.next=list2;
        }
        
        else{
            answer.next=list1;
        }
        return pp.next;
    }
}
