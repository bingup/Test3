public class Test01 {

    public static void main(String[] args) {
        //标识符
        //命名规则 英文字母，数字， 美元符号和下划线
        //标识符不能以数字开头
        //标识符不能是关键字
        //区分大小写
//        //psvm main方法的快捷键 sout printf方法的快捷键psvmpsvmpsvmpsvmpsvmpsvmpsvmpsvm
//        //int a = 5;
//        //int b = 3;
//        System.out.println(a + b);
//        System.out.println(a - b);
//        System.out.println(a*b);
//        System.out.println(a/b);
//        //取余结果符号与左边符号相同
//        System.out.println(5%3);
//        System.out.println(-5%3);
//        System.out.println(5%-3);
//        System.out.println(-5%-3);
//        // ++a和a++的区别
//        //int c = a++;
//        //int d = ++a;
//        //a++ 是先赋值后++
//        //++a  是先++后赋值  这是混合运算时会出现的现象
//        System.out.println(c);
//        System.out.println(a);
//
//        //自增自减面试题
//        int a = 10;
//        int b = 10;
//        int c = 10;
//        a = b++; // a=b; b=11
//
//        c = --a; // a= 9 c =9;
//        b = ++a;  // a =10 b =10
//        a = c--;    // a =c =9  c =8
//        //a=9 c=8 b =10
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//        //+号在字符串中的作用
//        //表示拼接，连接的作用
//        System.out.println("abcd" + 5 + 5);
//        System.out.println("abcd" + (5 + 5));
//        System.out.println(5 + 5 + "abcd");
//        System.out.println("1+1 =" + 1 + 1);
//
//
//        //赋值运算符
//        //就是将符号右边的值，给左边的变量
//        int i = 3;
//        i = i + 3;
//        //i +=3;
//        i -= 5;//i=i-5;
//        byte b1 = 1;
        //逻辑运算符 & | ^ ! && ||
        //  0 & 1 ,0&0 为false 1&1为true
        // 0|1 ，1|0，1|1 为true ，0|0为false
        // 1^0,0^1 为true 1^1 .0^0 为false
        // !false =true  !true =false
        //  && 只要左边的一个为false，右边的就不运行了
        // || 只要左边的一个为true。右边的就不运行了

        //三元运算符
        //判断两个数是否相等
        //获取两个数的较大值 a>b?a:b;

        //方法的定义
        //定义格式 修饰符  public private  defailt
        // 返回值类型 int 。。。
        //方法名 （参数列表）{ 代码  }
//        //methidName();
//        int  a,b,c;
//        int num = 123;
//          a= num /100%10;
//          b = num  /10%10;
//          c=num %10;
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//        int  x =-1;
//        int y =0;
//        if( x>=3){
//            y=1;
//        }else if(-1 <=x&& x<3){
//            y=2*x;
//        }else if (x<=-1){
//            y=2*x-1;
//        }
//        System.out.println(y);

//        int i = 5;
//         switch (i){
//             case 0:
//                 System.out.println("213");
//                 break;
//             case 5:
//                 System.out.println("nimab");
//             case 10:
//                 System.out.println("1234");
//                 default:
//                     System.out.println("11");
//                     System.out.println("11");
//                     System.out.println("11");
//                     System.out.println("11");
//                     System.out.println("11");
//                     System.out.println("11");
//                     System.out.println("11");
//         }

//        for (int i = 97; i < 123; i++) {
//            System.out.println((char) i);
//
//        }
//
//        int sum = 0;
//        for(int i=1;i<6;i++){
//            sum += i;
//        }
//        System.out.println(sum);
//
//        int sum =0;
//        for(int i=1;i<=100;i++){
//            if(i%2==0){
//                sum +=i;
//            }
//        }
//        System.out.println(sum);
//        int i =1;
//        do{
//            System.out.println("a");
//            i++;
//        }while(i<=10);

//        for (int  x=1; x<=10; x++){
//            if(x%3 == 0){
//                    continue;
//            }
//            System.out.println("我爱林青霞");
//        }
//
//        long i =Integer.MAX_VALUE+1;
//        System.out.println(i);
//
//        byte[] bytes={97,98,99,100,101};
//        String str4 = new String(bytes);
////        System.out.println(str4);
//        char a ='A';
//        System.out.println(a+0);
//
//        int a=1;
//        a=a++;
//        System.out.println(a);//a=1 a+1

        short s = 10;
        s = (short) (s + 10);
        s += 2;
        int j = 5;
        j += 5;
        j -= 5;
        j /= 5;
        j *= 5;


    }


    public boolean falg1(int a, int b) {
        return a == b ? true : false;
    }

    public static void methidName() {
        System.out.println("这是一个方法");
    }

    public static void operator2() {
        int i = 50;
        int j = 60;
        int m = i > j ? i : j;
        System.out.println(m);
    }

    public static void operator23() {
        int i = 50;
        int j = 60;
        int a = 70;
        int m = i > j ? i : j;
        int m1 = m > a ? m : a;
        System.out.println(m1);
    }


}
//  继承???   群主有个money