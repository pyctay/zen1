package com.zen.controller;


import com.zen.entity.Test;
import com.zen.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author wangyaodong
 * @since 2019-05-25
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private ITestService testService;

    @GetMapping(value = "/test")
    public Test test() {
        return testService.selectById(1);
    }
}
