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
public interface BeanFactory {

    Object getBean(String beanDefinationName);

    void registerBeanDefination(String beanDefinationName, BeanDefination beanDefination) throws BeanNameDuplicationException, InstantiationException, IllegalAccessException, NoSuchFieldException, ClassNotFoundException;

}
