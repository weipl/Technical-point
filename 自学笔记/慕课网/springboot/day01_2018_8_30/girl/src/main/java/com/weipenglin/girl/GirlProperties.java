package com.weipenglin.girl;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @ Author     ：weipenglin.
 * @ Date       ：Created in 22:32 2018/8/30
 * @ Description：girl配置文件
 * @ Modified By：
 * @Version: 0.0.1.$
 */
@ConfigurationProperties(prefix ="girl")
@Component
public class GirlProperties {
    private String cupSize;
    private Integer age;

    public String getCupSize() {
        return cupSize;
    }

    public void setCupSize(String cupSize) {
        this.cupSize = cupSize;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
