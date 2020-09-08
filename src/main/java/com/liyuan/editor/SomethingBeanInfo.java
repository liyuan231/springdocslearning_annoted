package com.liyuan.editor;

import org.springframework.beans.propertyeditors.CustomNumberEditor;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.beans.PropertyEditor;
import java.beans.SimpleBeanInfo;

public class SomethingBeanInfo extends SimpleBeanInfo {
    @Override
    public PropertyDescriptor[] getPropertyDescriptors() {
        final PropertyEditor numberEditor = new CustomNumberEditor(Integer.class, true);
        PropertyDescriptor ageDescriptor = null;
        try {
            ageDescriptor = new PropertyDescriptor("age", Something.class) {
                public PropertyEditor createPropertyEditor(Object bean) {
                    return numberEditor;
                }
            };
        } catch (IntrospectionException e) {
            e.printStackTrace();
        }
        return new PropertyDescriptor[]{ageDescriptor};
    }
}
