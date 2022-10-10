package org.example;

import org.example.config.SpringConfig;
import org.example.domain.User;
import org.example.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class UserServiceTest {
    @Resource
    private UserService userService;

    @Test
    public void testFindAll() {
        System.out.println(userService.findAll());
    }

    @Test
    public void testAddUser() {
        User user = new User();
        user.setId(6);
        user.setAge(20);
        user.setName("xhp");
        user.setEmail("158****162@qq.com");
        userService.add(user);
    }
}
