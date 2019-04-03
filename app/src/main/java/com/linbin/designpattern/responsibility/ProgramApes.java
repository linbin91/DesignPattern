package com.linbin.designpattern.responsibility;

/**
 * 程序猿抽象接口
 * Created by yl1445 on 2019/3/25.
 */


public abstract class ProgramApes {
	/**
	 * 获取程序员具体的差旅费用
	 *
	 * @return 要多少钱
	 */
	public abstract int getExpenses();

	/**
	 * 获取差旅费申请
	 *
	 * @return Just a request
	 */
	public abstract String getApply();
}
