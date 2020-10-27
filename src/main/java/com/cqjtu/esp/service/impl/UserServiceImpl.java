package com.cqjtu.esp.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cqjtu.esp.entity.User;
import com.cqjtu.esp.mapper.UserMapper;
import com.cqjtu.esp.service.UserService;
import org.springframework.stereotype.Service;

/**
 * 用户表 服务实现类
 *
 * @author suwen
 * @since 2020-10-27
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {}
