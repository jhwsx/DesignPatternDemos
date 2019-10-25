## 定义

原型模式（Prototype），用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象。
是一种创建型模式。

# 优点
隐藏了对象创建的细节，对性能有提升；
不用重新初始化对象，而是动态地获得对象运行时的状态。

# 补充学习

浅拷贝和深拷贝：区别在于对于引用数据类型的处理。
- 对基本数据类型进行值传递，对引用数据类型进行引用传递的拷贝，称为浅拷贝；
- 对基本数据类型进行值传递，对引用数据类型，创建一个新的对象，并复制其内容，称为深拷贝。