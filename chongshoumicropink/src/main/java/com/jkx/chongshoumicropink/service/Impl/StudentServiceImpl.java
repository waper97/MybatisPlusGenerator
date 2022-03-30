package com.jkx.chongshoumicropink.service.Impl;

import com.jkx.chongshoumicropink.entity.Student;
import com.jkx.chongshoumicropink.mapper.StudentMapper;
import com.jkx.chongshoumicropink.service.IStudentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @auther wangpeng
 * @create 2022-03-30
 * @describe 学生表服务实现类
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements IStudentService {

}
