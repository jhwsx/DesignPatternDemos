# 组合/聚合复用原则

## 定义

组合/聚合复用原则（Composition/Aggregation Reuse Principle - CARP），尽量使用组合/聚合，尽量不要使用类继承。

## 理解组合、聚合
聚合是一种弱的“拥有”关系，体现的是 A 对象包含 B 对象，但 B 对象不是 A 对象的一部分；
组合是一种强的“拥有”关系，体现的是严格的部分和整体的关系，部分和整体的生命周期是一样的。
举个例子来说，大雁和它的两个翅膀就是组合关系；大雁和雁群是聚合关系。

## 优点
优先使用对象的组合/聚合将有助于你保持每个类被封装，并集中在单个任务上。这样类和类继承层次会保持较小规模，并且不太可能增长为不可控制的庞然大物。