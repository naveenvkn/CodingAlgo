package LinkedList;



class CloneRandList {
	
	public static Noden clone(Noden start)
	{
		Noden cur,tmp;
		cur=start;
		while(cur!=null)
		{
			tmp=cur.next;
			cur.next=new Noden(cur.data);
			cur.next.next=tmp;
			cur=tmp;
		}
		cur=start;
		while(cur!=null)
		{
			cur.next.random=cur.random.next;
			cur=cur.next.next;
		}
		Noden orig=start;
		Noden copy=start.next;
		Noden res=copy;
		while(orig!=null && copy!=null)
		{
			orig.next=(orig.next!=null?orig.next.next:orig.next);
			copy.next=(copy.next!=null?copy.next.next:copy.next);
			orig=orig.next;
			copy=copy.next;
		}
		return res;
	}
	public static void printList(Noden n)
	{
		Noden tmp=n;
		while(tmp!=null)
		{
			System.out.println("Data:"+tmp.data+" Random:"+tmp.random.data);
			tmp=tmp.next;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Noden start = new Noden(1);
	    start.next = new Noden(2);
	    start.next.next = new Noden(3);
	    start.next.next.next = new Noden(4);
	    start.next.next.next.next = new Noden(5);
	 
	    // 1's random points to 3
	    start.random = start.next.next;
	 
	    // 2's random points to 1
	    start.next.random = start;
	 
	    // 3's and 4's random points to 5
	    start.next.next.random = start.next.next.next.next;
	    start.next.next.next.random = start.next.next.next.next;
	 
	    // 5's random points to 2
	    start.next.next.next.next.random = start.next;
	 
	   System.out.println("Original list:");
	   printList(start);
	 
	    System.out.println("Cloned List:");
	    Noden cloned_list = clone(start);
	    printList(cloned_list);

	}

}
class Noden
{
	int data;
	Noden random;
	Noden next;
	Noden(int data)
	{
		this.data=data;
		this.random=null;
		this.next=null;
	}
}
