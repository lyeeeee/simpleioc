package com.bupt.simpleioc;

import com.bupt.simpleioc.exception.BeanNameDuplicationException;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @program: simpleioc
 * @description: beanfactory
 * @author: liyi
 * @create: 2019-10-16 21:13
 */
public class BeanFactory {
    private static Map<String, BeanDefination> beanDefinationMap = new ConcurrentHashMap<>();
    public BeanFactory(){

    }

    public static Object getBean(String beanDefinationName){
        return beanDefinationMap.get(beanDefinationName).getBean();
    }

    public void registerBeanDefination(String beanDefinationName, BeanDefination beanDefination) throws BeanNameDuplicationException {
        if(beanDefinationMap.containsKey(beanDefinationName)){
            throw new BeanNameDuplicationException();
        }else{
            beanDefinationMap.put(beanDefinationName, beanDefination);
        }
    }
}
