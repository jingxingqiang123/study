package com.jxq.error;

/**
 * 包装器业务异常类实现
 */
public class BusinessException extends Exception implements CommonError {

    private CommonError commonError;

    /**直接接收EmBusinessError的传参用于构造业务异常*/
    public BusinessException(CommonError commonError){
        super();//对BusinessException自身有一定的初始化机制
        this.commonError=commonError;
    }

    /**接收自定义的errMsg的方式构造业务异常*/
    public BusinessException(CommonError commonError,String errMsg){
        super();
        this.commonError=commonError;
        this.setErrMsg(errMsg);
    }

    @Override
    public int getErrCode() {
         return this.commonError.getErrCode();
    }

    @Override
    public String getErrMsg() {
        return this.commonError.getErrMsg();
    }

    @Override
    public CommonError setErrMsg(String errMsg) {
        this.commonError.setErrMsg(errMsg);
        return this;
    }
}
