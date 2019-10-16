package com.bupt.simpleioc;

import com.bupt.simpleioc.exception.BeanNameDuplicationException;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @program: simpleioc
 * @description: ${description}
 * @author: liyi
 * @create: 2019-10-16 21:47
 */
public abstract class AbstractBeanFactory implements BeanFactory{

    private Map<String, BeanDefination> beanDefinationMap = new ConcurrentHashMap<>();

    @Override
    public Object getBean(String beanDefinationName) {
        return beanDefinationMap.get(beanDefinationName).getBean();
    }

    @Override
    public void registerBeanDefination(String beanDefinationName, BeanDefination beanDefination) throws BeanNameDuplicationException, InstantiationException, IllegalAccessException, NoSuchFieldException, ClassNotFoundException {
        if(beanDefinationMap.containsKey(beanDefinationName)){
            throw new BeanNameDuplicationException();
        }else{
            Object bean = doCreateBean(beanDefination);
            beanDefination.setBean(bean);
            beanDefinationMap.put(beanDefinationName, beanDefination);
        }
    }

    protected abstract Object doCreateBean(BeanDefination beanDefination) throws IllegalAccessException, InstantiationException, NoSuchFieldException, ClassNotFoundException;
}
