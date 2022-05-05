package com.study.controller;

import com.study.service.EncryptorRealtimeDataDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Rrow
 * @Date: 2022/5/5 20:08
 */
@RestController
public class MyController {

    @Autowired
    private EncryptorRealtimeDataDetailService encryptorRealtimeDataDetailService;

    @GetMapping("/del")
    public String getString() {
        encryptorRealtimeDataDetailService.deleteByCollectTime(1);
        return "deleteSuccess";
    }

}
