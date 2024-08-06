package com.linuxea.spring;

public class Dog {

    private String nickname;

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void bark() {
        System.out.println("wang wang !");
    }

}
