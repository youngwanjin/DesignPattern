package com.designpattern.proxy;

/**   
 * @ClassName:  Client   
 * @Description:测试类,用于测试结果
 * @author: wanjinYoung 
 * @date:   2018年8月15日 下午2:55:31   
 *     
 * @Copyright: 2018 www.wanjinYoung.com Inc. All rights reserved. 
 */  
public class Client {
	public static void main(String[] args) {
		//客户端对象只需要知道代理类即可，无需知道具体主题类
		Subject proxy = new  Proxy();
		proxy.request();
		long costTime = ((Proxy)proxy).getCost();
		System.out.println("Cost time:"+costTime+"ns");
		
	}

}
