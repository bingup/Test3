package com.com.day14.Test23;

public class Son extends Father {
    //验证：重写方法不能抛出与父类平级的其他异常
    @Override
    public void eat() throws ToothPainException {
        //验证：重写方法不能抛出与父类平级的其他异常
//        throw new TonguePainException("");
        //重写不能抛出比父类高级的异常
//        throw new PainException("");
        //重写可以抛出和父类相同的异常
//        throw  new ToothPainException();
        //重写可以抛出父类抛出异常的子类异常
//        throw new BigToothPainException();
        //重写方法可以抛出多个"父类抛出异常的子类异常"

//        throw new BigToothPainException();
//        throw  new FrontToothPainException("123");



    }
    //父类不抛出异常，子类也不能抛出异常


    @Override
    public void drink() {
//        throw new ToothPainException();
//        throw new BigToothPainException();
//        throw new FrontToothPainException();

        //如果子类内部抛出了异常，只能自己处理，不允许向外抛
        System.out.println("喝到了100度的水");
        try {
            throw new TonguePainException("舌头疼！！！！！");
        } catch (TonguePainException e) {
            e.printStackTrace();
        }
    }
}
