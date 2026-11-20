package com.itheima.method;

import java.util.Random;

public class MethodDemo {
    public static void main(String[] args) {
        System.out.println("求和："+sum(6, 7));
        System.out.println("------------------------");
        System.out.println("求和" + sum(9, 10));
        System.out.println("------------------------");
        System.out.println("生成4位验证码：" + code(4));
        System.out.println("生成6位验证码：" + code(6));
    }
    public static int sum(int a,int b){
        return a+b;
    }

    public static void pritlHelloWorld(){
        System.out.println("你好世界！");
        System.out.println("你好世界！");
        System.out.println("你好世界！");
    }


    public static String code(int a) {
        String code="";
        for(int i=0;i<a;i++){
            int num =(int)(Math.random()*10);
            code+=num;
        }
return code;
    }
}
