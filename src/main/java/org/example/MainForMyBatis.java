package org.example;

import org.example.config.SpringConfig;
import org.example.domain.User;
import org.example.service.BookService;
import org.example.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 使用Spring+MyBatis整合，对mysql数据库进行操作
 */
public class MainForMyBatis {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = context.getBean(UserService.class);
        User user = userService.findById(1);
        System.out.println(user);

//        BookService bookService = context.getBean(BookService.class);
//        bookService.save(); // 集成MyBatis后会报错
    }
}
