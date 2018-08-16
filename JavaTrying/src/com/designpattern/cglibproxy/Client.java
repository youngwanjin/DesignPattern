package com.designpattern.cglibproxy;

/**   
 * @ClassName:  Client   
 * @Description:客户端测试类
 * @author: wanjinYoung 
 * @date:   2018年8月16日 下午1:30:24   
 *     
 * @Copyright: 2018 www.wanjinYoung.com Inc. All rights reserved. 
 */  
public class Client {
	public static void main(String[] args) {
		//实例化代理类对象
		SubjectCglib cglib = new SubjectCglib();
		//通过代理动态生成真实主题类对象
		RealSubject subject = (RealSubject) cglib.getInstance(new RealSubject());
		//使用真实主题类的对象调用其中的方法
		subject.request();
	}

}
