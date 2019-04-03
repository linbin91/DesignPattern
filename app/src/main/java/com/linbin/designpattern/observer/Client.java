package com.linbin.designpattern.observer;

/**
 * Created by yl1445 on 2019/3/26.
 */

public class Client {
	public static void main(String[] args){
		Teacher teacher = new Teacher();
		Student student = new Student();
		teacher.addObserver(student);
		teacher.publishMessage("同学们，今天没有作业");
	}
}
