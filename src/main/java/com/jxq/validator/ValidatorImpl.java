package com.jxq.validator;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Set;


/**
 * @author JingXingQiang
 * @date 2019/5/31 22:03
 */
@Component //交给spring管理
public class ValidatorImpl  implements InitializingBean {

    // java接口定义的的valiator的工具
    private Validator validator;

    //实现校验方法并返回校验结果
    public ValidationResult validate(Object bean){
        ValidationResult result = new ValidationResult();
        Set<ConstraintViolation<Object>> constraintViolationSet =
                     validator.validate(bean);
        if (constraintViolationSet.size()>0){
            //有错误
            result.setHasErrors(true);
            constraintViolationSet.forEach(constraintViolation->{
                String errMsg=constraintViolation.getMessage();
                String propertiesName =constraintViolation.getPropertyPath().toString();
                result.getErrorMsgMap().put(propertiesName, errMsg);
            });
        }
        return result;
    }


    // spring  bean 初始化完后会回调ValidatorImpl的afterPropertiesSet
    @Override
    public void afterPropertiesSet() throws Exception {
        // 将hibernate validator通过工厂的初始化方法使其实例化
        this.validator = Validation.buildDefaultValidatorFactory().getValidator();
    }
}
