package com.designpattern.decorator.use;

/**   
 * @ClassName:  ProgramerMonkey   
 * @Description:装饰对象的具体类 （要装饰的对象）
 * @author: wanjinYoung 
 * @date:   2018年8月26日 下午8:03:58   
 *    
 * @Copyright: 2018 www.wanjinYoung.com Inc. All rights reserved. 
 */  
public class ProgramerMonkey extends Programer {

	@Override
	public void dress() {
		// TODO Auto-generated method stub
		System.out.println("nothing!"+"当前花费 "+price()+"￥");
	}

	@Override
	public double price() {
		// TODO Auto-generated method stub
		double price = 0;
		return price;
	}

}
