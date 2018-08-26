package com.designpattern.decorator;

/**   
 * @ClassName:  Decorator   
 * @Description:装饰器的抽象类 
 * @author: wanjinYoung 
 * @date:   2018年8月20日 上午9:42:29   
 *    
 * @Copyright: 2018 www.wanjinYoung.com Inc. All rights reserved. 
 */  
public abstract class Decorator extends Component{
	
	//引入需要装饰的对象 
	private Component component = null;
	
	/**   
	 * @Title:  Decorator   
	 * @Description:无参数的构造方法 
	 * @param:    
	 * @throws   
	 */  
	public Decorator() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**   
	 * @Title:  Decorator   
	 * @Description:带有一个参数的构造方法 
	 * @param:  @param component  
	 * @throws   
	 */  
	public Decorator(Component component) {
		this.component = component;
	}

	

	@Override
	public void Operation() {
		// TODO Auto-generated method stub
		this.component.Operation();
	}
	
	

}
