public class Node<T>{
	private T value;
	private Node<T> nextNode;
	private Node<T> previousNode;
	public Node(T value){
		this.value=value;
	}
	public T getValue(){
		return value;
	}
	public String toString(){
		return value.toString();
	}
	public void setNextNode(Node<T> nextNode){
		this.nextNode = nextNode;
	}
	public void setPreviousNode(Node<T> previousNode){
		this.previousNode = previousNode;
	}
	public Node<T> getNextNode(){
		return nextNode;
	}
	public Node<T> getPreviousNode(){
		return previousNode;
	}
}