package com.designpattern.decorator.use;

/**   
 * @ClassName:  Vest   
 * @Description: 背心装饰类 
 * @author: wanjinYoung 
 * @date:   2018年8月26日 下午8:19:45   
 *    
 * @Copyright: 2018 www.wanjinYoung.com Inc. All rights reserved. 
 */  
public class Vest extends Clothing{
	
	//构造方法 
	public Vest(Programer programer) {
		super(programer);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void dress() {
		// TODO Auto-generated method stub
		super.dress();
		System.out.println("穿上背心！"+"当前花费 "+price()+"￥");
	}

	@Override
	public double price() {
		// TODO Auto-generated method stub
		  //背心的价格
		double price =20;
		price = super.price()+price;
		return price;
	}
	
	
}
