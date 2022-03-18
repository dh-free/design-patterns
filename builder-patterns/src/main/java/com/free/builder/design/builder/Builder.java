package com.free.builder.design.builder;

import com.free.builder.design.model.BModel;
import com.free.builder.design.model.AModel;

/**
 * 抽象建造者接口
 *
 * @Author: hao.ding@insentek.com
 * @Date: 2022-03-18 10:51:31
 */
public interface Builder {

    void build(AModel aModel);

    BModel getBModel();
}
