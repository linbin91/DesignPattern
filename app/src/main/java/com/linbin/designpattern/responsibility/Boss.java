package com.linbin.designpattern.responsibility;

/**
 * 老总类
 * Created by yl1445 on 2019/3/25.
 */

public class Boss extends Leader {
	public Boss() {
		super(40000);
	}

	@Override
	protected void reply(ProgramApes ape) {
		System.out.println(ape.getApply());
		System.out.println("Boss: Of course Yes!");
	}
}
