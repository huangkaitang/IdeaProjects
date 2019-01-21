package com.example.demo.Controller;

import com.example.demo.dao.TestDao;
import com.example.demo.entity.TestRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test")
public class TestController {
    @Autowired
    private TestDao testDao;
    @RequestMapping(value = "/sayHello/{id}")
    public String sayHello(@PathVariable String id){

        return id;
    }
    @RequestMapping(value = "/save/{id}")
    public TestRecord save(@PathVariable String id){
        TestRecord testRecord = new TestRecord();
        testRecord.setId(id);
        testRecord.setTestId("testId"+id);
        testRecord.setTestDesc("testDesc"+id);;
        testRecord.setTestDesc("testDesc"+"a");;
        testRecord.setTestDesc("testDesc"+"b");;
        testRecord.setTestDesc("分支最后的代码");;
        testRecord.setTestDesc("分支最后的代码");;
        testRecord.setTestDesc("分支最后的代码");;
        testRecord.setTestDesc("分支最后的代码");;
        return testDao.save(testRecord);
    }





}
