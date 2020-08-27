public class Test04 {
    /*
     * 类和对象
     * 类：是一组相关属性和行为的集合，可以看成是一类事物的模板，使用
     * 事物的属性特征和行为特征来描述事物
     * 例子：猫  属性：名字，体重 行为：走，跑
     * 对象：是一类事物的具体体现，对象是类的一个实例，必然具备该类事物的属性和行为
     * 离职: 猫a 属性:tom,5kg 行为:跳着走，直着跑
     * 类和对象的关系
     * 类是对一类事物的描述，是抽象的
     * 对象是一类事物的实例，是具体的
     * 类的成员变量，成员方法
     * 成员变量会有默认值
     * 整数（byte，short，int，long）  0
     * 浮点数（float ，double ） 0.0
     * 字符（char) '\0000'
     * 布尔（boolean） false
     * 数组，对象  null
     *
     * 成员变量和局部变量的区别
     * 在类中的位置不同 重点
     * 成员变量:类中，方法外， 局部变量：方法中或方法声明上
     * 作用范围不一样 重点
     * 成员变量：类中 局部变量：方法中
     * 初始化值的不同 重点
     * 成员变量 ：有默认值 局部变量：没有默认值，必须先定义，赋值，最后使用
     * 在内存位置的不同 成员变量，堆内存， 局部变量，栈内存
     * 声明周期的不同 成员变量 随着对象的创建 局部变量 随着方法的创建*/

    //this的含义谁在调用，this就代表谁
    //方法被哪个对象调用，方法中的this就代表那个对象
    public static void main(String[] args) {
//    Student s1 =new Student();
//    s1.age=1;
//    s1.eat();
//    System.out.println(s1.age);
//    phone p =new phone();
//    p.brand = "huawei";
//    p.price = 123;
//    p.color = "black";
//    System.out.println(p.brand);
//    System.out.println(p.price);
//    System.out.println(p.color);
//    p.call("nikma");
//    p.sendMessage();
//
//        int week = 1;
//        if (week == 1) {
//            System.out.println("星期一");
//        } else if (week == 2) {
//            System.out.println("星期二");
//        } else if (week == 3) {
//            System.out.println("星期三");
//        } else if (week == 4) {
//            System.out.println("星期四");
//        } else if (week == 5) {
//            System.out.println("星期五");
//        } else if (week == 6) {
//            System.out.println("星期六");
//        } else if (week == 7) {
//            System.out.println("星期日");
//        }else{
//            System.out.println("输入不对");
//        }

        int week = 3;
        switch (week){
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            case 4:
                System.out.println("4");
            case 5:
                System.out.println("5");
                break;
            case 6:
                System.out.println("6");
                break;
            default:
                System.out.println('d');
                break;
        }
    }
}
