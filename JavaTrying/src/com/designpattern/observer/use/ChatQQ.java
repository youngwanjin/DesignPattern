package com.designpattern.observer.use;

/**   
 * @ClassName:  ChatQQ   
 * @Description:自定义QQ聊天事件源，继承事件源对象EventSource
 * @author: wanjinYoung 
 * @date:   2018年8月28日 下午1:40:13   
 *    
 * @Copyright: 2018 www.wanjinYoung.com Inc. All rights reserved. 
 */  
public class ChatQQ extends EventSource{
	//聊天回话名称
	private String name;
	
	/**   
	 * @Title:  ChatQQ   
	 * @Description:构造函数
	 * @param:  @param name  
	 * @throws   
	 */  
	public ChatQQ(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	
	/**   
	 * @Title: textChat   
	 * @Description:发起文字聊天 
	 * @param:       
	 * @return: void      
	 * @throws   
	 */  
	public void textChat() {
		EventObject text = new EventObject(Event.MSG_CHAT,"text","text:Hello world!");
		this.fireEvent(text);
	}
	
	/**   
	 * @Title: voiceChat   
	 * @Description:发起语音聊天
	 * @param:       
	 * @return: void      
	 * @throws   
	 */  
	public void voiceChat() {
		EventObject voice = new EventObject(Event.VOICE_CHAT,"voice","voice:Hello world!");
		this.fireEvent(voice);
	}
	
	/**   
	 * @Title: videoChat   
	 * @Description:发起视频聊天
	 * @param:       
	 * @return: void      
	 * @throws   
	 */  
	public void videoChat() {
		EventObject video = new EventObject(Event.VIDEO_CHAT,"video","video:Hello world!");
		this.fireEvent(video);
	}
	

}
