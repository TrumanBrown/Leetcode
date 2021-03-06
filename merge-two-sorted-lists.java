/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode l3=new ListNode(-1); //root
        ListNode prev=l3; //This is the pointer to current node being compared
        // if(l1==null && l2==null)
        // {
        //     l3=null;
        //     return l3;
        // }
        while(l1!=null && l2!=null)
        {
            if(l1.val<=l2.val)
            {
                prev.next=l1;
                l1=l1.next;
            }
            else //l2.val<l1.val
            {
                prev.next=l2;
                l2=l2.next;
            }
            prev=prev.next;
        }
        if(l1==null)
        {
            prev.next=l2;
        }
        if(l2==null)
        {
            prev.next=l1;
        }
        return l3.next;
    }
}
