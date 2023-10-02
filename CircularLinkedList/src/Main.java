
public class Main {

	public static void main(String[] args) {
		LinkedListType<String> lt= new LinkedListType<String>();
		lt.initializeList();
		lt.insertFirst("First");
		lt.insertLast("Second");
		lt.insertLast("Third");
		lt.insertLast("Fourth");
		lt.insertLast("Fifth");
		System.out.println("Items in the Linked List are:");
		lt.Print();
		System.out.println("Last Node is: "+lt.last.getInfo());
		System.out.println("Node after Last Node is:"+lt.last.getLink().getInfo());
		System.out.println("Is Empty: "+lt.isEmpty());
		System.out.println("Size is: "+lt.size());
		lt.initializeList();
		System.out.println("Size is: "+lt.size());
		lt.Print();
		
	}

}
