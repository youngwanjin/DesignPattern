package com.designpattern.decorator;

/**   
 * @ClassName:  ConcreteDecoratorB   
 * @Description:具体的装饰类B
 * @author: wanjinYoung 
 * @date:   2018年8月26日 下午4:50:39   
 *    
 * @Copyright: 2018 www.wanjinYoung.com Inc. All rights reserved. 
 */  
public class ConcreteDecoratorB extends Decorator{
	//无参构造
	public ConcreteDecoratorB() {
		super();
		// TODO Auto-generated constructor stub
	}
	//有参构造
	public ConcreteDecoratorB(Component component) {
		super(component);
		// TODO Auto-generated constructor stub
	}
	//重写父类的方法 
	@Override
	public void Operation() {
		// TODO Auto-generated method stub
		this.decorate();
		super.Operation();
	}
	
	//具体装饰类的独有方法 
	private void decorate() {
		System.out.println("ConcreteDecoratorB decorate!");
	}
	

}
