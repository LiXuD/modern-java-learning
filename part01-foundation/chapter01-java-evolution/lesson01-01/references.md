# 官方参考资料与核验记录

日期：2026-11-26

| 资料 | 用途 |
| --- | --- |
| [Java SE 8 Documentation](https://docs.oracle.com/javase/8/docs/) | JDK 8 平台与 API |
| [JVMS SE 25 第 1 章](https://docs.oracle.com/javase/specs/jvms/se25/html/jvms-1.html) | JVM 定义、抽象机器 |
| [JVMS SE 25 第 4 章](https://docs.oracle.com/javase/specs/jvms/se25/html/jvms-4.html) | Class 格式及主版本 |
| [JVMS SE 27 第 4 章](https://docs.oracle.com/javase/specs/jvms/se27/html/jvms-4.html) | JDK 26/27 Class 格式 |
| [Java SE 25 API](https://docs.oracle.com/en/java/javase/25/docs/api/index.html) | Java SE 与 JDK API 区分 |
| [JEP 220](https://openjdk.org/jeps/220) | 模块化运行时镜像 |
| [JEP 261](https://openjdk.org/jeps/261) | 模块系统 |
| [JEP 282](https://openjdk.org/jeps/282) | jlink |
| [Migrating from JDK 8 to Later JDK Releases](https://docs.oracle.com/en/java/javase/25/migrate/migrating-jdk-8-later-jdk-releases.html) | JDK/JRE 布局、rt.jar/tools.jar、jrt、Oracle 分发历史 |
| [Installed Directory Structure of JDK 25](https://docs.oracle.com/en/java/javase/25/install/installed-directory-structure-jdk.html) | 现代 JDK 目录 |
| [The jlink Command](https://docs.oracle.com/en/java/javase/25/docs/specs/man/jlink.html) | jlink 参数、镜像与维护 |
| [JDK 25 Tool Specifications](https://docs.oracle.com/en/java/javase/25/docs/specs/man/index.html) | 命令行工具 |
| [System Properties — Java 25](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/System.html#getProperties()) | 运行时属性 |
| [Eclipse Temurin Releases](https://adoptium.net/temurin/releases/?package=jre) | 发行商 JRE 产品选项 |

本次重新访问 Oracle 迁移指南、API 概览、JVMS SE 25 第 1/4 章、JDK 25 目录说明、jlink 工具说明和 Adoptium 发布入口。OpenJDK 项目页面直接访问 403，JEP 220/282 等通过 Oracle 文档交叉核对；其余链接为查证入口，并非全部逐条打开。Class 版本 26/27 为延伸速查，仍可按对应 JVM 规范复核。

实验代码与命令根据官方说明整理，未在真实 JDK 8/25 环境执行；示例输出均是预期结果。用户实验和验收未收到反馈。原会话交互图/测试改写为 Mermaid、表格、选择题和答案；增加了 --release 的补充实验及思考题参考答案，不改变原章节编号。
