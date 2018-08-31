package com.weipenglin.girl;

import org.springframework.context.annotation.Configuration;


import javax.persistence.*;

/**
 * @ Author     ：weipenglin.
 * @ Date       ：Created in 9:57 2018/8/31
 * @ Description：gir类
 * @ Modified By：
 * @Version: 0.0.1$
 */
@Entity
@Table(name="Girl")
@Configuration
public class Girl {
    @Id
    @GeneratedValue //自增
    private Integer id;
    private String cupSize;
    private Integer age;

    public Girl() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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
