package com.linuxea.spring;

import java.util.List;

public class BeanDefinition {

    private Scope scope;

    private String name;

    private Class<?> tClass;

    private List<Property> properties;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Class<?> gettClass() {
        return tClass;
    }

    public void settClass(Class<?> tClass) {
        this.tClass = tClass;
    }

    public List<Property> getProperties() {
        return properties;
    }

    public void setProperties(List<Property> properties) {
        this.properties = properties;
    }

    public Scope getScope() {
        return scope;
    }

    public void setScope(Scope scope) {
        this.scope = scope;
    }
}
