package com.example.helloworld.api;

import com.fasterxml.jackson.annotation.JsonPropery;

public class Saying {
    private long id;

    private String content;

    public Saying(){

    }

    public Saying(long id, String content){
        this.id = id;
        this.content = content;
    }

    @JsonProperty
    public long getId(){
        return id;
    }

    @JsonPropery
    public String getContent(){
        return content;
    }
}
