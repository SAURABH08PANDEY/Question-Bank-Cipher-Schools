// https://leetcode.com/problems/merge-k-sorted-lists/


class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
                PriorityQueue<ListNode> queue= new PriorityQueue<ListNode>((a,b)-> a.val-b.val);
                for(var x:lists){
                    if(x!=null)
                    queue.offer(x);
                }

                ListNode answer=new ListNode(0);
                ListNode popin=answer;
                while(!queue.isEmpty()){
                    ListNode temp=queue.poll();
                    answer.next=temp;
                    answer=answer.next;
                    if(answer.next!=null){
                        queue.offer(answer.next);
                    }
                }
                return popin.next;
    }
}
