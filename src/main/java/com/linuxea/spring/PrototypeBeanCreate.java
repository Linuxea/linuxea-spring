package com.linuxea.spring;

public class PrototypeBeanCreate extends AbsBeanCreate {

    @Override
    public Object createBean(BeanDefinition beanDefinition) {
        try {
            return newInstance(beanDefinition);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
