package com.free.decorator.design.decorator;

import com.free.decorator.design.service.FileComponent;

/**
 * 默认装饰器类
 *
 * @Author: hao.ding@insentek.com
 * @Date: 2022-03-17 15:09:02
 */
public class Decorator implements FileComponent {

    protected FileComponent fileComponent;

    public Decorator(FileComponent fileComponent) {
        this.fileComponent = fileComponent;
    }

    @Override
    public String upload(String file) {
        return fileComponent.upload(file);
    }
}
