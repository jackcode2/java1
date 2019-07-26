public class Solution {
    public ListNode FindKthToTail(ListNode head,int k) {
	int len=0;
	for(ListNode cur=head;cur!=null;cur=cur.next){
	len++;
	}
	if(len<k)
	{
	return null;
	}
	int steps=len-k;ListNode r=head;
	for(int i=0;i<steps;i++){
	r=r.next;
	}
	return r;
	}