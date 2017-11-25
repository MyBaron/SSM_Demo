package com.Service.lmpl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.test.Service.MTest;

/**
 * Created by Administrator on 2017/11/24.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-mvc.xml","classpath:spring-mybatis.xml"})
public class TestImplTest  {


    @Autowired
    private MTest MTest;

    @Test
    public void test1() throws Exception {
        MTest.test();
    }

}