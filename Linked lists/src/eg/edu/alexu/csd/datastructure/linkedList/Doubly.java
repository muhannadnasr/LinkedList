package eg.edu.alexu.csd.datastructure.linkedList;

import eg.edu.alexu.csd.datastructure.linkedList.ILinkedList;

public class Doubly implements ILinkedList {

	public Node head = null;
	
	public int size = 0;

	public void add(int index, Object element) {
		Node node = new Node(element);
		if ((head == null && index != 0) || index < 0 || index > size) {
			throw null;
		}
		if (index == 0) {
			node.next = head;
			node.pre = null;
			head = node;
		} else {
			Node current = head;
			for (int i = 0; i < index - 1; i++) {
				current = current.next;
			}
			node.value = element;
			if (current.next != null) {
				Node temp = current.next;
				current.next = node;
				node.next = temp;
				temp.pre = node;
				node.pre = current;
			} else {
				current.next = node;
				node.next = null;
				node.pre = current;
			}
		}
		size++;
	}

	
	public void add(Object element) {
		Node node = new Node(element);
		if (head == null) {
			node.value = element;
			head = node;
			node.next = null;
			node.pre = null;
		} else {
			Node current = head;
			while (current.next != null) {
				current = current.next;
			}
			node.value = element;
			node.next = null;
			node.pre = current;
			current.next = node;
		}
		size++;
	}

	
	public Object get(int index) {
		if (head == null || index < 0 || index >=size) {
			throw null;
		}
		Node current = head;
		for (int i = 0; i < index; i++) {
			current = current.next;
		}
		return current.value;
	}

	
	 public void set(int index, Object element) {
		 if (head == null || index < 0 || index >= size) {
			 throw null;
		 }
		 Node current = head;
		 for (int i = 0; i < index; i++) {
			 current = current.next;
		 }
		 current.value = element;
	 }

	
	 public void clear() {
		 head = null;
		 size = 0;

	 }

	 
	 public boolean isEmpty() {
		 return head == null;
	 }


	 public void remove(int index) {
		 if (head == null || index < 0 || index >=size) {
			 throw null;
		 } else {
			 int c;
			 if (head != null) {
				 if (index == 0) {
					 head = head.next;

				 } else {
					 Node i = head;
					 Node j = i.next;
					 for (c = 0; c < index- 1 && i != null; c++) {
						 i = i.next;
						 j = j.next;
					 }
					 i.next = j.next;
					 j.next = null;
				 }
			 }
			 size--;
		 }
	 }

	 public int size() {
		 return size;
	 }

	 public ILinkedList sublist(int fromIndex, int toIndex) {
		 Doubly sub = new Doubly();
		 if (fromIndex < 0 || toIndex > size || fromIndex > size) {
			 return sub;
		 }
		 Node s = head;
		 for (int i = 0; i < fromIndex; i++) {
			 s = s.next;
		 }
		 for (int i = fromIndex; i <= toIndex; i++) {
			 sub.add(s.value);
			 s = s.next;
		 }
		 return sub;
	 }

	 public boolean contains(Object o) {
		 Node Now = head;
		 while (Now != null) {
			 if (Now.value.equals(o))
				 return true;
			 Now = Now.next;
		 }
		 return false;
	 }
}