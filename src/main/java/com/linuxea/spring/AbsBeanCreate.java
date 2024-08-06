package com.linuxea.spring;

import java.lang.reflect.Field;
import java.util.List;

public abstract class AbsBeanCreate implements BeanCreate {

    public Object newInstance(BeanDefinition beanDefinition) {
        try {
            Object newInstance = beanDefinition.gettClass().getDeclaredConstructor().newInstance();
            List<Property> properties = beanDefinition.getProperties();
            for (Property property : properties) {
                Field declaredField = beanDefinition.gettClass().getDeclaredField(property.getName());
                declaredField.setAccessible(true);
                if (property.getRef() != null) {
                    declaredField.set(newInstance, property.getRef());
                } else {
                    declaredField.set(newInstance, property.getValue());
                }
            }
            return newInstance;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
