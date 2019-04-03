package com.linbin.designpattern.command;

/**
 * Created by yl1445 on 2019/3/26.
 */

public class Invoker {
	/**
	 * 持有命令对象
	 */
	private Command command = null;
	/**
	 * 构造方法
	 * @param command
	 */
	public Invoker(Command command) {
		this.command = command;
	}
	/**
	 * 行动方法
	 */
	public void action() {
		command.execute();
	}
}
