package com.example.p12_facade._3_theory;

/**
 * @author wangzhichao
 * @date 2019/10/27
 */
public class Facade {
    private SubSystemOne subSystemOne;
    private SubSystemTwo subSystemTwo;
    private SubSystemThree subSystemThree;
    private SubSystemFour subSystemFour;

    public Facade() {
        subSystemOne = new SubSystemOne();
        subSystemTwo = new SubSystemTwo();
        subSystemThree = new SubSystemThree();
        subSystemFour = new SubSystemFour();
    }

    public void methodA() {
        System.out.println("方法组A");
        subSystemOne.methodOne();
        subSystemTwo.methodTwo();
   }

   public void methodB() {
       System.out.println("方法组B");
       subSystemThree.methodThree();
       subSystemFour.methodFour();
   }
}
