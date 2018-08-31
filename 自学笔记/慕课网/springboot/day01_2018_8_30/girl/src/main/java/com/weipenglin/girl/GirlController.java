package com.weipenglin.girl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

/**
 * @ Author     ：weipenglin.
 * @ Date       ：Created in 17:50 2018/8/31
 * @ Description：Girl的控制类
 * @ Modified By：
 * @Version: 0.0.1
 */
@RestController
public class GirlController {
    @Autowired
    private GirlRepository girlRepository;

    @Autowired
    private GirlService girlService;

    /**  1:
     * create by: weiepnglin
     * description: 获取表中表中所有女生
     * create time: 18:11 2018/8/31
     *

     * @return
     */
    @GetMapping(value = "/girls")
    public List<Girl> getlList(){
        return girlRepository.findAll();
    }

    /** 2:
     * create by: weiepnglin
     * description: 添加一个女生
     * create time: 18:10 2018/8/31
     *

     * @return
     */
    @PostMapping(value = "/girls")
    public Girl addOneGirl(@RequestParam("cupSize")  String cupSize,
                          @RequestParam("age") Integer age){
        Girl  girl = new Girl ();
        girl.setCupSize(cupSize);
        girl.setAge(age);

        return girlRepository.save(girl);
    }

    /** 3:
     * 查询一个女生
     * @param id
     * @return
     */
    @GetMapping(value = "/girls/{id}")
    public Optional<Girl> queryOneGirl(@PathVariable("id") Integer id){
        Optional<Girl> girl = girlRepository.findById(id);
        return girl;
    }

    /** 4:
     * 更新一个女生
     * @param id
     * @param cupSize
     * @param age
     */
    @PutMapping(value = "/girls/{id}")
    public Girl updateOneGirl(@PathVariable("id") Integer id,
                         @RequestParam("cupSize") String cupSize,
                         @RequestParam("age") Integer age){
        Girl  girl = new Girl ();
        girl.setId(id);
        girl.setCupSize(cupSize);
        girl.setAge(age);

        return girlRepository.save(girl);
    }

    /**
     *  5:
     *  删除一个女生
     * @param id
     */
   @DeleteMapping(value = "/girls/{id}")
    public void deleteOneGirl(@PathVariable("id") Integer id){
       try {
           girlRepository.deleteById(id);
           System.out.println("删除成功!");
       } catch (Exception e) {
           System.out.println("删除失败!");
           e.printStackTrace();
       }
   }
    /** 6:
     *  根据年龄查找一个女生
     * @param age
     * @return
     */
    @GetMapping(value = "/girls/age/{age}")
    public List<Girl> findByAge(@PathVariable("age") Integer age){
        return girlRepository.findByAge(age);
    }

    @PostMapping(value = "/girls/two")
    public void girlTwo(){
        girlService.insertTwo();
    }

}
