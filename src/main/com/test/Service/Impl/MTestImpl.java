package com.test.Service.Impl;

import com.test.Entity.MYTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.Service.MTest;

/**
 * Created by Administrator on 2017/11/24.
 */
@Service("MTest")
public class MTestImpl implements MTest {

    @Autowired
    private MYTest myTest;

    @Override
    public void test() {
        System.out.println("OK");
        if (myTest!=null){
            System.out.println("为什么可以");
        }
    }
}
