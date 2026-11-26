# 课后测试

先独立作答，再阅读 solutions.md。8 道选择题每题 12.5 分，80 分为门槛，即至少 7 题正确。

## 选择题

1. Java SE 与 JDK 的关系？
   - A. Java SE 是 JDK 的一个工具
   - B. Java SE 是标准平台，JDK 提供实现与工具
   - C. Java SE 是 JVM 实现
   - D. 完全相同
2. HotSpot 是什么？
   - A. Java 语言规范
   - B. 标准类库
   - C. JVM 的一种具体实现
   - D. Java 编译器
3. rt.jar 和 tools.jar 从哪个版本开始移除？
   - A. 8
   - B. 9
   - C. 11
   - D. 17
4. Oracle 从哪个主版本起不再提供该版本独立 JRE 下载？
   - A. 8
   - B. 9
   - C. 10
   - D. 11
5. JDK 25 默认生成普通 Class 文件主版本？
   - A. 52
   - B. 61
   - C. 65
   - D. 69
6. 哪个工具构建自定义运行时镜像？
   - A. javac
   - B. javap
   - C. jlink
   - D. jstack
7. 为什么 Windows x64 JDK 不能直接复制到 macOS ARM64 使用？
   - A. Java 源码不跨平台
   - B. 字节码不跨平台
   - C. JDK/JVM 本地二进制依赖 OS 和 CPU 架构
   - D. Java SE 只支持 Windows
8. JDK 25 能加载 JDK 8 的普通字节码，是否保证所有 JDK 8 项目可运行？
   - A. 是
   - B. 否，还需检查 API、依赖及行为变化

## 思考题

1. JDK 8 项目中工具依赖 tools.jar，升级至 JDK 25 后文件不存在。为什么？怎样寻找替代方案？
2. 公司有 10 个 Java 服务，一部分 JDK 8，一部分计划升到 JDK 21，共享系统 Java 环境有什么问题？如何设计部署？
3. 应用只使用集合、字符串、基础 IO 与网络，是否必须部署完整 JDK 开发工具？如何验证运行时模块依赖？

后续模块化、工程化与企业迁移课程会深入解决这些问题。
