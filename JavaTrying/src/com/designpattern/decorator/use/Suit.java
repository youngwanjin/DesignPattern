package com.designpattern.decorator.use;

/**   
 * @ClassName:  Suit   
 * @Description:西装装饰器
 * @author: wanjinYoung 
 * @date:   2018年8月26日 下午8:27:04   
 *    
 * @Copyright: 2018 www.wanjinYoung.com Inc. All rights reserved. 
 */  
public class Suit extends Clothing{

	//保持被装饰的对象
	public Suit(Programer programer) {
		super(programer);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void dress() {
		// TODO Auto-generated method stub
		super.dress();
		System.out.println("穿上西装！"+"当前花费 "+price()+"￥");
	}

	@Override
	public double price() {
		// TODO Auto-generated method stub
		//西装价格 
		double price =3000;
		price = super.price()+price;
		return price;
	}
	
	

}
