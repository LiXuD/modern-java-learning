# 课程教学与准确性规范

## 定位
面向已有 JDK 8 工作经验的开发人员，采用增量学习、新旧对照与技术专题方式。不重复基础知识；必要时补充先修概念。主要环境 JDK 25 LTS，JDK 8 为基线，其他版本按实验需求引入。

## 每节课程统一模板
1. 元数据：课程编号、学习目标、版本、JEP、特性状态、优先级、建议时间。
2. 技术背景：旧方案的问题和设计目标。
3. JDK 8 方案及适用边界。
4. 现代 Java 方案：可运行代码、语法和 API。
5. 新旧对比：可读性、维护性、资源成本等。
6. 底层原理：区分 Java 规范与具体 JVM/JDK 实现。
7. 真实应用场景及技术选型。
8. 常见误区、兼容性和异常处理。
9. 动手实验：环境、命令、预期结果和实测状态。
10. 练习：基础、进阶、场景设计及独立参考答案。
11. 知识验收清单。
12. 官方参考资料与核验说明。

## 优先级及状态
P0 必须掌握并独立应用；P1 理解原理并能按场景使用；P2 了解方向和用途。特性状态区分 Permanent、Preview、Incubator、Experimental、Deprecated、Removed。分别记录首次出现、正式发布、废弃和移除版本。预览 API 示例必须明确对应版本，不得混用。

## 官方来源及核验
- OpenJDK JEP：https://openjdk.org/jeps/0
- Java 语言及 JVM 规范：https://docs.oracle.com/javase/specs/
- Java 25 API：https://docs.oracle.com/en/java/javase/25/docs/api/index.html
- Java 25 语言变化：https://docs.oracle.com/en/java/javase/25/language/java-language-changes-summary.html
- Java 25 迁移指南：https://docs.oracle.com/en/java/javase/25/migrate/index.html
- Oracle 支持路线图：https://www.oracle.com/java/technologies/java-se-support-roadmap.html
- Dev.java：https://dev.java/learn/
- Inside Java：https://inside.java/

逐节核对 JEP、Release Notes、API Since 和规范；官方来源不能访问时注明并使用可核对的权威替代来源。区分事实、设计选择及计划。第三方框架兼容性依据对应版本官方文档。未实际执行的代码注明未运行；不把预期结果当作实测，不将性能推断当作结论。

## 维护
每次讲授同步提交课程资料、进度和相关索引。错误修订记录在 CHANGELOG。验收依据用户反馈或真实实验。涉及公司项目的案例仅使用虚构数据与通用代码。
