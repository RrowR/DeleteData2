package com.study.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * @TableName encryptor_realtime_data_detail
 */
@TableName(value ="encryptor_realtime_data_detail")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EncryptorRealtimeDataDetail implements Serializable {
    /**
     * 
     */
    private String type;

    /**
     * 
     */
    private String date;

    /**
     * 
     */
    private String ip;

    /**
     * 
     */
    private String value;

    /**
     * 
     */
    private String collecttime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}