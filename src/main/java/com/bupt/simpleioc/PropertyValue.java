package com.bupt.simpleioc;

/**
 * @program: simpleioc
 * @description: ${description}
 * @author: liyi
 * @create: 2019-10-16 21:59
 */
public class PropertyValue {
    private String propertyName;

    private Object value;

    public PropertyValue() {
    }

    public PropertyValue(String propertyName, Object value) {
        this.propertyName = propertyName;
        this.value = value;
    }

    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
