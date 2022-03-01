package org.example.dao;/*
 * @author : zengkai
 * @email:598421227@qq.com
 * @desc:
 * @datetime:2021/12/9 9:29
 */

import org.example.domain.User;

import java.util.List;

public interface UserDao {

    //查一条数据
    User checkOne(User user);

    //查
    List<User> check();
    //增
    int increase(User user);
    //删
    int delete(User user);
    //改
    int change(User user);

}
