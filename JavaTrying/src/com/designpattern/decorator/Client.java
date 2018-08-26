package com.designpattern.decorator;

/**   
 * @ClassName:  Client   
 * @Description:用于测试正确性 
 * @author: wanjinYoung 
 * @date:   2018年8月26日 下午4:55:56   
 *    
 * @Copyright: 2018 www.wanjinYoung.com Inc. All rights reserved. 
 */  
public class Client {
	public static void main(String[] args) {
		Component component = new ConcreteComponent();
		
		component = new ConcreteDecoratorA(component);
		component = new ConcreteDecoratorB(component);
		
		component.Operation();
	}

}
