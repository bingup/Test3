import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ApiTest {
    /*api的使用
     * 先写一次，在敲一次，在记忆一次*/
    public static void main(String[] args) {
//        Scanner in =new Scanner(System.in);
//        int i = in.nextInt();
//        System.out.println(i);
//
//        Scanner in1 = new Scanner(System.in);
//        System.out.println("请输入一个整数哦~");
//        int i = in1.nextInt();
//
//        System.out.println("请输入一个整数哦~");
//        int j = in1.nextInt();
//
//        int sum =i+j;
//
//        System.out.println(sum);

        //创建要给新的随机数生成器
        //nextInt（int n） 返回一个伪数组，范围在0和指定值n之间的int值
//        Random r = new Random();
//
//        int x = 0;
//        while(x<30){
//            int number = r.nextInt(10);
//            System.out.print(number);
//            x++;
//        }

//        int n =5;
//         Random r = new Random();
//         int number = r.nextInt(n)+1;
//        System.out.println(number);
        //猜数字
//        Random r = new Random();
//        int num = r.nextInt(100) + 1;
//        int min = 1;
//        int max = 100;
//        while (true) {
//
//            System.out.println("请输入"+min+"---"+max+"的数字");
//            Scanner s = new Scanner(System.in);
//            System.out.println("数字");
//
//            int i = s.nextInt();
//
//            if (i > num) {
//                max = i;
//                System.out.println("数字大了");
//
//            } else if (i == num) {
//                System.out.println("成功");
//                break;
//            } else {
//                min = i;
//                System.out.println("数字小了");
//            }
//
//
//        }

        double d = 1.645666454;
        System.out.printf(String.format("%.4f", d));
        //ArrayList
//        ArrayList arr = new ArrayList();
//        ArrayList<Integer> arr1 =new ArrayList<>();
//
//        ArrayList<String>  arr2 = new ArrayList<>();
//
//        arr2.add("123");
//        arr2.add("1234");
//        arr2.add("455t");
//
//        System.out.println(arr2);
//
//        for(int i =0;i<arr2.size();i++){
//            System.out.println(arr2.get(i));
//
//        }

        //String() 创建一个空的字符串对象
        //String(String original) 根据字符串来创建一个字符串对象
        //String(char[] value) 通过字符数组来创建字符串对象
        //String（byte[] bytes) 通过字节数组来构造新的字符串对象
        //String（byte【】 bytes，int offer,int lenght)
        //通过字节数组的一部分啦构造新的字符串对象

        //
        String str1 = new String();

        String Str2 = new String("abc");

        char[] chs = {'a', 'b', 'c'};
        String str3 = new String(chs);

        byte[] bys = {97, 98, 99};
        String str4 = new String(bys);

        System.out.println(str4);

        String str5 = new String(bys, 1, 2);
        System.out.println(str5);

        String s1 = "abc";

//
//        String s1 ="asd";
//        String s2 ="asd";
//        String S3 = "ASD";
//        boolean b1 =s1.equals(s2);
//        boolean b2 = s1.equalsIgnoreCase(S3);
//        System.out.println("a"+b2+"b"+b1);
//
//        s1.length();
//        System.out.println(s1.concat(S3));
//        System.out.println(s1.charAt(2));
//        System.out.println(s1.indexOf("A"));
//        System.out.println(s1.substring(2));
//        System.out.println(s1.substring(1,3));

//        String str="你好,我叫张三,我的兴趣爱好是:打篮球";
//        String[] Strs = str.split(",");
//        for(int i=0;i<Strs.length;i++){
//            System.out.println(Strs[i]);
//        }

//        //统计字符个数
        Scanner s = new Scanner(System.in);
        System.out.println("请输入字符串:");
        String str = s.next();
        int a = 0;
        int b = 0;
        int c = 0;
        int d1 = 0;
        for (int i = 0; i < str.length(); i++) {
            char c1 = str.charAt(i);
            if (c1 >= 'A' && c1 <= 'Z') {
                a++;
            } else if (c1 >= '0' && c1 <= '9') {
                c++;
            } else if (c1 >= 'a' && c1 <= 'z') {
                b++;
            } else {
                d1++;
            }
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            System.out.println(d1);
//
        }
//        System.out.println(a+b+c);
//
//        //常量池 常量池在堆内存中，常量池的东西只会保存一份
//
//        //1 0  0  0 0
//        String s1 ="abc";
//        String s2 = "abc";
//        String s3 = new String ("abc");
//        String s4 = new String ("abc");
//        String s5 = new String(new byte[]{97,98,99});
//        String s6 = new String (new char[]{'a','b','c'});
//        System.out.println(s1==s2);
//        System.out.println(s1==s3);
//        System.out.println(s1==s4);
//        System.out.println(s1==s5);
//        System.out.println(s1==s6);
//        System.out.println(s1==s3);

        //类变量 当static修饰成员变量时，该变量称为类变量，该类的
        //每个对象都共享同一个类变量的值，任何对象都可以更改该类变量的值
        //但也可以在创建该类对象的情况下对该类变量进行操作
        //··类变量:使用static关键字修饰的成员变量

        //静态方法的注意事项
        //静态方法中可以直接访问类变量和静态方法
        //静态方法不能直接访问普通成员变量或成员方法
        //静态方法中， 不能使用this关键字

        //Arrays 工具类的使用
//        int[] arr = {122,344,2,2,2,2};
//        String str = Arrays.toString(arr);
//        System.out.println(str);
//
//        Arrays.sort(arr);
//
//        System.out.println(Arrays.toString(arr));
//        //将一个随机字符串中的所有字符升序拍
//        String str1="asdzxckfapojzcvl;k";
//        char[] chs = str1.toCharArray();
//        Arrays.sort(chs);
//
//        for(int i=chs.length-1;i>=0;i--){
//            System.out.print(chs[i]);
//        }

//        double i = Math.abs(-5);
//        //返回绝对值。
//        double q1 = Math.ceil(3.3); //4
//        //向上取整
//        double q2 = Math.ceil(-3.3);//-3.0
//        double q3 = Math.ceil(5.1);//6
//
//        //floor  向下取整
//        double w1 = Math.floor(3.6); //3.0
//        double w2 = Math.floor(-3.3);//-4
//        double w3 = Math.floor(3.3);//3
//
//        //round +0.5后向下取整
//        double e1 = Math.round(3.3); //3.0
//        double e2 = Math.round(3.5);// 4.0
//
        //计算在-10.8到5.9之间，绝对值大于6或者小于2.1的整数有多少
//        double max = Math.ceil(5.9);
//        double min = Math.ceil(-10.8); //-11
//        int count =0;
//        for(;min<max;min++){
//            if(Math.abs(min)>6 || Math.abs(min)<2.1){
//                count++;
//            }
//        }
//        System.out.println(count);

        double min=-10.8;
         double max=5.9;
        int count11=0;
        for(double i=Math.ceil(min);i<Math.ceil(max);i++){
            if(Math.abs(i)>6 || Math.abs(i)<2.1){

                count11++;
                }
                }
        System.out.println(count11);

    }
}
