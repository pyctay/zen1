package com.zen.service.impl;

import com.zen.entity.Test;
import com.zen.dao.TestMapper;
import com.zen.service.ITestService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wangyaodong
 * @since 2019-05-25
 */
@Service
public class TestServiceImpl extends ServiceImpl<TestMapper, Test> implements ITestService {

}
