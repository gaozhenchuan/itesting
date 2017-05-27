package com.fujias.itesting.base.annotation;

import java.lang.annotation.*;

@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Column {

    /**
     * 供应商编号
     * @return
     */
    public String name() default "fieldName";

    /**
     * 供应商编号
     * @return
     */
    public String setFuncName() default "setField";

    /**
     * 供应商编号
     * @return
     */
    public String getFuncName() default "getField";

    /**
     * 供应商编号
     * @return
     */
    public boolean defaultDBValue() default false;
}
