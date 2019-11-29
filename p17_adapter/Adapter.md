# 定义

适配器模式(Adapter), 是一种结构型模式, 将一个类的接口转换成客户希望的另一个接口. Adapter 模式使得原本由于接口不兼容而不能在一起工作的那些类可以一起工作.

# 结构图
这里讲的是对象适配器模式:
![](Adapter.png)

# 理解

系统的数据和行为都正确, 但接口不符时, 应该考虑用适配器.
在 GoF 的设计模式中, 对适配器模式讲了两种类型, 类适配器模式和对象适配器模式. 类适配器模式通过多重继承对一个接口与另一个接口进行匹配, 这是 Java 语言不支持的.