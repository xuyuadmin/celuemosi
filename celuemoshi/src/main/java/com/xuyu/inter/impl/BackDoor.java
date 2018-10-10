package com.xuyu.inter.impl;

import com.xuyu.inter.IStrategy;

import lombok.extern.java.Log;
@Log
public class BackDoor implements IStrategy{

	public void operate() {
		log.info("找乔国老，给小权施加压力 ！,BackDoor{}");
	}

}
