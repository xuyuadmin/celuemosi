package com.xuyu.test;

import com.xuyu.inter.IStrategy;
import com.xuyu.inter.impl.BackDoor;
import com.xuyu.inter.impl.BlockEnemy;
import com.xuyu.inter.impl.GivenGreenLight;

import lombok.extern.java.Log;

@Log
public class zilong {

	private String name ;
	private IStrategy iStrategy;
	
	public void setIdea(IStrategy iStrategy){
		this.iStrategy = iStrategy;
	}
	public zilong(String name) {
		this.name = name;
	}
	public void operate(){
		iStrategy.operate();
	}
	public static void main(String[] args) {
		log.info("50岁的小刘去东吴取如花似玉的尚香姑娘，子龙陪同");
		zilong zilong = new zilong("子龙");
		log.info("一进东吴不知道怎么办，看第一个锦囊：");
		zilong.setIdea(new BackDoor());
		zilong.operate();
		log.info("看第二个锦囊：");
		zilong.setIdea(new GivenGreenLight());
		zilong.operate();
		log.info("小刘乐不思蜀了，小赵看看第三个锦囊：");
		zilong.setIdea(new BlockEnemy());
		zilong.operate();}

	
	
}
