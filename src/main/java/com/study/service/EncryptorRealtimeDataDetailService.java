package com.study.service;

import com.study.domain.EncryptorRealtimeDataDetail;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author romantic
* @description 针对表【encryptor_realtime_data_detail】的数据库操作Service
* @createDate 2022-05-05 20:07:08
*/
public interface EncryptorRealtimeDataDetailService extends IService<EncryptorRealtimeDataDetail> {
    void deleteByCollectTime(Integer collectTime);
    boolean insertBatch(List<EncryptorRealtimeDataDetail> list);
}
