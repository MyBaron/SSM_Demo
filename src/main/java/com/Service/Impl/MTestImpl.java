package com.Service.Impl;

import com.Entity.MYTest;
import com.Service.MTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Service.MTest;

/**
 * Created by Administrator on 2017/11/24.
 */
@Service("MTest")
public class MTestImpl implements MTest {

    @Autowired
    private MYTest myTest;


    public void test() {
        System.out.println("OK");
        if (myTest!=null){
            System.out.println("为什么可以");
        }
    }
}
