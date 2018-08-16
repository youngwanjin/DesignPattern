package com.designpattern.cglibproxy;

/**   
 * @ClassName:  RealSubject   
 * @Description:真实主题类
 * @author: wanjinYoung 
 * @date:   2018年8月16日 上午11:42:46   
 *     
 * @Copyright: 2018 www.wanjinYoung.com Inc. All rights reserved. 
 */  
public class RealSubject {
	public void request() {
		System.out.println("Do real business!");
	}

}
