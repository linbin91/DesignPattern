package com.linbin.designpattern.responsibility;

/**
 * 项目主管类
 * Created by yl1445 on 2019/3/25.
 */

public class Director extends Leader{
	public Director() {
		super(5000);
	}

	@Override
	protected void reply(ProgramApes ape) {
		System.out.println(ape.getApply());
		System.out.println("Director: Of course Yes!");
	}
}
