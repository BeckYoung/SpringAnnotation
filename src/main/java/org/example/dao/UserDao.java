package org.example.dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.example.domain.User;

import java.util.List;

public interface UserDao {
    @Insert("insert into t_user(id,name,age,email) values(#{id},#{name},#{age},#{email})")
    void add(User user);
    @Delete("delete from t_user where id = #{id}")
    void delete(Integer id);
    @Update("update t_user set name = #{name} , email = #{email} where id = #{id}")
    void update(User user);
    @Select("select * from t_user")
    List<User> findAll();
    @Select("select * from t_user where id = #{id}")
    User findById(Integer id);
}
