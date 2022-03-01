package org.example.utils;/*
 * @author : zengkai
 * @email:598421227@qq.com
 * @desc:
 * @datetime:2021/12/13 10:41
 */

import org.apache.ibatis.session.SqlSession;
import org.example.dao.UserDao;
import org.example.domain.User;

import java.util.List;
import java.util.Scanner;

public class WebPage {

    static Scanner scanner = new Scanner(System.in);
    static SqlSession sqlSession = MyBatisUtils.getSqlSession();
    static UserDao dao = sqlSession.getMapper(UserDao.class);
    static User user = new User();

    public static void login() {

        registered();
        String name = scanner.next();
        String pass = scanner.next();

        user.setUsername(name);
        user.setPassword(pass);

        User user = dao.checkOne(WebPage.user);


    }


    public static void registered() {

        String name = scanner.next();
        String pass = scanner.next();
        user.setUsername(name);
        user.setPassword(pass);

        int i1 = dao.increase(user);
        if (i1 != 0) {
            System.out.println("成功");
        } else {
            System.out.println("失败");
        }

    }

    public static void mod() {
        //用户输入的
        String name = scanner.next();
        String pass = scanner.next();

        user.setUsername(name);
        user.setPassword(pass);

        int i2 = dao.change(user);
        if (i2 != 0) {
            System.out.println("成功");
        } else {
            System.out.println("失败");
        }
    }

    public static void ToView() {
        List<User> users = dao.check();
        for (User us : users) {
            System.out.println("用户有=" + us);
        }
    }


}
