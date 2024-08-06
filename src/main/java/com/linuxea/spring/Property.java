package com.linuxea.spring;

public class Property {
    private String name;
    private Object value;
    private Object ref;

    public Property(String name, Object value) {
        this(name, value, null);
    }

    public Property(String name, Object value, Object ref) {
        this.name = name;
        this.value = value;
        this.ref = ref;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public Object getRef() {
        return ref;
    }

    public void setRef(Object ref) {
        this.ref = ref;
    }
}
