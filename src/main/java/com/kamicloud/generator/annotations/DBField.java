package com.kamicloud.generator.annotations;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
public @interface DBField {
    /**
     * 变量原名，使用驼峰命名，网络传输转换成下划线
     */
    String name() default "";
}
