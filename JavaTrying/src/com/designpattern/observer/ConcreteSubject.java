package com.designpattern.observer;

/**   
 * @ClassName:  ConcreteSubject   
 * @Description:具体的被观察者类
 * @author: wanjinYoung 
 * @date:   2018年8月27日 下午9:31:15   
 *    
 * @Copyright: 2018 www.wanjinYoung.com Inc. All rights reserved. 
 */  
public class ConcreteSubject extends Subject{
	
	/**   
	 * @Title: doSomthing   
	 * @Description:被观察者在做了一些事情后，通知所有的观察者
	 * @param:       
	 * @return: void      
	 * @throws   
	 */  
	public void doSomthing() {
		super.notifyObservers();
	}

}
