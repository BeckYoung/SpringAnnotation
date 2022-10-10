package org.example.service.impl;

import org.example.dao.BookDao;
import org.example.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class BookServiceImpl implements BookService {
    //@Autowired // spring IOC容器提供，与Spring框架强依赖，不推荐使用
    @Resource // java规范表示
    private BookDao bookDao;

    @Override
    public void save() {
        System.out.println("BookServiceImpl save...");
        bookDao.save();
    }
}
