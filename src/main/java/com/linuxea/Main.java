package com.linuxea;

import com.linuxea.spring.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        BeanFactory simpleBeanFactory = new SimpleBeanFactory();

        BeanDefinition dogBeanDefinition = new BeanDefinition();
        dogBeanDefinition.setScope(Scope.SINGLETON);
        dogBeanDefinition.settClass(Dog.class);
        dogBeanDefinition.setName("linuxeaDog");
        List<Property> dogProperties = new ArrayList<>();
        dogProperties.add(new Property("nickname", "nini"));
        dogBeanDefinition.setProperties(dogProperties);
        simpleBeanFactory.registerBean(dogBeanDefinition);


        BeanDefinition beanDefinition = new BeanDefinition();
        beanDefinition.setScope(Scope.PROTOTYPE);
        beanDefinition.settClass(Person.class);
        beanDefinition.setName("linuxeaPerson");
        List<Property> properties = new ArrayList<>();
        properties.add(new Property("name", "linuxea"));
        properties.add(new Property("age", 12));
        properties.add(new Property("dog", null, simpleBeanFactory.getBean("linuxeaDog")));
        beanDefinition.setProperties(properties);


        simpleBeanFactory.registerBean(beanDefinition);

        for (int i = 0; i < 10; i++) {
            Object linuxeaPerson = simpleBeanFactory.getBean("linuxeaPerson");
            System.out.println(linuxeaPerson + ":" + linuxeaPerson.hashCode());
        }

    }

}
