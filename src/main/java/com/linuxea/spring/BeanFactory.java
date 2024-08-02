package com.linuxea.spring;

public interface BeanFactory {

    Object getBean(String name);

    void registerBean(BeanDefinition beanDefinition);

}
