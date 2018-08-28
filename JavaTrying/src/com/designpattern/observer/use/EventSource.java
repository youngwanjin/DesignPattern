package com.designpattern.observer.use;

import java.util.ArrayList;
import java.util.List;

/**   
 * @ClassName:  EventSource   
 * @Description:定义事件源;管理监听器注册、注销;触发事件后告知监听器对象
 * @author: wanjinYoung 
 * @date:   2018年8月28日 上午10:45:47   
 *    
 * @Copyright: 2018 www.wanjinYoung.com Inc. All rights reserved. 
 */  
public class EventSource {
	//用于存放事件源所注册的监听器
	//由于特定的监听器往往与特定的事件相关连
	//为此，将数据结构存放的内容设计为
	//[事件名称1,监听器1,事件名称2,监听器2,...]
	protected List<Object> eventListeners = null;
	
	//用于存放事件源
	protected Object eventSource;
	
	//设置该事件源是否可以触发外部事件标识
	protected boolean eventsEnabled = true;
	
	/**   
	 * @Title:  EventSource   
	 * @Description:创建一个简单的事件源
	 * @param:    
	 * @throws   
	 */  
	public EventSource() {
		// TODO Auto-generated constructor stub
		this(null);
	}
	
	/**   
	 * @Title:  EventSource   
	 * @Description:按照给定的source创建事件源
	 * @param:  @param source  
	 * @throws   
	 */  
	public EventSource(Object source) {
		// TODO Auto-generated constructor stub
		setEventSource(source);
	}

	/**   
	 * @Title: getEventSource   
	 * @Description:获取事件源对象 
	 * @param: @return      
	 * @return: Object      
	 * @throws   
	 */  
	public Object getEventSource() {
		return eventSource;
	}

	/**   
	 * @Title: setEventSource   
	 * @Description:设置事件源对象
	 * @param: @param eventSource      
	 * @return: void      
	 * @throws   
	 */  
	public void setEventSource(Object eventSource) {
		this.eventSource = eventSource;
	}

	/**   
	 * @Title: isEventsEnabled   
	 * @Description:获取该事件源能否触发外部事件响应
	 * @param: @return      
	 * @return: boolean      
	 * @throws   
	 */  
	public boolean isEventsEnabled() {
		return eventsEnabled;
	}

	/**   
	 * @Title: setEventsEnabled   
	 * @Description: 设置该事件源能否触发外部事件响应
	 * @param: @param eventsEnabled      
	 * @return: void      
	 * @throws   
	 */  
	public void setEventsEnabled(boolean eventsEnabled) {
		this.eventsEnabled = eventsEnabled;
	}
	
	/**   
	 * @Title: addListener   
	 * @Description:绑定事件名称与相应的事件监听器
	 * @Description:这样可以保证一旦特定事件发生，相应的的监听器就被触发执行
	 * @Description:如果没有给定事件的名称，那么该监听器就会被注册到所有的事件中
	 * @param: @param eventName
	 * @param: @param listener      
	 * @return: void      
	 * @throws   
	 */  
	public void addListener(String eventName,IEventListener listener) {
		if (eventListeners == null) {
			eventListeners = new ArrayList<Object>();
		}
		eventListeners.add(eventName);
		eventListeners.add(listener);
	}
	
	/**   
	 * @Title: removeListener   
	 * @Description: 删除特定的所有事件监听器
	 * @param: @param listener      
	 * @return: void      
	 * @throws   
	 */  
	public void removeListener(IEventListener  listener) {
		removeListener(listener,null);
	}
	
	public void removeListener(IEventListener  listener ,String eventName) {
		if (eventListeners != null) {
			for (int i = eventListeners.size()-2; i > -1; i-=2) {
				if (eventListeners.get(i + 1) == listener && (eventName == null ||
						String.valueOf(eventListeners.get(i)).equals(eventName))) {
					eventListeners.remove(i + 1);
					eventListeners.remove(i);
				}
			}
		}
	}

	/**   
	 * @Title: fireEvent   
	 * @Description:以this为事件源，触发监听器对象
	 * @param: @param evt      
	 * @return: void      
	 * @throws   
	 */  
	public void fireEvent(EventObject evt) {
		fireEvent(evt , null);
	}
	
	public void fireEvent(EventObject eventObject , Object sender) {
		if (eventListeners != null && !eventListeners.isEmpty() && isEventsEnabled()) {
			if (sender == null ) {
				sender = getEventSource();
			}
			
			if (sender == null ) {
				sender = this;
			}
			
			for (int i = 0; i < eventListeners.size(); i+=2) {
				String listen = (String) eventListeners.get(i);
				
				if (listen == null || listen.equals(eventObject.getName())) {
					((IEventListener) eventListeners.get(i + 1)).response(

							sender, eventObject);
				}
			}
		}
	}
	
}
