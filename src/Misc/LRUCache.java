package Misc;

public class LRUCache {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class DoublyLinkedList
{
	int size;
	int currentsize;
	Node head,tail;
	DoublyLinkedList(int size)
	{
		this.size=size;
		currentsize=0;
	}
	public void printlist()
	{
		Node tmp=head;
		while(tmp != null)
		{
			System.out.print(tmp.pageNumber+"->");
			tmp=tmp.next;
		}
	}
	public Node addpagetolist(int pagenumber)
	{
		Node n=new Node(pagenumber);
		if(head==null )
		{
			head=n;
			tail=n;
			currentsize=1;
			return n;
		}
		else if(currentsize<size)
		{
			currentsize++;
		}
		else
		{
			tail=tail.prev;
			tail.next=null;
		}
		head.prev=n;
		n.next=head;
		head=n;
		return n;
	}
	public void movepagetohead(Node n)
	{
		if(n==null || n==head)
			return;
		if(n==tail)
		{
			tail=tail.prev;
			tail.next=null;
		}
		n.prev.next=n.next;
		if(n.next != null)
			n.next.prev=n.prev;
		n.prev=null;
		n.next=head;
		head.prev=n;
		head=n;
	}
}
class Node
{
	int pageNumber;
	Node prev;
	Node next;
	Node(int pn)
	{
		this.pageNumber=pn;
	}
}
