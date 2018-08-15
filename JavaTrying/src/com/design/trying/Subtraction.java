package com.design.trying;

public class Subtraction implements Strategy {
	
	//重写接口的方法实现减法
	@Override
	public int calculate(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

}
