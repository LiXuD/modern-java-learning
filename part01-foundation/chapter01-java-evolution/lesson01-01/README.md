# 1.1 Java SE、JDK、JRE、JVM 的关系

| 元数据 | 内容 |
| --- | --- |
| 课程 | 第 01 章 Java 技术演进，第 1.1 节 |
| 优先级 | P0 |
| 建议时间 | 45～60 分钟 |
| 涉及版本 | JDK 8、9、11、25；Class 文件索引扩展至 27 |
| 核心 JEP | 220、282 |
| 状态 | 已讲授、已归档，实验与知识验收待用户确认 |

## 学习目标

理解 Java SE 与具体 JDK 的关系、JVM 规范与实现、JDK 8 和现代 JDK 的运行时结构差异、Oracle JRE 分发变化、字节码兼容性、跨平台条件和 jlink 定制运行时。

## 学习顺序
1. [完整理论讲义](theory.md)：概念、底层机制、目录结构、新旧对照、部署场景、误区。
2. [动手实验](experiments.md)：环境属性、核心类资源位置、jlink、字节码对照。
3. [JavaEnvironment.java](examples/JavaEnvironment.java)、[RuntimeStructure.java](examples/RuntimeStructure.java)、[Hello.java](examples/Hello.java)。
4. [课后练习](exercises.md)：8 道选择题、3 道思考题。
5. [参考答案](solutions.md)：独立完成练习后阅读。
6. [官方资料及核验说明](references.md)。

## 验收
- [ ] 能解释四个核心概念与 HotSpot。
- [ ] 理解 JDK 8、9、11、25 的结构和分发差异。
- [ ] 理解字节码兼容性与跨平台机制。
- [ ] 完成环境检查和运行时结构实验。
- [ ] 理解 jlink；现代 JDK 环境就绪后完成定制运行时实验。
- [ ] 选择题至少 7/8 正确（87.5 分，达到 80 分门槛）。
- [ ] 独立完成三道思考题。

本节可先用 JDK 8 完成前两个实验；第 02 章统一搭建多版本环境。验收记录以 [学习进度](../../../docs/01-learning-progress.md) 为准。下一节：1.2 Oracle JDK 与 OpenJDK。
