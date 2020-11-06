package com.li.community;

import com.li.community.entity.User;
import com.li.community.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
public class EmailTest {
    @Autowired
    private UserService userService;
    @Test
    public void Test() {
        List<User> myEmail = userService.findMyEmail("1559593896@qq.com");

        System.out.println(myEmail);

    }

}
