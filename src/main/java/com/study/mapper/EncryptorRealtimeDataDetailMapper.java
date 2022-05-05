package com.study.mapper;

import com.study.domain.EncryptorRealtimeDataDetail;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
* @author romantic
* @description 针对表【encryptor_realtime_data_detail】的数据库操作Mapper
* @createDate 2022-05-05 20:07:08
* @Entity com.study.domain.EncryptorRealtimeDataDetail
*/
public interface EncryptorRealtimeDataDetailMapper extends BaseMapper<EncryptorRealtimeDataDetail> {
    void deleteByCollectTime(Integer collectime);

    boolean insertBatch(List<EncryptorRealtimeDataDetail> list);
}




