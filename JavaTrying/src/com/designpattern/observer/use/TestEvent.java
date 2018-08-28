package com.designpattern.observer.use;

/**   
 * @ClassName:  TestEvent   
 * @Description:测试类
 * @author: wanjinYoung 
 * @date:   2018年8月28日 下午1:50:28   
 *    
 * @Copyright: 2018 www.wanjinYoung.com Inc. All rights reserved. 
 */  
public class TestEvent {
	public static void main(String[] args) {
		ChatQQ chatQQ = new ChatQQ("QQ会话！");
		System.out.println("Android QQ与IPhone QQ上线了...");
		
		//可以把相同的事件绑定到不同的事件监听器对象上 
		chatQQ.addListener(Event.MSG_CHAT, new IPhoneQQ());
		chatQQ.addListener(Event.MSG_CHAT, new AndroidQQ());
		chatQQ.addListener(Event.VOICE_CHAT, new IPhoneQQ());
		chatQQ.addListener(Event.VOICE_CHAT, new AndroidQQ());
		chatQQ.addListener(Event.VIDEO_CHAT, new IPhoneQQ());
		chatQQ.addListener(Event.VIDEO_CHAT, new AndroidQQ());
		
		//事件源发生不同的的事件
		chatQQ.textChat();
		chatQQ.voiceChat();
		chatQQ.videoChat();
		
	}

}
