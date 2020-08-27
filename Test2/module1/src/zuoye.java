public class zuoye {
    public static void main(String[] args) {
//    int x=1;
//    for(System.out.println("a");x<=3; System.out.println("c")) {
//        System.out.println("B");
//        x++;

//        for (int i = 10; i <= 20; i++) {
//            if ((i  % 10) == 3) {
//                break;
//            }
//            System.out.println(i);
//        }

//
//        A:
//        for (int i = 0; i < 10; i++) {
//            B:
//            for (int j = 0; j < 3; j++) {
//                if (i == 5) {
//                    break;
//                }
//                System.out.println(i);
//            }
//        }
//        int a = 0;
//        if (1 == 1)
//            a = 10;

        int[] arr = {5, 6, 8, 1, 8, 9, 6, 4, 3, 2, 1, 110, 22};
        insertSort(arr);

    }

    public static int getSum(byte a, int b) {
        return a + b;
    }

    public static int getSum(short a, int b) {
        return a + b;
    }

    public static int getSum(char a, int b) {
        return a + b;
    }

    public static long getSum(int a, long b) {
        return a + b;
    }

    public static long getSum(long a, float b) {
        return (long) (a + b);
    }

    public static double getSum(long a, double b) {
        return (double) (a + b);
    }

    public static void sort1(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }

        for (int z : arr) {
            System.out.println(z);
        }
    }

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;

    }

    public static void selectSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int k = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[k]) {
                    k = j;
                }
            }
            if (i != k)
                swap(arr, i, k);
        }

        for (int z : arr) {
            System.out.print(z + " ");
        }
    }

    //插入排序
    public static void insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int k = i;
            while (i > 0 && arr[i - 1] > temp) {
                swap(arr, i - 1, k);
                i--;

            }
        }

        for (int z : arr) {
            System.out.print(z + " ");
        }
    }

}
