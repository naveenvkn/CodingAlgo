package LinkedList;

public class Reverse {
	public static void main(String[] args)
	{
		LinkedList l=new LinkedList();
		l.push(6);
		l.push(5);
		l.push(4);
		l.push(3);
		l.push(2);
		l.push(1);
		l.print();
		l.reverse();
		System.out.println("\nAfter Reverseing the list");
		l.print();
	}

}
class Node{
	int data;
	Node next;
	Node(int d)
	{
		data=d;
		next=null;
	}
}
class LinkedList
{
	Node head;
	public  void push(int d)
	{
		Node n=new Node(d);
		n.next=head;
		head=n;
	}
	public void reverse()
	{
		Node current=head;
		Node prev=null;
		Node next=null;
		while(current!=null)
		{
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
		}
		head=prev;
	}
	public void print()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
}