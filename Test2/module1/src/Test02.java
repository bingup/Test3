public class Test02 {

    public static void main(String[] args) {
        //方法全部代码编写

    }

    public static int getSum(int a, int b) {
        int c = a + b;
        return c;
    }

    //调用方法的三种形式
    public static void print() {
        System.out.println("方法被调用");

    }

    public static int getSum1(int a, int b) {
        return a + b;
    }

    //定义比较两个整数是否相同的方法
    public static boolean compare(int a, int b) {
        if (a == b) {
            return true;
        } else {
            return false;
        }
    }

    /*
     * 定义计算1~100的求和方法
     * 返回值类型，计算结果整数int
     * 参数：没有不确定数值*/
    public static int getSum100() {
        int sum = 0;
         for(int i=1;i<100;i++){
             sum +=i;

        }
        return sum;
    }
    /*实现不定次数打印heelworld*/
    public static void print1(int n){
        for(int i=0;i<n;i++){
            System.out.println("你好");
        }
    }

    //定义方法的注意事项，
    //定义位置，类中方法外面，调用方法时写错方法名字，调用方法时写错了参数列表
    //一个类中不能由两个一摸一样的方法，返回值类型，必须和return语句返回的类型相同
    //否则编译失败
}
