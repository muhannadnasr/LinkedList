package eg.edu.alexu.csd.datastructure.linkedList;


public class Node {
	
	public Node next = null;
	
	public Node pre = null;
	
	public Object value;
	
	public Node(Object element) {
		this.value =element ;
	}
}