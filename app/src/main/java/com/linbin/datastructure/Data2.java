package com.linbin.datastructure;

/**
 * Created by yl1445 on 2019/3/27.
 * 反转链表
 */

public class Data2 {

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

	/**初始化链表**/
	private Node initLinkedList(int num) {
		Node head = new Node(0, null);
		Node cur = head;
		for(int i=1; i<num;i++){
			cur.next = new Node(i, null);
			cur = cur.next;
		}
		return head;
	}

	/**打印链表**/
	private void printLinkedList(Node head) {
		Node node = head;
		while(node != null){
			System.out.println(node.value);
			node = node.next;
		}
	}

	private Node revertList(Node head) {
		if (head == null || head.next == null) {
			return head;
		}
		Node pre = null;
		Node next = null;
		while (head.next != null) {
			next = head.next;//保存下一个节点
			head.next = pre;//重置next
			pre = head;//保存当前节点
			head = next;
		}
		head.next = pre;

		return head;
	}

	public void test() {
		Node head = initLinkedList(10);

	}

}
