
public class BetterProgrammerTask4 {

	// Please do not change this interface
	interface ListNode {
		int getItem();

		ListNode getNext();

		void setNext(ListNode next);
	}

	public static ListNode reverse(ListNode node) {
		if (node == null)
			return node;
		ListNode current = node;
		ListNode next = node.getNext();
		ListNode temp;
		while (next != null) {

			//current.setNext(next.getNext());
			temp = next.getNext();
			next.setNext(current);
			current = next;
			next = temp;
		}
		node.setNext(null);
		/*
		 * Please implement this method to reverse a given linked list.
		 */
		return current;
	}


}
