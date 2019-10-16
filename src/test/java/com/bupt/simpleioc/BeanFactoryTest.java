package com.bupt.simpleioc;

import com.bupt.simpleioc.bean.Person;
import com.bupt.simpleioc.exception.BeanNameDuplicationException;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: simpleioc
 * @description: ${description}
 * @author: liyi
 * @create: 2019-10-16 22:05
 */
public class BeanFactoryTest {
    @Test
    public void testAutoWireBeanFactory() throws BeanNameDuplicationException, NoSuchFieldException, InstantiationException, IllegalAccessException, ClassNotFoundException {
        BeanFactory beanFactory = new AutoWireBeanFactory();
        BeanDefination beanDefination = new BeanDefination();
        beanDefination.setBeanClassName("com.bupt.simpleioc.bean.Person");
        List<PropertyValue> propertyValues = new ArrayList<>();
        propertyValues.add(new PropertyValue("name","liyi"));
        propertyValues.add(new PropertyValue("age",10));
        beanDefination.setPropertyValueList(propertyValues);
        beanFactory.registerBeanDefination("person",beanDefination);
        Person person = (Person)beanFactory.getBean("person");
        System.out.println(person);
    }
}
