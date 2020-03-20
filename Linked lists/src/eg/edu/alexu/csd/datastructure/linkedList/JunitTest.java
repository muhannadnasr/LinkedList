package eg.edu.alexu.csd.datastructure.linkedList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import eg.edu.alexu.csd.datastructure.linkedList.ILinkedList;


public class JunitTest {
	
	ILinkedList testSingle = new Singly();
	
	ILinkedList testDouble = new Doubly();

	@Test
	public void Insertion() {
		Singly Singletest = new Singly();
		Doubly Doubletest = new Doubly();
		Singletest.add(0, 'm');
		Singletest.add(1, 'n');
		Singletest.add(2, 'l');
		Singletest.add(3, 'o');
		assertEquals('m', Singletest.get(0));
		assertEquals('n', Singletest.get(1));
		assertEquals('l', Singletest.get(2));
		assertEquals('o', Singletest.get(3));

		Doubletest.add(0, 'm');
		Doubletest.add(1, 'n');
		Doubletest.add(2, 'l');
		Doubletest.add(3, 'o');
		assertEquals('m', Doubletest.get(0));
		assertEquals('n', Doubletest.get(1));
		assertEquals('l', Doubletest.get(2));
		assertEquals('o', Doubletest.get(3));
	}
	
	@Test
	public void AddingToTheMiddle() {
		Singly Singletest = new Singly();
		Doubly Doubletest = new Doubly();
		Singletest.add(0, 1);
		Singletest.add(1, 2);
		Singletest.add(2, 3);
		Singletest.add(3, 4);

		Singletest.add(2, 5);
		assertEquals(5, Singletest.get(2));
		assertEquals(3, Singletest.get(3));
		assertEquals(4, Singletest.get(4));

		Doubletest.add(0, 1);
		Doubletest.add(1, 2);
		Doubletest.add(2, 3);
		Doubletest.add(3, 4);

		Doubletest.add(2, 5);
		assertEquals(5, Doubletest.get(2));

	}

	@Test
	public void Set() {
		Singly Singletest = new Singly();
		Doubly Doubletest = new Doubly();
		Singletest.add(0, 'm');
		Singletest.add(1, 'n');
		Singletest.add(2, 'l');
		Singletest.add(3, 'o');
		Singletest.set(0, 's');
		assertEquals('s', Singletest.get(0));
		Doubletest.add(0, 'm');
		Doubletest.add(1, 'n');
		Doubletest.add(2, 'l');
		Doubletest.add(3, 'o');
		Doubletest.set(0, 's');
		assertEquals('s', Doubletest.get(0));
	}

	@Test
	public void SubLists() {
		Singly Singletest = new Singly();
		Doubly Doubletest = new Doubly();

		Singletest.add(0, "choose");
		Singletest.add(1, "a");
		Singletest.add(2, "sub");
		Singletest.add(3, "from");
		Singletest.add(4, "here");
		Singletest.add(5, "to");
		Singletest.add(6, "this");
		Singletest.add(7, "position");
		Singletest.add(8, "not");
		Singletest.add(9, "the rest");
		ILinkedList sub = new Singly();
		sub = Singletest.sublist(4, 7);
		assertEquals("here",sub.get(0));
		assertEquals("to",sub.get(1));
		assertEquals("this",sub.get(2));
		assertEquals("position",sub.get(3));
		assertEquals(4, sub.size());

		Doubletest.add(0, "choose");
		Doubletest.add(1, "a");
		Doubletest.add(2, "sub");
		Doubletest.add(3, "from");
		Doubletest.add(4, "here");
		Doubletest.add(5, "to");
		Doubletest.add(6, "this");
		Doubletest.add(7, "position");
		Doubletest.add(8, "not");
		Doubletest.add(9, "the rest");
		ILinkedList sub2 = new Singly();
		sub2 = Doubletest.sublist(4, 7);
		assertEquals("here",sub2.get(0));
		assertEquals("to",sub2.get(1));
		assertEquals("this",sub2.get(2));
		assertEquals("position",sub2.get(3));
		assertEquals(4, sub2.size());
	}
	
	@Test
	public void Removing() {
		Singly Singletest = new Singly();
		Doubly Doubletest = new Doubly();
		Singletest.add(0, 'm');
		Singletest.add(1, 'n');
		Singletest.add(2, 'l');
		Singletest.add(3, 'o');
		assertEquals(4, Singletest.size());
		assertEquals('l', Singletest.get(2));
		Singletest.remove(2);
		assertNotEquals('l', Singletest.get(2));
		assertEquals('o', Singletest.get(2));
		assertEquals(3, Singletest.size());
		Doubletest.add(0, 'm');
		Doubletest.add(1, 'n');
		Doubletest.add(2, 'l');
		Doubletest.add(3, 'o');
		assertEquals(4, Doubletest.size());
		assertEquals('l', Doubletest.get(2));
		Doubletest.remove(2);
		assertNotEquals('l', Doubletest.get(2));
		assertEquals('o', Doubletest.get(2));
		assertEquals(3, Doubletest.size());
	}
	
	@Test
	public void Contains() {
		Singly Singletest = new Singly();
		Doubly Doubletest = new Doubly();
		Singletest.add(0, "muhannad");
		Singletest.add(1, "marwan");
		Singletest.add(2, "nasr");
		Singletest.add(3, "selim");
		assertTrue(Singletest.contains("muhannad"));
		assertFalse(Singletest.contains("marwa"));

		Doubletest.add(0, 19);
		Doubletest.add(1, 20);
		Doubletest.add(2, 21);
		Doubletest.add(3, 22);
		assertTrue(Doubletest.contains(21));
		assertFalse(Doubletest.contains(23));

	}

	@Test
	public void Clearing() {
		Singly Singletest = new Singly();
		Doubly Doubletest = new Doubly();
		Singletest.add(0, 'm');
		Singletest.add(1, 'l');
		Singletest.add(2, 'n');
		Singletest.add(3, 'o');
		assertFalse(Singletest.isEmpty());
		Singletest.clear();
		assertTrue(Singletest.isEmpty());
		Doubletest.add(0, 'm');
		Doubletest.add(1, 'n');
		Doubletest.add(2, 'l');
		Doubletest.add(3, 'o');
		assertFalse(Doubletest.isEmpty());
		Doubletest.clear();
		assertTrue(Doubletest.isEmpty());

	}
	

	
		@Test
		public void Solveprint() {
			 IPolynomialSolver poly =  new Poly();
			 int[][] c = {{3, 7 }, {45, 5 },
					{176, 3 }, {128, 1 } };
			 int[][] b = {{-120, 5 }, {-1, 3 },
					{27, 2 }, {1, 1 }, {-1, 0 } };
			poly.setPolynomial('C', c);
			poly.setPolynomial('B', b);
			assertEquals("3x^7+45x^5+176x^3+128x",poly.print('C'));
		}

		@Test
		public void Solveadd() {
			 IPolynomialSolver poly =  new Poly();
			int[][] a = {{1, 2 }, {1, 1 } };
			int[][] b = {{1, 2 }, {1, 1 } };
			poly.setPolynomial('A', a);
			poly.setPolynomial('B', b);
			poly.setPolynomial('C', poly.add('B','A'));
			assertEquals("2x^2+2x", poly.print('C'));
		}
	}
