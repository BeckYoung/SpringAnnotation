package org.example.service;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.example.domain.User;

import java.util.List;

public interface UserService {
    void add(User user);
    void delete(Integer id);
    void update(User user);
    List<User> findAll();
    User findById(Integer id);
}
