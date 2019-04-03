package com.linbin.datastructure;

/**
 * Created by yl1445 on 2019/3/28.
 * <p>
 * 链表-删除链表中重复的结点
 */

public class Data5 {

	public class ListNode {
		int val;
		Data5.ListNode next = null;

		ListNode(int val) {
			this.val = val;
		}
	}

	public ListNode deleteDuplication(ListNode pHead) {
		//当前只有0或1个节点，之间返回
		if (pHead == null || pHead.next == null) {
			return pHead;
		}
		if (pHead.val == pHead.next.val) {//当节点与前下一个节点重复
			ListNode pNode = pHead.next;
			//跳过与当前节点重复的所有节点，寻找第一个不重复的节点
			while (pNode != null && pNode.val == pHead.val) {
				pNode = pNode.next;
			}
			return deleteDuplication(pNode);
		} else {//当前节点不是重复节点
			pHead.next = deleteDuplication(pHead.next);//保留当前节点，从下一个节点开始递归
			return pHead;
		}

	}
}
