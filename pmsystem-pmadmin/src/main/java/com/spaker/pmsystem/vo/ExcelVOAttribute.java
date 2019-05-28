package com.spaker.pmsystem.vo;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Excel注解实现类
 * Created by sunshine on 2019/4/25.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
public @interface  ExcelVOAttribute {
    /**
     *
     * 导出到Excel中的名字
     */
    public abstract String name();

    /**
     * 配置列的名称，对应A,B,C,D...
     *
     */
    public abstract String column();

    /**
     * 提示信息
     *
     * */
    public abstract String prompt() default "";

    /**
     * 设置只能选择不能输入的列内容
     */
    public abstract String[] combo()default {};
    /**
     * 是否导出数据
     */
    public abstract boolean isExport() default true;


}
