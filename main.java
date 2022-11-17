
public class main {

	public static void main(String[] args) {
		Node firstNode= new Node(10, null);
		Node p= firstNode;
		
		Node secNode= new Node(20, null);
		firstNode.setLink(secNode);
		
		Node thirdNode= new Node(30, null);
		secNode.setLink(thirdNode);
		
		Node fourthNode= new Node(40, null);
		thirdNode.setLink(fourthNode);
		
		Node fifthNode= new Node(50,null);
		fourthNode.setLink(fifthNode);
		
		System.out.println("First Node Info: "+p.getInfo());  //First Node Info
		System.out.println("2nd Node Link: "+p.getLink());  //Second Node Link
		System.out.println("2nd Node Info: "+p.getLink().getInfo());  //2nd link means 2nd Node    // 2nd link Info
		System.out.println("3rd Node Link: "+p.getLink().getLink());
		System.out.println("3rd Node Info: "+p.getLink().getLink().getInfo());
		System.out.println("4th Node Link: "+p.getLink().getLink().getLink());
		System.out.println("4th Node Info: "+p.getLink().getLink().getLink().getInfo());
		System.out.println("5th Node Link: "+p.getLink().getLink().getLink().getLink());
		System.out.println("5th Node Info: "+p.getLink().getLink().getLink().getLink().getInfo());
		System.out.println("6th Node Info: "+p.getLink().getLink().getLink().getLink().getLink());


	}

}
