package com.weipenglin.girl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


//web请求访问要加@RestController
@RestController
@RequestMapping(value = "/hello")
public class HelloController {
    /**
     * 使用注解把配置文件中的内容注入到cupSize这个属性变量中来
     */
    @Autowired
    private GirlProperties girlProperties;

    //@RequestMapping(value ="/say",method = RequestMethod.POST)
    @PostMapping("/say")
    public String say(@RequestParam(value = "id",required = false,defaultValue = "0") Integer myId){
        return "id:" + myId;
       // return girlProperties.getCupSize() + girlProperties.getAge();
    }
}
