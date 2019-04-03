package com.linbin.designpattern.facade;

/**
 * Created by yl1445 on 2019/3/26.
 */

public class Client {
	public static void main(String[] args) {
		TvController tvController = new TvController();
		tvController.powerOn();
		tvController.turnUp();
		tvController.nextChannel();
	}
}
