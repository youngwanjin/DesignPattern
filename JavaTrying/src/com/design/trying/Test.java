package com.design.trying;

/*
 * 	设计模式之策略
*/
public class Test {
	public static void main(String[] args) {
		
		Calculator calculator = new Calculator(); //实例化计算器
		
		calculator.setStrategy(new Addition()); //接入加法实现
		int result = calculator.getResult(2, 8);//计算结果
		System.out.println(result);
		
		
		calculator.setStrategy(new Subtraction()); //接入加法实现\	
		int result1 = calculator.getResult(2, 8);//计算结果
		System.out.println(result1);
		
	}

}
