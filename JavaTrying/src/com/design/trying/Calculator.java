package com.design.trying;

//计算器类
public class Calculator {
	private Strategy strategy; //拥有某种算法策略
	
	//接入算法策略
	public void setStrategy(Strategy strategy) {
		this.strategy =strategy;
	}
	
	public int getResult(int a , int b) {
		return this.strategy.calculate(a, b);
		
	}

}
