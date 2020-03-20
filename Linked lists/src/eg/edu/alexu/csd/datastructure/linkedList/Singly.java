package eg.edu.alexu.csd.datastructure.linkedList;

import eg.edu.alexu.csd.datastructure.linkedList.ILinkedList;


public class Singly implements ILinkedList {
	
	public Node head = null;
	
	int size = 0;

		public void add(int index, Object element) {
		if ((head == null && index != 0) || index < 0 || index > size) {
			throw null;
		}
		int c;
		Node node = new Node(element);
		Node i = head;
		if (index == 0) {
			node.next = head;
			head = node;

		} else {
			for (c = 0; c < index - 1 && i != null; c++) {
				i = i.next;
			}
			if (c == index - 1) {
				node.next = i.next;
				i.next = node;
			}
		}
		size++;
	}

	
	public void add(Object element) {
		Node node = new Node(element);
		if (head == null) {
			head = node;
		} else {
			Node s = head;
			int c = 0;
			while (s != null) {
				c++;
				s = s.next;
			}
			s = head;
			for (int j = 0; j < c - 1; j++) {
				s = s.next;
			}
			node.next = s.next;
			s.next = node;
		}
		size++;
	}

	public Object get(int index) {
		if (head == null || index < 0 || index >= size) {
			throw null;
		}

		Node i = head;
		int c = 0;
		while (c < index) {
			i = i.next;
			c++;
		}
		return i.value;
	}

	
	public void set(int index, Object element) {
		if (head == null || index < 0 || index >= size) {
			throw null;
		}

		Node s = head;
		for (int j = 0; j < index; j++) {
			s = s.next;
		}
		s.value = element;
	}

	
	public void clear() {
		head = null;
		size = 0;
	}

	
	public boolean isEmpty() {
		if (head == null) {
			return true;
		}
		return false;
	}

	
	public void remove(int index) {
		if (head == null || index < 0 || index >= size) {
			throw null;
		} else {
			int c;
			if (index == 0) {
				head = head.next;

			} else {
				Node s = head;
				Node j = s.next;
				for (c = 0; c < index - 1 && s != null; c++) {
					s = s.next;
					j = j.next;
				}
				s.next = j.next;
				j.next = null;
			}
		}
		size--;
	}

	public int size() {
		if (head == null) {
			return 0;
		} else {
			Node s = head;
			int c = 0;
			while (s != null) {
				c++;
				s = s.next;
			}
			return c;
		}
	}

	
	public ILinkedList sublist(int fromIndex, int toIndex) {
		Singly sub = new Singly();
		if (fromIndex < 0 || toIndex > size || fromIndex > size) {
			return sub;
		}
		Node n = head;
		for (int i = 0; i < fromIndex; i++) {
			n = n.next;
		}
		for (int i = fromIndex; i <= toIndex; i++) {
			sub.add(n.value);
			n = n.next;
		}
		return sub;
	}

	public boolean contains(Object o) {
		if (head == null) {
			return false;
		} else {
			Node s = head;
			int f = 0;
			while (s != null && f == 0) {
				if (o.equals(s.value)) {
					f = 1;
				} else {
					s = s.next;
				}
			}
			if (f == 1) {
				return true;
			} else {
				return false;
			}
		}
	}
}