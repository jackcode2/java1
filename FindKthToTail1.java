public class Solution {
    public ListNode FindKthToTail(ListNode head,int k) {
	Node front=head;
	Node back=head;
	for(int i=0;i<k;i++)
	{
	if(front==null)
	{
	return null;
	}
	front=front.next;
	}
	while(front!=null)
	{
	back=back.next;
	front=front.next;
	}
	return back;
	}
	}