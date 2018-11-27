package DoublyLinkedList;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class test {

	@Test
	void addtest() {
		LinkedList<String> a = new LinkedList<>();
		a.add("A");
		a.add("B");
		a.add("C");
		
		assertEquals("B", a.getValueFor(1));
	}
	
	@Test
	void removetest() {
		LinkedList<String> a = new LinkedList<>();
		a.add("A");
		a.add("B");
		
		a.remove(0);
		
		assertEquals("B", a.getValueFor(0));
	}
	
	@Test
	void sizeTest() {
		LinkedList<String> a = new LinkedList<>();
		a.add("A");
		a.add("B");
		a.add("C");
		
		assertEquals(3, a.size());
	}

}