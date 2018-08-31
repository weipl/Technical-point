package com.weipenglin.girl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;


/**
 * @ Author     ：weipenglin.
 * @ Date       ：Created in 20:21 2018/8/31
 * @ Description：Service
 * @ Modified By：
 * @Version: 0.0.1
 */
@Controller
public class GirlService {
    @Autowired
    private GirlRepository girlRepository;

    @Transactional
    public  void insertTwo(){
        Girl girlA = new Girl();
        girlA.setCupSize("A");
        girlA.setAge(18);
        girlRepository.save(girlA);

        Girl girlB = new Girl();
        girlB.setCupSize("BBB");
        girlB.setAge(19);
        girlRepository.save(girlB);

    }

}
