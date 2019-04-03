package com.linbin.designpattern.responsibility;

/**
 * 部门经理类
 * Created by yl1445 on 2019/3/25.
 */

public class Manager extends Leader{
	public Manager() {
		super(10000);
	}

	@Override
	protected void reply(ProgramApes ape) {
		System.out.println(ape.getApply());
		System.out.println("Manager: Of course Yes!");
	}
}
