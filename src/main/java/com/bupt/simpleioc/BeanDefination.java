package com.bupt.simpleioc;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: simpleioc
 * @description: bean defination
 * @author: liyi
 * @create: 2019-10-16 21:11
 */
public class BeanDefination {
    private Class<?> clazz;

    private Object bean;

    private String beanClassName;

    private List<PropertyValue> propertyValueList = new ArrayList<>();

    public BeanDefination(){}

    public BeanDefination(Class<?> clazz, Object bean, String beanClassName) {
        this.clazz = clazz;
        this.bean = bean;
        this.beanClassName = beanClassName;
    }

    public List<PropertyValue> getPropertyValueList() {
        return propertyValueList;
    }

    public void setPropertyValueList(List<PropertyValue> propertyValueList) {
        this.propertyValueList = propertyValueList;
    }

    public Class<?> getClazz() {
        return clazz;
    }

    public void setClazz(Class<?> clazz) {
        this.clazz = clazz;
    }

    public Object getBean() {
        return bean;
    }

    public void setBean(Object bean) {
        this.bean = bean;
    }

    public String getBeanClassName() {
        return beanClassName;
    }

    public void setBeanClassName(String beanClassName) {
        Class c = null;
        try{
            c = Class.forName(beanClassName);
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        this.clazz = c;
        this.beanClassName = beanClassName;
    }
}
