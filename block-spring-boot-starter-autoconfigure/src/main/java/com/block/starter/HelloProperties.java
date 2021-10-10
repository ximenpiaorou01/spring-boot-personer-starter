package com.block.starter;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author wangrongsong
 * @title: HelloProperties
 * @projectName spring-boot-personer-starter
 * @description: TODO
 * @date 2021-10-10 16:50
 */
@ConfigurationProperties(prefix = "block.hello")
public class HelloProperties {
    private String prefix;
    private String suffix;

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
}
