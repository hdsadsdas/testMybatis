package org.example;/*
 * @author : zengkai
 * @email:598421227@qq.com
 * @desc:
 * @datetime:2021/12/9 9:41
 */

import org.apache.ibatis.session.SqlSession;
import org.example.dao.UserDao;
import org.example.domain.User;
import org.example.utils.MyBatisUtils;
import org.junit.Test;

import java.util.List;

public class MyTest {

    @Test
    public void TestCheck(){

        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        UserDao dao = sqlSession.getMapper(UserDao.class);

        List<User> users = dao.check();

        for (User user : users){

            System.out.println("用户有="+user);

        }

        sqlSession.close();

    }

    @Test
    public void TestIncrease(){

        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        UserDao dao = sqlSession.getMapper(UserDao.class);

        User user = new User();
        user.setUsername("aaa");
        user.setPassword("bbb");

        int i = dao.increase(user);

        sqlSession.commit();

        if (i == 0){
            System.out.println("失败");
        }else {

            System.out.println("成功");

        }

        sqlSession.close();

    }

    @Test
    public void TestChange(){

        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        UserDao dao = sqlSession.getMapper(UserDao.class);

        User user = new User();
        user.setUsername("aaa");
        user.setPassword("ccc");

        int i = dao.change(user);

        sqlSession.commit();

        if (i == 0){
            System.out.println("失败");
        }else {

            System.out.println("成功");

        }

        sqlSession.close();

    }

    @Test
    public void TestDelete(){

        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        UserDao dao = sqlSession.getMapper(UserDao.class);

        User user = new User();
        user.setUsername("aaa");
        user.setPassword("ccc");

        int i = dao.delete(user);

        sqlSession.commit();

        if (i == 0){
            System.out.println("失败");
        }else {

            System.out.println("成功");

        }

        sqlSession.close();

    }

}
