
public class LinkedListType<E> {
	private int count=0;
	Node first=null;
	Node last=null;
	LinkedListType(){ 
		
	}
	public int size() {
		return count;
	}
	public Node getBack() {
		return last;
	}
	public void initializeList() {
		count=0;
		first=null;
		last=null;
	}
	public boolean isEmpty() {
		if(count==0) {
			return true;
		}
		else {
			return false;
		}
	}
	public void insertFirst(E info) { //Important
		Node<E> newNode= new Node<E>(info,first);
		if(last==null) {
			first=last=newNode;
			count++;
		}
		else {
			newNode.setLink(first);
			first=newNode;
			last.setLink(first);
			count++;
		}
		
	}
	
	public void insertLast(E info) {   //Important
		Node <E> newNode= new Node<E>(info,first);
		
		if(first==null) {
			first=last=newNode;
			count++;
		}
		else {
			last.setLink(newNode);
			last=newNode;
			last.setLink(first);
			count++;
		}
	}
	
	public void Print() { //Important
		if(isEmpty()) {
			System.out.println("Linked List is Empty!");
		}
		else {
			Node i=first;
			do {
				System.out.print(i.getInfo()+" ");
				i=i.getLink();
			}
			while(i!=first);
			System.out.println();
		}

	}

}
