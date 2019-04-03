package com.linbin.datastructure;

/**
 * Created by yl1445 on 2019/3/27.
 * 合并两个排序的链表
 */

public class Data4 {
	public class ListNode {
		int val;
		ListNode next = null;

		ListNode(int val) {
			this.val = val;
		}
	}


	public ListNode merge(ListNode list1, ListNode list2) {

		if (list1 == null && list2 == null) {
			return null;
		}
		if (list1 == null && list2 != null) {
			return list2;
		}
		if (list1 != null && list2 == null) {
			return list1;
		}

		ListNode mergeNode = null;
		if (list1.val < list2.val) {
			mergeNode = list1;
			mergeNode.next = merge(list1.next, list2);
		}else{
			mergeNode = list2;
			mergeNode.next = merge(list1, list2.next);
		}

		return mergeNode;
	}
}
