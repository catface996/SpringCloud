package com.hanma56.cloud.springcloud.service.impl;

import com.hanma56.cloud.springcloud.model.User;
import com.hanma56.cloud.springcloud.dao.UserMapper;
import com.hanma56.cloud.springcloud.service.UserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 简一带你飞
 * @since 2018-02-02
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
