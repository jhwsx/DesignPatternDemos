# 1. 定义

迪米特法则（Law of Demeter，LoD），也叫最少知识原则（Least Knowledge Principle, LKP）。如果两个类不必彼此直接通信，那么这两个类就不
应当发生直接的相互作用。如果其中一个类需要调用另一个类的某一个方法的话，可以通过
第三者转发这个调用。

# 2. 要点

- 迪米特法则首先强调前提是在类的结构设计上，每一个类都应当尽量降低成员的访问权限。
- 迪米特法则的根本思想是强调了类之间的松耦合。类之间的耦合越弱，越有利于复用，一个
处在弱耦合的类被修改，不会对有关系的类造成波及。
- 迪米特法则还有一个英文解释是：talk only to your immediate friends（只和直接的朋友交流）。
什么是朋友呢？每个对象都必然会与其他的对象有耦合关系，两个对象之间的耦合就会成为朋友关系。那么
什么又是直接的朋友呢？出现在成员变量、方法的输入输出参数中的类就是直接的朋友。迪米特法则要求只和直接的朋友通信。


# 3. 参考

https://www.cnblogs.com/xiaobai1226/p/8670245.html