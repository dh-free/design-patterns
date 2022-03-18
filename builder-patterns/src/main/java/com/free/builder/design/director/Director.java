package com.free.builder.design.director;

import com.free.builder.design.builder.impl.ConcreteBuilder;
import com.free.builder.design.model.BModel;
import com.free.builder.design.builder.Builder;
import com.free.builder.design.model.AModel;

/**
 * 导演类
 *
 * @Author: hao.ding@insentek.com
 * @Date: 2022-03-18 10:53:25
 */
public class Director {

    private Builder builder = new ConcreteBuilder();

    public BModel getBModel(AModel aModel) {
        builder.build(aModel);
        return builder.getBModel();
    }
}
