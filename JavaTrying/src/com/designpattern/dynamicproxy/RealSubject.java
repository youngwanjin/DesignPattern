package com.designpattern.dynamicproxy;

/**   
 * @ClassName:  RealSubject   
 * @Description:真实主题类
 * @author: wanjinYoung 
 * @date:   2018年8月15日 下午5:13:59   
 *     
 * @Copyright: 2018 www.wanjinYoung.com Inc. All rights reserved. 
 */  
public class RealSubject implements  Subject{

	@Override
	public void request() {
		// TODO Auto-generated method stub
		System.out.println("Do real business!");
	}
	
}
