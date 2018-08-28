package com.designpattern.observer.use;

/**   
 * @ClassName:  AndroidQQ   
 * @Description:自定义AndroidQQ监听对象，实现了IEventListener监听接口
 * @author: wanjinYoung 
 * @date:   2018年8月28日 下午1:29:45   
 *    
 * @Copyright: 2018 www.wanjinYoung.com Inc. All rights reserved. 
 */  
public class AndroidQQ implements IEventListener {
	//对不同的事件进行响应
	@Override
	public void response(Object sender, EventObject evt) {
		//对事件对象进行解析 
		String msgType = evt.getName();
		String msg = "Android设备=>";
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
