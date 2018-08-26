package com.designpattern.decorator.use;

/**   
 * @ClassName:  Client   
 * @Description:测试类
 * @author: wanjinYoung 
 * @date:   2018年8月26日 下午8:39:52   
 *    
 * @Copyright: 2018 www.wanjinYoung.com Inc. All rights reserved. 
 */  
public class Client {
	public static void main(String[] args) {
		Programer monkey = new ProgramerMonkey();
		
		//用背心进行装饰 
		Clothing vest = new Vest(monkey);
		//用衬衫进行装饰 
		vest = new Shirt(vest);
		//用西装进行装饰
		vest = new Suit(vest);
		
		vest.dress();
		
		System.out.println("一身行头，总共花费：" + vest.price()+"RMB");
	}

}
