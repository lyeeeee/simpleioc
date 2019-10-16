package com.bupt.simpleioc;

/**
 * @program: simpleioc
 * @description: bean defination
 * @author: liyi
 * @create: 2019-10-16 21:11
 */
public class BeanDefination {
    private Class<?> clazz;
    private String name;

    private Object bean;

    public BeanDefination(Object bean){
        this.bean = bean;
    }

    public Object getBean(){
        return bean;
    }
}
