package com.free.builder.design;

import com.free.builder.design.director.Director;
import com.free.builder.design.model.BModel;
import com.free.builder.design.model.AModel;

public class TestBuilder {
    public static void main(String[] args) {
        AModel aModel = new AModel(1,"AModel属性1", "AModel属性2");
        Director director = new Director();
        BModel bModel = director.getBModel(aModel);
        System.out.println(bModel);
    }

}
