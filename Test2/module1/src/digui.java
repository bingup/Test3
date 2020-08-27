public class digui {
    public static void main(String[] args) {
        int a = digui(5);
        System.out.println(a);
    }
    public  static int digui(int num){
        if(num ==1)
            return 1;
        return num*digui(num-1);
    }
}
