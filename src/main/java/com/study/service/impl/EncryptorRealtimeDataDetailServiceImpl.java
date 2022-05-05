package com.study.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.study.domain.EncryptorRealtimeDataDetail;
import com.study.service.EncryptorRealtimeDataDetailService;
import com.study.mapper.EncryptorRealtimeDataDetailMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
* @author romantic
* @description 针对表【encryptor_realtime_data_detail】的数据库操作Service实现
* @createDate 2022-05-05 20:07:08
*/
@Service
@Slf4j
public class EncryptorRealtimeDataDetailServiceImpl extends ServiceImpl<EncryptorRealtimeDataDetailMapper, EncryptorRealtimeDataDetail>
    implements EncryptorRealtimeDataDetailService{

    @Resource
    private EncryptorRealtimeDataDetailMapper encryptorRealtimeDataDetailMapper;


    @Override
    public void deleteByCollectTime(Integer collectTime) {
        encryptorRealtimeDataDetailMapper.deleteByCollectTime(collectTime);
    }

    @Override
    public boolean insertBatch(List<EncryptorRealtimeDataDetail> list) {
        return encryptorRealtimeDataDetailMapper.insertBatch(list);
    }
}




