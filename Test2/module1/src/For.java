
public class For {
    public static void main(String[] args) {
//            //for循环实现5*8的矩形
//        for(int i =0;i<5;i++){
//            for (int j=0;j<8;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }


        for(int i=0;i<7;i++){
            for(int j=0;j<7;j++){
                if(i==j || i+j ==6){
                    System.out.print("0");
                }else {
                    System.out.print("*");
                }

            }
            System.out.print('\n');
        }
    }


}
