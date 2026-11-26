# 参考答案

## 选择题

| 题 | 答案 | 解析 |
| --- | --- | --- |
| 1 | B | 标准平台与实现及工具的区别。 |
| 2 | C | HotSpot 是具体 JVM 实现，不是规范。 |
| 3 | B | JDK 9 模块化运行时镜像移除内部 JAR。 |
| 4 | D | JDK 9 重构结构，JDK 11 改变 Oracle 分发；其他供应商可提供 JRE。 |
| 5 | D | Class major 69 对应 JDK 25。 |
| 6 | C | jlink 链接模块及依赖，生成运行时镜像。 |
| 7 | C | 本地二进制与 OS/架构绑定，字节码跨平台有条件。 |
| 8 | B | 字节码兼容只是应用兼容的一部分。 |

7/8 = 87.5 分，达到 80 分门槛。实验和思考题还需单独验收。

## 思考题参考

### 1. tools.jar

JEP 220 引入模块化运行时，JDK 9 起不存在 tools.jar。先用 jdeps 和依赖文档确认工具真正需要的功能，升级依赖版本。使用编译器时优先 javax.tools.JavaCompiler、ToolProvider（java.compiler 模块；实际编译器由 jdk.compiler 提供），不要假定 tools.jar 路径。其他内部 API 需按具体用途查找标准替代方案。若因强封装暂时使用 --add-opens 或 --add-exports，应记录风险及移除计划，而非永久绕过。

### 2. 多版本服务

共享 java 可能导致路径变化、Class 版本不兼容、旧框架或 GC 参数失效，升级一个服务影响其他服务。可为每个服务配置独立 JDK/JRE 安装目录，使用绝对路径或服务级 JAVA_HOME/PATH；或者将独立运行时封装到应用镜像。构建、测试、运行版本分别明确，保留旧版本与回滚配置。不要直接全局切换生产系统 Java。需持续维护各自安全更新。

### 3. 裁剪运行时

不一定需要全部开发工具。java.base 提供集合、字符串、基础 IO 和部分网络；HTTP Client 使用 java.net.http，其他协议、数据库、XML、日志等按实际依赖确定。对普通 JAR 可用目标 JDK 的 jdeps --print-module-deps 分析静态依赖，使用 jlink 添加所需模块，结合运行时集成测试、反射、ServiceLoader、本地依赖和诊断需求补齐。jdeps 不能完整推导动态依赖；不能只凭描述认定 java.base 足够。生产镜像的补丁维护及故障诊断能力也需要评估。
