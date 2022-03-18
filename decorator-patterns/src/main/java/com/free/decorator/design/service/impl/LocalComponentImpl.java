package com.free.decorator.design.service.impl;

import com.free.decorator.design.service.FileComponent;

/**
 * 文件上传本地实现
 *
 * @Author: hao.ding@insentek.com
 * @Date: 2022-03-17 15:17:42
 */
public class LocalComponentImpl implements FileComponent {

    private String file;

    public LocalComponentImpl(String file) {
        this.file = file;
    }

    @Override
    public String upload(String file) {
        return file + ",文件上传到本地服务器";
    }
}
