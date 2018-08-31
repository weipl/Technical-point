package com.weipenglin.girl;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GirlRepository extends JpaRepository<Girl ,Integer> {
    //通过年龄来查询  findByAgez这个名字固定,不能乱改
    public List<Girl> findByAge(Integer age);
}
