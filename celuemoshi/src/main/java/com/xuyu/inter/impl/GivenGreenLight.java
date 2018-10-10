package com.xuyu.inter.impl;

import com.xuyu.inter.IStrategy;

import lombok.extern.java.Log;
@Log
public class GivenGreenLight implements IStrategy{

	public void operate() {
		log.info("找吴国太，给小刘同学一路开绿灯...，不准为难！,GivenGreenLight{}");
	}

}
