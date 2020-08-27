public class Test8 {
    public static void main(String[] args) {
        char ch='J';
        char ch1=(char)(ch+32);
        System.out.println(ch1);
        char ch2 ='a';
        ch2 -=32;
        System.out.println(ch2);
        double d3=0.5;
        int i3=100;
        double sum3=d3+i3;
        double d4 =35.01;
        int i4 =10;
        int mul4 =(int)(i4*d4);
        System.out.println("sum3的值:"+sum3);
        System.out.println("sum3的整数部分:"+(int)sum3);
        System.out.println("mul4的整数部分:"+mul4);

    }
}
