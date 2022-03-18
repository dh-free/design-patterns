package com.free.builder.design.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * A系统-Model实体
 *
 * @Author: hao.ding@insentek.com
 * @Date: 2022-03-18 10:52:00
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AModel {

    private Integer id;

    private String property1;

    private String property2;
}
