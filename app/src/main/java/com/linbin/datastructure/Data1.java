package com.linbin.datastructure;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by yl1445 on 2019/3/27.
 * 实现从尾到头打印链表
 */

public class Data1 {
	public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		Stack<Integer> stack = new Stack<Integer>();
	//队列和栈是一对好基友，从尾到头打印链表，当然离不开借助栈的帮忙啦
		//所以，先把链表里的东西，都放到一个栈里去，然后按顺序把栈里的东西pop出来，就这么简单
		while (listNode != null) {
			stack.push(listNode.val);
			listNode = listNode.next;
		}

		ArrayList<Integer> list = new ArrayList <Integer> ();
		while (!stack.isEmpty()) {
			list.add(stack.pop());
		}
		return list;
	}

	public class ListNode {
		int val;
		ListNode next = null;

		ListNode(int val) {
			this.val = val;
		}
	}
}