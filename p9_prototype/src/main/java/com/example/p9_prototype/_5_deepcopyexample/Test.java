package com.example.p9_prototype._5_deepcopyexample;


/**
 * @author wangzhichao
 * @date 2019/10/24
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Resume a = new Resume("大鸟");
        a.setPersionalInfo("男", "29");
        a.setWorkExperience("1998-2000", "XX 公司");
        Resume b = (Resume) a.clone();
        b.setPersionalInfo("女", "18");
        b.setWorkExperience("1998-2006", "YY 公司");

        Resume c = (Resume) a.clone();
        c.setWorkExperience("1998-2003", "ZZ 公司");

        a.display();
        b.display();
        c.display();
    }
}

/**
 * 运行结果：
 * 大鸟 男 29
 * 工作经历：1998-2000 XX 公司
 * 大鸟 女 18
 * 工作经历：1998-2006 YY 公司
 * 大鸟 男 29
 * 工作经历：1998-2003 ZZ 公司
 * <p>
 * 总结：
 * 1，为什么都是 ZZ 公司呢？
 * 这是因为目前对于 Resume 做的是浅复制，也就是说 Resume 的基本数据类型变量都会与原来的值一致，
 * 而引用数据类型变量仍会指向原来的值。
 * 对于 WorkExperience 这个变量只是引用指向的改变而已。
 */

/**
 * 总结：
 * 1，为什么都是 ZZ 公司呢？
 * 这是因为目前对于 Resume 做的是浅复制，也就是说 Resume 的基本数据类型变量都会与原来的值一致，
 * 而引用数据类型变量仍会指向原来的值。
 * 对于 WorkExperience 这个变量只是引用指向的改变而已。
 */
