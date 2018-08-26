package com.designpattern.decorator.use;

/**   
 * @ClassName:  Shirt   
 * @Description:衬衫装饰器类 
 * @author: wanjinYoung 
 * @date:   2018年8月26日 下午8:25:15   
 *    
 * @Copyright: 2018 www.wanjinYoung.com Inc. All rights reserved. 
 */  
public class Shirt extends Clothing{
	
	//一定要保持被装饰的对象
	public Shirt(Programer programer) {
		super(programer);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void dress() {
		// TODO Auto-generated method stub
		super.dress();
		System.out.println("穿上衬衫！"+"当前花费 "+price()+"￥");
	}

	@Override
	public double price() {
		// TODO Auto-generated method stub
		 //衬衫的价格
		double price =300;
		price = super.price()+price;
		return price;
	}
	
	

}
