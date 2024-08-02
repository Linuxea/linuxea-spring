package com.linuxea.spring;

import java.util.HashMap;
import java.util.Map;

public class SimpleBeanFactory implements BeanFactory {

    private final Map<String, BeanDefinition> beanDefinitionMap = new HashMap<>();
    private final Map<Scope, BeanCreate> beanCreateHashMap = new HashMap<>() {{
        put(Scope.PROTOTYPE, new PrototypeBeanCreate());
        put(Scope.SINGLETON, new SingletonBeanCreate());
    }};

    @Override
    public Object getBean(String name) {
        BeanDefinition beanDefinition = this.beanDefinitionMap.get(name);
        if (beanDefinition == null) {
            throw new RuntimeException();
        }
        return beanCreateHashMap.get(beanDefinition.getScope()).createBean(beanDefinition);
    }

    @Override
    public void registerBean(BeanDefinition beanDefinition) {
        if (!beanDefinitionMap.containsKey(beanDefinition.getName())) {
            beanDefinitionMap.put(beanDefinition.getName(), beanDefinition);
        }
    }
}
