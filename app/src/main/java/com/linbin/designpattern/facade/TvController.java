package com.linbin.designpattern.facade;

/**
 * Created by yl1445 on 2019/3/26.
 */

public class TvController {
	private PowerSystem mPowerSystem = new PowerSystem();
	private VoiceSystem mVoiceSystem = new VoiceSystem();
	private ChannelSystem mChannelSystem = new ChannelSystem();

	public void powerOn() {
		mPowerSystem.powerOn();
	}

	public void powerOff() {
		mPowerSystem.powerOff();
	}

	public void turnUp() {
		mVoiceSystem.turnUp();
	}

	public void turnDown() {
		mVoiceSystem.turnDown();
	}

	public void nextChannel() {
		mChannelSystem.next();
	}

	public void prevChannel() {
		mChannelSystem.prev();
	}

}
