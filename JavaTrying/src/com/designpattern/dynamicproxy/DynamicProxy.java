package com.designpattern.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**   
 * @ClassName:  DynamicProxy   
 * @Description:动态代理类
 * @author: wanjinYoung 
 * @date:   2018年8月16日 上午11:06:23   
 *     
 * @Copyright: 2018 www.wanjinYoung.com Inc. All rights reserved. 
 */  
public class DynamicProxy {
	
	public static <T> T newProxyInstance(Subject subject) {
		
		//寻找AOP框架中的定义的JoinPoint连接点
		boolean isBeforeAdviceDefined = true;
		if (isBeforeAdviceDefined) {
			(new BeforeAdvice()).exec();
		}
		
		//定义一个Handler
		InvocationHandler handler = new MyInvocationHandler(subject);
		
		//定义主题的代理
		return (T)Proxy.newProxyInstance(subject.getClass().getClassLoader(),subject.getClass().getInterfaces(),handler);
	}

}
