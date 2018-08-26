package com.designpattern.decorator.use;

/**   
 * @ClassName:  Clothing   
 * @Description:抽象的装饰器类（服饰类）
 * @author: wanjinYoung 
 * @date:   2018年8月26日 下午8:08:40   
 *    
 * @Copyright: 2018 www.wanjinYoung.com Inc. All rights reserved. 
 */  
public abstract class Clothing extends Programer{
	private Programer programer;
	
	//构造方法 
	public Clothing(Programer programer) {
		super();
		this.programer = programer;
	}

	@Override
	public void dress() {
		// TODO Auto-generated method stub
		this.programer.dress();
	}

	@Override
	public double price() {
		// TODO Auto-generated method stub
		return this.programer.price();
	}
	
	

}
