package org.example.main;/*
 * @author : zengkai
 * @email:598421227@qq.com
 * @desc:
 * @datetime:2021/12/13 10:42
 */

import org.example.utils.WebPage;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean a = true;

        while (a) {

            System.out.println("欢迎");
            System.out.println("1.登入");
            System.out.println("2.注册");
            System.out.println("3.修改");
            System.out.println("4.查看用户信息");
            System.out.println("0.退出");

            int n = scanner.nextInt();


            switch (n) {
                case 1:

                    break;
                case 2:

                    WebPage.registered();

                    break;

                case 3:

                    WebPage.mod();

                    break;
                case 4:

                    WebPage.ToView();

                    break;
                default:
                    a = false;

            }


        }

    }

}
