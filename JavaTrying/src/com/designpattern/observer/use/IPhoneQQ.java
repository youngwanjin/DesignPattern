package com.designpattern.observer.use;

/**   
 * @ClassName:  IPhoneQQ   
 * @Description:IphoneQQ 实现接口IEventListener
 * @author: wanjinYoung 
 * @date:   2018年8月28日 下午1:36:55   
 *    
 * @Copyright: 2018 www.wanjinYoung.com Inc. All rights reserved. 
 */  
public class IPhoneQQ implements IEventListener{
	//对不同的事件进行响应
	@Override
	public void response(Object sender, EventObject evt) {
		//对事件进行解析
		String msgType = evt.getName();
		String msg = "IPhone设备=>";
		if (msgType.equals(Event.MSG_CHAT)) {
			msg += evt.getProperty("text");
		} else if (msgType.equals(Event.VOICE_CHAT)) {
			msg += evt.getProperty("voice");
		} else if (msgType.equals(Event.VIDEO_CHAT)) {
			msg += evt.getProperty("video");
		}
 		System.out.println(msg);
	}

}
