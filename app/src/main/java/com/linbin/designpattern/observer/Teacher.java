package com.linbin.designpattern.observer;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by yl1445 on 2019/3/26.
 */

public class Teacher {

	public String message;

	//发布消息
	public void publishMessage(String message) {
		this.message = message;
		notifyObservers(message);
	}

	List<MyObserver> observers = new LinkedList<>();

	//添加观察者
	public void addObserver(MyObserver observer) {
		if (observer == null) {
			throw new NullPointerException("observer is null");
		} else {
			synchronized (this) {
				if (!observers.contains(observer)) {
					observers.add(observer);
				}
			}
		}
	}

	//删除观察者
	public synchronized void deleteObserver(MyObserver observer) {
		observers.remove(observer);
	}

	//通知观察者数据改变
	public void notifyObservers(String message) {
		for (MyObserver observer : observers) {
			observer.update(message);
		}
	}
}
