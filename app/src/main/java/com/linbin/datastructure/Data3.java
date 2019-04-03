package com.linbin.datastructure;

/**
 * 链表中倒数第k个结点
 * Created by yl1445 on 2019/3/27.
 * https://blog.csdn.net/abc7845129630/article/details/52724583
 * <p>
 *   一般思路是：先走到链表的尾端，再回溯k步，但由于是单向链表，该思路行不通。另一个思路是，假设链表有n个结点，倒数第k个，就是从头开始第n-k+1个结点，这个不难，遍历链表第一次得到结点个数n，遍历第二次得到第n-k+1个结点。
 *        更好的思路是：只遍历链表一次就能找到倒数第k个结点，我们可以定义两个指针。第一个指针从链表的头指针开始遍历向前走k-1，第二个指针不动；从第k步开始，第二个指针也开始从链表头指针开始遍历。由于两个指针的距离保持在k-1，当第一个指针到达链表的尾结点时，第二个指针正好是倒数第k个结点。
 */

public class Data3 {
	public static class Node<T> {
		private T value;    //节点值
		private Node<T> next;   //后继节点

		public Node() {
		}

		public Node(T value, Node<T> next) {
			this.value = value;
			this.next = next;
		}
	}

	public static Node findKthToTail(Node head, int k) {

		if (head == null || k == 0) {
			return null;
		}

		Node after = head;
		Node behind = head;
		for (int i =0 ; i < k - 1; i ++ ) {
			if (after.next != null) {
				after = after.next;
			}else {
				return null;
			}
		}
		while (after.next != null) {
			after = after.next;
			behind = behind.next;
		}

		return behind;
	}
}
