package com.jxq.validator;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @author JingXingQiang
 * @date 2019/5/31 21:53.
 */
public class ValidationResult {
    // 校验结果是否有错
    private boolean hasErrors=false;

    //存放错误信息的map
    private Map<String, String> errorMsgMap=new HashMap<>();

    //返回true，就是有error,false就是没有error
    public boolean isHasErrors() {
        return hasErrors;
    }

    public void setHasErrors(boolean hasErrors) {
        this.hasErrors = hasErrors;
    }

    public Map<String, String> getErrorMsgMap() {
        return errorMsgMap;
    }

    public void setErrorMsgMap(Map<String, String> errorMsgMap) {
        this.errorMsgMap = errorMsgMap;
    }


    // 实现通用的方法，通过格式化字符串信息获取错误信息结果的msg方法

    public String getErrorMsg() {
        return StringUtils.join(errorMsgMap.values().toArray(), ",");
    }

}
