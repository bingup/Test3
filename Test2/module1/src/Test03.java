public class Test03 {

    //数组
    public static void main(String[] args) {
        //数组的定义
        int[] arr = new int[3];
        int[] arr1 = new int[]{1, 2, 3};
        int[] arr2 = {1, 2, 30};

        System.out.println(arr2);
        System.out.println(arr2.length);
        reserve(arr2);
    }

    //数组获取最大值
    public static int getMax(int[] a) {
        int max = a[0];
        int length = a.length;
        for (int i = 0; i < length; i++) {
            if (a[i] > max)
                max = a[i];
        }
        return max;
    }

    //数组反转
    public static void reserve(int[] a) {
        int left = 0;
        int temp = 0;
        int right = a.length - 1;
        for (; left <= right; left++, right--) {
            temp = a[left];
            a[left] = a[right];
            a[right] = temp;
        }

    }


}
