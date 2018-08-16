package com.designpattern.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**   
 * @ClassName:  MyInvocationHandler   
 * @Description:动态代理的Handler类
 * @author: wanjinYoung 
 * @date:   2018年8月15日 下午5:23:03   
 *     
 * @Copyright: 2018 www.wanjinYoung.com Inc. All rights reserved. 
 */  
public class MyInvocationHandler  implements InvocationHandler{
	
	//被代理的对象
	private Object target = null;
	//构造方法
	public MyInvocationHandler(Object object) {
		super();
		// TODO Auto-generated constructor stub
		this.target = object;
	}
	//重写方法
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		return method.invoke(this.target, args);
	}
	
	

}
