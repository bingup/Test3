public class Test7 {
    public static void main(String[] args) {

        add(100,200);
        sub(0,100);
        mul(100,200);
        div(0,100);
        remain(100,200);


    }

    public static void add(int a, int b) {
        int add = a + b;
        System.out.println("x,y的和为:" + add);
    }

    public static void sub(int a, int b) {
        int sub = a - b;
        System.out.println("x,y的差为:" + sub);
    }

    public static void mul(int a, int b) {
        int mul = a * b;
        System.out.println("x,y的积为:" + mul);
    }

    public static void div(int a, int b) {
        int div = a / b;
        System.out.println("x,y的商为:" + div);
    }

    public static void remain(int a, int b) {
        int remain = a % b;
        System.out.println("x,y的余数为:"+remain);
    }

}
