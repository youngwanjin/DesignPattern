package com.designpattern.cglibproxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**   
 * @ClassName:  SubjectCglib   
 * @Description:代理类
 * @author: wanjinYoung 
 * @date:   2018年8月16日 下午12:24:33   
 *     
 * @Copyright: 2018 www.wanjinYoung.com Inc. All rights reserved. 
 */  
public class SubjectCglib  implements MethodInterceptor{
	
	 //业务类对象，供代理方法中进行真正的业务方法调用
    private Object target;


    //相当于JDK动态代理中的绑定
    public Object getInstance(Object target) {
        //给业务对象赋值
        this.target = target;

        //创建加强器，用来创建动态代理类
        Enhancer enhancer = new Enhancer();

        //为加强器指定要代理的业务类（即：为下面生成的代理类指定父类）
        enhancer.setSuperclass(this.target.getClass());

        //设置回调：对于代理类上所有方法的调用，都会调用CallBack，而Callback则需要实现intercept()方法进行拦
        enhancer.setCallback(this);

        // 创建动态代理类对象并返回
        return enhancer.create();
    }

    // 实现回调方法
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        doBefore();
        //调用业务类（父类中）的方法
        proxy.invokeSuper(obj, args);
        doAfter();
        return null;
    }

    private void doBefore(){
        System.out.println("Do something before!");

    }

    private void doAfter(){
        System.out.println("Do something after!");
    }
	
	

}
