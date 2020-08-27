package com.com.day14.test21;

public class Test21 {
    public static void main(String[] args) throws Exception {
        testTryCatch();
        testThrows();
    }

    public static char charAt(String str, int index) throws Exception {
        char[] chs = str.toCharArray();
        if (str == null) {
            throw new Exception("字符串不能为null哦~");
        }
        if (str == "") {
            throw new Exception("字符串不能为空哦");
        }
        if (str.length() < 0 && str.length() > str.length() - 1) {
            throw  new Exception("索引越界");
        }else {
            return  chs[index];
        }


    }

    public static  void testThrows ()  throws Exception{
        charAt("",3);
    }

    public static void testTryCatch(){
        try {
            charAt("",3);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
