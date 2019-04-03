package com.linbin.designpattern.command;

/**
 * Created by yl1445 on 2019/3/26.
 */

public class Receiver {
	/**
	 * 真正执行命令相应的操作
	 */
	public void action() {
		System.out.println("执行操作");
	}
}
