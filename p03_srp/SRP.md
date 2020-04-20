# SRP(Single Responsiblility Principle)

## 定义

单一职责原则，就一个类而言，应该**仅有一个**引起它变化的原因。

如果一个类承担的职责过多，就等于把这些职责耦合在一起，一个职责的变化可能会削弱或者抑制这个类其他职责的能力。这种耦合会导致脆弱的设计，当变化发生时，设计会遭受到意想不到的破坏。

## 好处

+ 降低类的复杂度；
+ 提高类的可读性，提高系统的可维护性；
+ 降低变更引起的风险（降低对其他功能的影响）。

## 注意

+ 单一职责最难划分的是职责；
+ 单一职责原则提出标准：用职责和变化原因来衡量接口或类设计的是否优良，但是职责和变化原因都是不可度量的，因项目、环境而异；
+ 接口一定要做到单一职责，类的设计尽量做到只有一个原因引起变化。