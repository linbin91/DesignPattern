package com.linbin.designpattern.responsibility;

/**
 * Created by yl1445 on 2019/3/25.
 * Android程序猿类
 */

public class AndroidApe extends ProgramApes{
	private int expenses;// 声明整型成员变量表示出差费用
	private String apply = "爹要点钱出差";// 声明字符串型成员变量表示差旅申请

	/*
	 * 含参构造方法
	 */
	public AndroidApe(int expenses) {
		this.expenses = expenses;
	}

	@Override
	public int getExpenses() {
		return expenses;
	}

	@Override
	public String getApply() {
		return apply;
	}
}
