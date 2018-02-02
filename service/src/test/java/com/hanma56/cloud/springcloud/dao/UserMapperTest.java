package com.hanma56.cloud.springcloud.dao;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hanma56.cloud.springcloud.SpringCloudApplication;
import com.hanma56.cloud.springcloud.model.User;

/**
 * @author 张钟
 * @date 2018/2/2
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void test() {
        User user = new User();
        user.setAge(1);
        user.setCreated(new Date());
        user.setUserName("姓名");
        int insertResult = userMapper.insert(user);
        System.out.println(insertResult);
    }

}
