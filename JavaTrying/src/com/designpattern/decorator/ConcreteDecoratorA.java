package com.designpattern.decorator;

/**   
 * @ClassName:  ConcreteDecoratorA   
 * @Description:具体装饰类A
 * @author: wanjinYoung 
 * @date:   2018年8月20日 上午9:50:02   
 *    
 * @Copyright: 2018 www.wanjinYoung.com Inc. All rights reserved. 
 */  
public class ConcreteDecoratorA extends Decorator{

	public ConcreteDecoratorA(Component component) {
		super(component);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Operation() {
		// TODO Auto-generated method stub
		this.decorate(); 
		super.Operation();
	}
	
	private void decorate() {
		System.out.println("ConcreteDecoratorA decorate!");
	}
}

