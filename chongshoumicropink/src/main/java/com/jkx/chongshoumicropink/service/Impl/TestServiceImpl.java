package com.jkx.chongshoumicropink.service.Impl;

import com.jkx.chongshoumicropink.entity.Test;
import com.jkx.chongshoumicropink.mapper.TestMapper;
import com.jkx.chongshoumicropink.service.ITestService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @auther wangpeng
 * @create 2022-03-30
 * @describe 服务实现类
 */
@Service
public class TestServiceImpl extends ServiceImpl<TestMapper, Test> implements ITestService {

}
