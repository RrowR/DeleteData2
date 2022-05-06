package com.study;

import com.study.domain.EncryptorRealtimeDataDetail;
import com.study.service.EncryptorRealtimeDataDetailService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * @Author: Rrow
 * @Date: 2022/5/5 20:32
 */
@SpringBootTest
@Slf4j
public class MySpringBootApplicationTest {

    @Autowired
    private EncryptorRealtimeDataDetailService encryptorRealtimeDataDetailService;

    @Test
    void TestBatchInsert() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        ArrayList<EncryptorRealtimeDataDetail> list = new ArrayList<>();
        for (int j = 0; j < 150; j++) {
            for (int i = 0; i < 10000; i++) {
                EncryptorRealtimeDataDetail detail = new EncryptorRealtimeDataDetail(String.valueOf(i), String.valueOf(i), String.valueOf(i), String.valueOf(i), dateFormat.format(new Date()));
                System.out.println(detail);
                list.add(detail);
            }
            encryptorRealtimeDataDetailService.insertBatch(list);
        }
    }

    @Test
    void TestOthers() {
        System.out.println(new Date().toString());
    }


}
