package com.bupt.simpleioc;

import java.lang.reflect.Field;
import java.util.List;

/**
 * @program: simpleioc
 * @description: ${description}
 * @author: liyi
 * @create: 2019-10-16 21:54
 */
public class AutoWireBeanFactory extends AbstractBeanFactory {
    @Override
    protected Object doCreateBean(BeanDefination beanDefination) throws IllegalAccessException, InstantiationException, NoSuchFieldException {
        Class beanClass = beanDefination.getClazz();
        Object bean = beanClass.newInstance();
        setPropertyValues(bean, beanDefination);
        return bean;
    }

    private void setPropertyValues(Object bean, BeanDefination beanDefination) throws NoSuchFieldException, IllegalAccessException {
        List<PropertyValue> propertyValues = beanDefination.getPropertyValueList();
        for(PropertyValue propertyValue : propertyValues){
            Field property = bean.getClass().getDeclaredField(propertyValue.getPropertyName());
            if(!property.isAccessible())
                property.setAccessible(true);
            property.set(bean, propertyValue.getValue());
        }
    }
}
