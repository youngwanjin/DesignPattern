package com.designpattern.observer;

/**   
 * @ClassName:  ConcreteObserver   
 * @Description:具体的观察者 
 * @author: wanjinYoung 
 * @date:   2018年8月27日 下午9:51:36   
 *    
 * @Copyright: 2018 www.wanjinYoung.com Inc. All rights reserved. 
 */  
public class ConcreteObserver extends Observer {

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("观察者ConcreteObserver接收到消息，进行处理");
	}
	

}
