package com.JavaException;


import javax.security.auth.login.LoginException;
import java.io.FileNotFoundException;

/*
* 异常
* 异常的根类是throwable 有两个子类
* java.lang.Error 与java.lang.Exception
* Error:无法通过处理的错误,只能事先避免
* Exception:异常产生后程序员可以通过代码的方式纠正,使得程序正常运行,是必须要处理的
* 常用方法: printStackTrace() 打印异常的详细信息
* Exception 的种类
* 编译时期异常
* 运行时期异常
*
* 异常的关键字
* try,catch,finally,throw,throws*/
public class Test01 {
    //throw 用在方法内,用来抛来一个异常对象,将这个异常对象传递到调用处,并结束当前方法的执行
    //throw new 异常类名(参数);
    private  static String[] names = {"bili","hill","jill"};

    public static void main(String[] args) {
//        throw  new NullPointerException("yao fangwen de arrshuzu bucunzai");
//        throw new ArrayIndexOutOfBoundsException("数组越界");
//        try {
//            read("1234");
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }

        //如果调用的方法有异常出现,则我们得处理异常
        //两种解决方法,1.该方法不处理,而是声明抛出
        //2.用trycatch语句块解决
        try {
            checkUsername("bil1i");
            System.out.println("sb");
        } catch (RegisterException e) {
            e.printStackTrace();
        }
    }

    //我们当前这个方法中有异常,有编译期异常
    public static void read(String path) throws FileNotFoundException {
        if(!path.equals("a.txt")){

            throw  new FileNotFoundException("no found");
        }
    }

    public static boolean checkUsername(String uname) throws RegisterException {
        for(String name :names){
                if(name.equals(uname)){
                    throw  new RegisterException("shagou");
                }
        }
        return true;
    }
}
