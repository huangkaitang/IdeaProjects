package com.example.demo.dao;

import com.example.demo.entity.TestRecord;
import org.mongodb.morphia.AdvancedDatastore;
import org.mongodb.morphia.Key;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public class TestDao {
    @Resource(name = "dsForRW")
    private AdvancedDatastore dsForRW;

    public TestRecord save(TestRecord testRecord){
        Key<TestRecord> saveReult = dsForRW.save(testRecord);
        System.out.println(saveReult);
        return testRecord;
    }


}
