package com.block.starter;

/**
 * @author wangrongsong
 * @title: HelloService
 * @projectName spring-boot-personer-starter
 * @description: TODO
 * @date 2021-10-10 16:49
 */
public class HelloService {

    HelloProperties helloProperties;

    public String sayHello(String name){

        return helloProperties.getPrefix()+"-"+name+"-"+helloProperties.getSuffix();
    }

    public HelloProperties getHelloProperties() {
        return helloProperties;
    }

    public void setHelloProperties(HelloProperties helloProperties) {
        this.helloProperties = helloProperties;
    }
}
