package com.designpattern.proxy;

/**   
 * @ClassName:  Proxy   
 * @Description:代理类
 * @author: wanjinYoung 
 * @date:   2018年8月15日 下午2:19:36   
 *     
 * @Copyright: 2018 www.wanjinYoung.com Inc. All rights reserved. 
 */  
public class Proxy implements Subject{
	private Subject realSubject;
	private long start;
	private long end;
	
	/**   
	 * @Title:  Proxy   
	 * @Description:构造函数
	 * @param:    
	 * @throws   
	 */  
	public Proxy() {
		super();
		// TODO Auto-generated constructor stub
		//经典的代理模式是在构造函数中实例化具体主题类
		//realSubject = new RealSubject();		
	}
	
	/**   
	 * Title: request  
	 * Description:重写接口Subject的方法，进行真实主题类方法的调用以及新功能的添加     
	 * @see com.designpattern.proxy.Subject#request()   
	 */  
	@Override
	public void request() {
		//进行功能增强1
		this.doBefore();
		
		//通过"虚拟代理"实现延迟加载
		//即：只有真正执行了操作时，才实例化对象
		if (realSubject == null) {
			realSubject = new RealSubject();
		}
		
		//执行真实对象的操作
		realSubject.request();
		
		//进行功能增强2
		this.doAfter();
	}

	/**   
	 * @Title: doBefore   
	 * @Description: 记录执行起始的时间 
	 * @param:       
	 * @return: void      
	 * @throws   
	 */  
	private void doBefore() {
		// TODO Auto-generated method stub
		start = System.nanoTime();
		System.out.println("Do someing before!");
		
	}
	
	/**   
	 * @Title: doAfter   
	 * @Description: 记录执行结束的时间
	 * @param:       
	 * @return: void      
	 * @throws   
	 */  
	private void doAfter() {
		// TODO Auto-generated method stub
		end = System.nanoTime();
		System.out.println("Do something after!");
	}
	
	/**   
	 * @Title: getCost   
	 * @Description:计算花费的时间
	 * @param: @return      
	 * @return: long      
	 * @throws   
	 */  
	public long getCost() {
		return end-start;
	}
	
	
	
	
	
	
	
}
