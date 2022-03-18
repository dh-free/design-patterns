package com.free.decorator.design.service.impl;

import com.free.decorator.design.service.FileComponent;

/**
 * 文件上传七牛云实现
 *
 * @Author: hao.ding@insentek.com
 * @Date: 2022-03-17 15:08:51
 */
public class QiniuComponentImpl implements FileComponent {

    private String file;

    public QiniuComponentImpl(String file) {
        this.file = file;
    }

    @Override
    public String upload(String file) {
        return file + ",文件上传到七牛云";
    }
}
