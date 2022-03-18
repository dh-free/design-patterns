package com.free.decorator.design.decorator;

import com.free.decorator.design.service.FileComponent;

/**
 * 装饰器扩展
 *
 * @Author: hao.ding@insentek.com
 * @Date: 2022-03-17 15:09:11
 */
public class DecoratorExtend extends Decorator {

    public DecoratorExtend(FileComponent fileComponent) {
        super(fileComponent);
    }

    //扩展额外功能
    public String extend() {

        return "功能扩展";
    }
}
