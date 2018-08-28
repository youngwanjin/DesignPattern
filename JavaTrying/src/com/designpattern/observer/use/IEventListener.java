package com.designpattern.observer.use;

/**   
 * @ClassName:  IEventListener   
 * @Description:自定义接口监听接口 
 * @author: wanjinYoung 
 * @date:   2018年8月28日 下午1:26:23   
 *    
 * @Copyright: 2018 www.wanjinYoung.com Inc. All rights reserved. 
 */  
public interface IEventListener {
	public void response(Object sender,EventObject evt);

}
