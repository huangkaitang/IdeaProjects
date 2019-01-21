package com.example.demo.entity;

import lombok.Data;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

@Data
@Entity(value = "TestRecord" ,noClassnameStored = true)
public class TestRecord {
    @Id
    private String id;
    /**
     * 测试id
     */
    private String testId;
    /**
     * 测试内容
     */
    private String testDesc;

    /**
     * 会议创建时间
     */
    private Long createTime;

    /**
     * 会议更新时间
     */
    private Long updateTime;
}

