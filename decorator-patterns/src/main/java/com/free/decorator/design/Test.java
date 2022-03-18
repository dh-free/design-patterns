package com.free.decorator.design;

import com.free.decorator.design.decorator.Decorator;
import com.free.decorator.design.decorator.DecoratorExtend;
import com.free.decorator.design.service.FileComponent;
import com.free.decorator.design.service.impl.LocalComponentImpl;
import com.free.decorator.design.service.impl.OssComponentImpl;

public class Test {

    public static void main(String[] args) {
        String file = "test.txt";
        //我们想把文件上传至OSS
        FileComponent oss = new OssComponentImpl(file);
        FileComponent decoratorOss = new Decorator(oss);
        System.out.println(decoratorOss.upload(file));
        //上传到本地
        FileComponent local = new LocalComponentImpl(file);
        FileComponent decoratorLocal = new Decorator(local);
        System.out.println(decoratorLocal.upload(file));
        //此时如果我们需要在装饰器前扩展额外功能，只需要扩展Decorator即可
        DecoratorExtend decoratorExtend = new DecoratorExtend(oss);
        System.out.println(decoratorExtend.extend());
        System.out.println(decoratorExtend.upload(file));

    }
}
