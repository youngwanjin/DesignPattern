package com.designpattern.observer.use;

import java.util.HashMap;
import java.util.Map;

/**   
 * @ClassName:  EventObject   
 * @Description:定义事件对象，并把事件相应的属性进行封装为对象
 * @author: wanjinYoung 
 * @date:   2018年8月28日 上午10:13:05   
 *    
 * @Copyright: 2018 www.wanjinYoung.com Inc. All rights reserved. 
 */  
public class EventObject {
	//事件名称
	protected String name;
	
	//事件属性集合
	protected Map<String, Object> properties;
	
	/**   
	 * @Title:  EventObject   
	 * @Description:简单构造函数
	 * @param:  @param name  
	 * @throws   
	 */  
	public EventObject(String name) {
		// TODO Auto-generated constructor stub
		this(name,(Object[]) null);
	}
	
	/**   
	 * @Title:  EventObject   
	 * @Description:复杂构造函数 
	 * @param:  @param name:事件名称
	 * @param:  @param args：属性集合键值对依次存放在 key1，v1，key2，v2，key3，v3，用来传递参数个数可变的，有些类似数组作用 
	 * @throws   
	 */  
	public EventObject(String name,Object... args) {
		// TODO Auto-generated constructor stub
		this.name = name;
		properties = new HashMap<String,Object>();
		//将传入的数组赋值给Map
		if (args != null) {
			for (int i = 0; i < args.length; i+=2) {
				if (args[i + 1] != null) {
					properties.put(String.valueOf(args[i]), args[i + 1]);
				}
			}
		}
	}

	/**   
	 * @Title: getName   
	 * @Description:获取事件的名称 
	 * @param: @return      
	 * @return: String      
	 * @throws   
	 */  
	public String getName() {
		return name;
	}

	/**   
	 * @Title: getProperties   
	 * @Description:获取事件对象的属性列表 
	 * @param: @return      
	 * @return: Map<String,Object>      
	 * @throws   
	 */  
	public Map<String, Object> getProperties() {
		return properties;
	}

	/**   
	 * @Title: getProperty   
	 * @Description:根据特定的关键字，获取相应的属性值 
	 * @param: @param key
	 * @param: @return      
	 * @return: Object      
	 * @throws   
	 */  
	public Object getProperty(String key) {
		return properties.get(key);
	}
	
	
	

}




