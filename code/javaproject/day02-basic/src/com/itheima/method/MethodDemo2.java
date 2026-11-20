package com.itheima.method;

public class MethodDemo2 {
    public static void main(String[] args) {
        printzb(6,7);
        printzb(5,9,6);
        printzb(6.9,5,2);
        printzb(3.1,6.3,21.0);
        System.out.println("---------------------------------");
        printqh(6,0);
        printqh(6,7);

    }

    public static void printzb(int x, int y) {
        System.out.println("坐标：" + x + "," + y );
    }
    public static void printzb(int x, int y, int z) {
        System.out.println("坐标：" + x + "," + y + "," + z);
    }
    public static void printzb(double x, int y, int z) {
        System.out.println("坐标：" + x + "," + y + "," + z);
    }
    public static void printzb(double x, double y, double z) {
        System.out.println("坐标：" + x + "," + y + "," + z);
    }
    public static void printqh(double a,double b){
        if(b==0){
            return;
        }
        System.out.println(a / b);
    }
}
