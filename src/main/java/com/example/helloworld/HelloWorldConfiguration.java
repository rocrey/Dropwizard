package com.example.helloworld;

import io.dropwizard.Configuration;
import com.fasterxml.jackson.annotation.JsonPropery;

import javax.security.auth.login.Configuration;
import javax.validation.constraints.NotEmpty;

public class HelloWorldConfiguration extends Configuration {
    @NotEmpty
    private String template;

    @NotEmpty
    private String defaultName = "Stranger";

    @JsonPropery
    public String getTemplate(){
        return template;
    }

    @JsonPropery
    public void setTemplate(String template){
        this.template = template;
    }

    @JsonPropery
    public String getDefaultName(){
        return defaultName;
    }

    @JsonPropery
    public void setDefaultName(String name){
        this.defaultName = name;
    }
}
