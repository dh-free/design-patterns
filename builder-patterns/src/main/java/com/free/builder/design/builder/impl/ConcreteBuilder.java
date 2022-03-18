package com.free.builder.design.builder.impl;

import com.free.builder.design.model.BModel;
import com.free.builder.design.builder.Builder;
import com.free.builder.design.model.AModel;

/**
 * 具体建造者实现
 *
 * @Author: hao.ding@insentek.com
 * @Date: 2022-03-18 10:51:42
 */
public class ConcreteBuilder implements Builder {

    private final BModel bModel = new BModel();

    @Override
    public void build(AModel aModel) {
        bModel.setId(aModel.getId());
        bModel.setProperty1(aModel.getProperty1());
        bModel.setProperty2(aModel.getProperty2());
        bModel.setProperty3("BModel自有属性3");
        bModel.setProperty4("BModel自有属性4");
        bModel.setProperty5("BModel自有属性5");
    }

    @Override
    public BModel getBModel() {
        return bModel;
    }
}
