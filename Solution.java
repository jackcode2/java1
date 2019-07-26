Class Node{
	int val;
	Node next=null;
public Node(int val){
	this.val=val;
}
}
public class Solution {
    Node removeAll(Node head, int val) {
		Node prev=null;
		Node cur=head;
	while(cur!=null)
	{
		if(cur.val==val)
		{
			if(cur==head)
			{
				head=cur.next;
			}
			else{
				prev.next=cur.next;
			}
		}
		else{
			prev=cur;
		}
		cur=cur.next;
	}
	return head;
	}
		
		