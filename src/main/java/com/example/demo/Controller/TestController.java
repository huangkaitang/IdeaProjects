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
        testRecord.setTestDesc("主干最后的代码");;
        testRecord.setTestDesc("分支准备睡觉的代码");;
        testRecord.setTestDesc("1月22号01");;
        testRecord.setTestDesc("1月22号02");
        testRecord.setTestDesc("1月22号主干03");
        testRecord.setTestDesc("1月23号主干04");
        testRecord.setTestDesc("2月17号主干01");
        testRecord.setTestDesc("2月17号分支02");
        testRecord.setTestDesc("4月8号的111");
        testRecord.setTestDesc("4月8号的222");
        testRecord.setTestDesc("4月8号的333");
        return testDao.save(testRecord);
    }





}
