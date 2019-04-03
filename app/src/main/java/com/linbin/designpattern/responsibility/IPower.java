package com.linbin.designpattern.responsibility;

/**
 * Created by yl1445 on 2019/3/25.
 * 老大们的权利接口
 */

public interface IPower {
	/**
	 * 处理请求
	 *
	 * @param ape
	 *            具体的猿
	 */
	public void handleRequest(ProgramApes ape);
}
