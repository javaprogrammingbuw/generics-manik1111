public class DCList<T>{

	Node<T> head;

	public boolean isEmpty(){
		return head == null;
	}
	public void display(){
		String m="";
		for(Node<T> n=head; n!=null; n=n.getNextNode()){
			m= m + n.getValue().toString() + ", ";
		}
		if(!isEmpty()){
			System.out.println("["+m.substring(0,m.length()-2)+"]");
		}
		else{
			System.out.println("[]");
		}
	}
	public void add(T value){
		Node<T> newNode = new Node<>(value);
		if(isEmpty()){
			head = newNode;	
		}
		else{
			Node<T> last=get(size()-1);
			last.setNextNode(newNode);
			newNode.setPreviousNode(last);
		}
	}
	public void add(T value, int position){
		Node<T> newNode = new Node<>(value);
		int counter = 0;
		if(isEmpty()){
			head = newNode; 
		}
		else{
			for(Node<T> n = head; n != null; n=n.getNextNode()){
				if(counter==position){
					n.getPreviousNode().setNextNode(newNode);
					newNode.setPreviousNode(n.getPreviousNode());
					n.setPreviousNode(newNode);
					newNode.setNextNode(n);
					break;
				}
				else{
					counter++;
				}
			}
		}
	}
	public void remove(T value){

		for(Node<T> n = head; n!=null; n=n.getNextNode()){
			if(n.getValue().equals(value)){
				if(n == head){
					removeFirst();
				}
				else{
					n.getPreviousNode().setNextNode(n.getNextNode());
					n.getNextNode().setPreviousNode(n.getPreviousNode());
				}
				break;
			}
		}
	}
	public void removeFirst(){
		head.getNextNode().setPreviousNode(null);
		head = head.getNextNode();
	}
	public void removeLast(){
		Node<T> last=get(size()-1);
		last.getPreviousNode().setNextNode(null);
	}
	public void clear(){
		head=null;
	}
	public Node<T> getFirst(){
		return head;
	}
	public Node<T> getLast(){
        return get(size()-1);
	}
	public Node<T> get(int position){
		int counter=0;
		for(Node<T> n = head; n!=null ; n=n.getNextNode()){
			if(counter == position){
				return n;
			}
			else{
				counter++;
			}
		}
		return null;
	}
	public int find(T value){
		int postion = 0;
		for(Node<T> n = head; n!=null; n=n.getNextNode()){
			if(n.getValue().equals(value)){
				return postion;
			}
			postion+=1;
		}
		return -1;
	}
	public boolean contains(T value){
		for(Node<T> n = head; n!=null; n=n.getNextNode()){
			if(n.getValue().equals(value)){
				return true;
			}
		}
		return false;
	}
	public int size(){
		int counter=0;
		for(Node<T> n = head; n!=null ; n=n.getNextNode()){
			counter+=1;
		}
		return counter;
	}
}
