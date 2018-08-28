package com.designpattern.observer;

/**   
 * @ClassName:  Client   
 * @Description:测试类
 * @author: wanjinYoung 
 * @date:   2018年8月27日 下午9:54:46   
 *    
 * @Copyright: 2018 www.wanjinYoung.com Inc. All rights reserved. 
 */  
public class Client {
	public static void main(String[] args) {
		//声明被观察者
		ConcreteSubject  subject = new ConcreteSubject();
		
		//声明观察者
		Observer observer = new ConcreteObserver();
		
		//将观察者加入观察者队列
		subject.addObserver(observer);
		
		//被观察者行动了 观察者应该都会收到消息
		subject.doSomthing();
	}

}
