package com.linbin.designpattern.responsibility;

/**
 * Created by yl1445 on 2019/3/25.
 */

public class GroupLeader extends Leader{
	public GroupLeader() {
		super(1000);
	}

	@Override
	protected void reply(ProgramApes ape) {
		System.out.println(ape.getApply());
		System.out.println("GroupLeader: Of course Yes!");
	}
}
