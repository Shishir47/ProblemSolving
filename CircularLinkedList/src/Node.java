
public class Node <E>{
		Node(){
			
		}
		private E info;
		private Node link;
		Node(E info, Node link){
			this.info=info;
			this.link=link;
		}
		public void setLink(Node link) {
			this.link=link;
		}
		public Node getLink() {
			return link;
		}
		public void setInfo(E info) {
			this.info=info;
		}
		public E getInfo() {
			return info;
		}
}
