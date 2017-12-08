package com.itheima.test;

public class Test01 {

    public static void main(String[] args) {
        //从GitHub下载
        // TODO Auto-generated method stub
        System.out.println(new Test01().test());;
    }

    static int test()
    {
        int x = 1;
        try
        {
            return x;
        }
        finally
        {
            ++x;
            return 2;
        }
    }
}
