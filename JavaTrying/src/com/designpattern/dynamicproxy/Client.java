package com.designpattern.dynamicproxy;

/**   
 * @ClassName:  Client   
 * @Description:客户端测试类
 * @author: wanjinYoung 
 * @date:   2018年8月16日 上午11:04:59   
 *     
 * @Copyright: 2018 www.wanjinYoung.com Inc. All rights reserved. 
 */  
public class Client {
	public static void main(String[] args) {
		//定义一个主题
		Subject subject = new RealSubject();
		
		//定义一个代理
		Subject proxy = DynamicProxy.newProxyInstance(subject);
		
		//执行代理的行为
		proxy.request();
	}

}
