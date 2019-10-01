public class Main{
	public static void main(String[] args){
	DCList<Integer> list= new DCList<>();
	System.out.println(list.isEmpty());
	list.add(new Integer(7));
	list.add(new Integer(1));
	list.add(new Integer(3));
	list.display();
	list.add(new Integer(9), 1);
	list.display();
	list.remove(new Integer(1));
	list.display();
	list.removeFirst();
	list.display();
	list.removeLast();
	list.display();
	System.out.println(list.getFirst().getValue());
	System.out.println(list.getLast().getValue());
	System.out.println(list.get(2));
	System.out.println(list.find(9));
	System.out.println(list.contains(40));
	System.out.println(list.size());
	list.clear();
	list.display();
	
	}
}