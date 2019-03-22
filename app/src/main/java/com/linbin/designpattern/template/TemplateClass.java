package com.linbin.designpattern.template;

/**
 * Created by yl1445 on 2019/3/21.
 */

public abstract class TemplateClass {
	protected abstract void dosomething();

	protected abstract void doAnything();

	//模板方法

	public void templateMethod() {
		this.doAnything();
		this.dosomething();
	}
}
