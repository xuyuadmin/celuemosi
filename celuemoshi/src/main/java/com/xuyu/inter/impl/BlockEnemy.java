package com.xuyu.inter.impl;

import com.xuyu.inter.IStrategy;

import lombok.extern.java.Log;
@Log
public class BlockEnemy implements IStrategy{

	public void operate() {
		log.info("老婆你断后，我先跑了....,BlockEnemy{}");
	}

}
