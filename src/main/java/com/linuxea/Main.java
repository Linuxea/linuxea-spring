package com.linuxea;

import com.linuxea.spring.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        BeanDefinition beanDefinition = new BeanDefinition();
        beanDefinition.setScope(Scope.PROTOTYPE);
        beanDefinition.settClass(Person.class);
        beanDefinition.setName("linuxeaPerson");
        List<Property> properties = new ArrayList<>();
        properties.add(new Property("name", "linuxea"));
        properties.add(new Property("age", 12));
        beanDefinition.setProperties(properties);

        BeanFactory simpleBeanFactory = new SimpleBeanFactory();
        simpleBeanFactory.registerBean(beanDefinition);

        for (int i = 0; i < 10; i++) {
            Object linuxeaPerson = simpleBeanFactory.getBean("linuxeaPerson");
            System.out.println(linuxeaPerson + ":" + linuxeaPerson.hashCode());
        }

    }

}
