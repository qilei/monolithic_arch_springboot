/*
 * Copyright 2012-2020. the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License. More information from:
 *
 *        https://github.com/fenixsoft
 */

package com.github.fenixsoft.bookstore.infrastructure.jaxrs;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * 带编码的实体容器
 * <p>
 * 用于返回给客户端以形式为“{code,message,entity}”的对象格式
 *
 * @author icyfenix@gmail.com
 * @date 2020/3/6 15:34
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CodedMessage {
    /**
     * 约定的成功标志
     */
    public static final Integer CODE_SUCCESS = 0;
    /**
     * 默认的失败标志，其他失败含义可以自定义
     */
    public static final Integer CODE_DEFAULT_FAILURE = 1;

    private Integer code;
    private String message;
    private Object entity;

    public CodedMessage() {
    }

    public CodedMessage(Integer code, String message) {
        setCode(code);
        setMessage(message);
    }

    public CodedMessage(Integer code, String message, Object entity) {
        this(code, message);
        setEntity(entity);
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getEntity() {
        return entity;
    }

    public void setEntity(Object entity) {
        this.entity = entity;
    }
}
