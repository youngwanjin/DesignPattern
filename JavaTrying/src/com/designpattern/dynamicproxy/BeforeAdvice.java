package com.designpattern.dynamicproxy;

/**   
 * @ClassName:  BeforeAdvice   
 * @Description:具体通知类
 * @author: wanjinYoung 
 * @date:   2018年8月15日 下午5:17:40   
 *     
 * @Copyright: 2018 www.wanjinYoung.com Inc. All rights reserved. 
 */  
public class BeforeAdvice implements IAdvice {

	@Override
	public void exec() {
		// TODO Auto-generated method stub
		System.out.println("Before Advice is Exectuded!");
	}
	
}
