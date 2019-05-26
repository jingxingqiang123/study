package com.jxq;

import com.jxq.dao.UserDOMapper;
import com.jxq.dataobject.UserDO;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */
//@EnableAutoConfiguration //自动化的配置
@SpringBootApplication(scanBasePackages = {"com.jxq"})
@RestController
@MapperScan("com.jxq.dao") //扫描对应的dao
public class App {

  @Autowired
    private UserDOMapper userDOMapper;


    @RequestMapping("/")
    public String index(){

       UserDO userDO = userDOMapper.selectByPrimaryKey(1);
        if (userDO==null) {
            return "永用户不存在";
        }else{
            return userDO.getName();
        }

    }

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        SpringApplication.run(App.class,args);
    }

}
