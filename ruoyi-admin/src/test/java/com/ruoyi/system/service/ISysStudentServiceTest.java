package com.ruoyi.system.service;

import com.ruoyi.system.domain.SysStudent;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ISysStudentServiceTest {
    @Autowired
    private ISysStudentService iSysStudentService;

    @Test
    void queryList() {
        SysStudent domain = new SysStudent();
        domain.setStudentAge(10);
        List<SysStudent> sysStudents = iSysStudentService.queryList(domain);
        System.out.println(sysStudents);
    }
}