package com.designpattern.observer;


import java.util.Vector;

/**   
 * @ClassName:  Subject   
 * @Description:被观察者类
 * @author: wanjinYoung 
 * @date:   2018年8月27日 下午9:15:34   
 *    
 * @Copyright: 2018 www.wanjinYoung.com Inc. All rights reserved. 
 */  
public abstract class Subject {
	//一个观察者组
	private Vector<Observer> observers = new Vector<Observer>();
	
	/**   
	 * @Title: addObserver   
	 * @Description:添加一个观察者
	 * @param: @param o      
	 * @return: void      
	 * @throws   
	 */  
	public void addObserver(Observer o) {
		observers.add(o);
	}
	
	/**   
	 * @Title: removeObserver   
	 * @Description: 删除一个观察者
	 * @param: @param o      
	 * @return: void      
	 * @throws   
	 */  
	public void removeObserver(Observer o) {
		observers.remove(o);
	}
	
	/**   
	 * @Title: notifyObservers   
	 * @Description:通知所有的观察者
	 * @param:       
	 * @return: void      
	 * @throws   
	 */  
	public void notifyObservers() {
		for (Observer o : this.observers) {
			o.update();
		}
	}
	

}




