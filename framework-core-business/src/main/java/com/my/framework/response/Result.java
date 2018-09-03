package com.my.framework.response;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author: Mr.WangJie
 * @date: 2018-09-03
 **/
@Data
@AllArgsConstructor
public class Result {

    /**
     * 返回码
     */
    private int code;

    /**
     * 描述
     */
    private String description;

    /**
     * 返回数据
     */
    private Object data;
}
