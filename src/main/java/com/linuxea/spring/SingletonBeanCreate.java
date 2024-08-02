package com.linuxea.spring;

import java.util.HashMap;
import java.util.Map;

public class SingletonBeanCreate extends PrototypeBeanCreate {

    private final Map<String, Object> stringObjectMap = new HashMap<>();

    @Override
    public Object createBean(BeanDefinition beanDefinition) {
        try {
            if (stringObjectMap.containsKey(beanDefinition.getName())) {
                return stringObjectMap.get(beanDefinition.getName());
            }
            Object object = super.createBean(beanDefinition);
            stringObjectMap.put(beanDefinition.getName(), object);
            return object;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
