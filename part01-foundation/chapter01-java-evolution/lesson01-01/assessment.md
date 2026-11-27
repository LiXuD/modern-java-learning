# 1.1 课后作业与验收记录

日期：2026-11-27

## 结果

- 选择题：学习者确认 8 道题全部正确（8/8，100 分，用户自报），达到验收门槛。
- 思考题：3/3 已提交并评审，建议评分 21/30（70%）。每题 10 分为本次形成性评价的临时评分尺度，不是原课程正式验收分值。
- 动手实验：尚未收到实际执行反馈，不标记完成。
- 总体：已讲授、已归档；选择题和补充验收通过，理论验收通过。实验待确认，完整验收尚未完成。可继续第 1.2 节。

## 思考题评审

| 题目 | 学习者回答要点（摘要） | 得分 | 反馈 |
| --- | --- | ---: | --- |
| 1. tools.jar | JDK 9 模块化；分析依赖类；使用 jlink 构建运行时 | 7/10 | 理解移除原因和依赖分析方向。jlink 只能链接模块，不能修复已移除 API、内部 API 强封装或硬编码路径。先升级依赖、改用标准 API 并验证运行，再构建镜像。 |
| 2. 多版本服务 | 共享运行环境会有 API 兼容风险；JDK 21 服务使用 jlink 单独打包 | 8/10 | 版本隔离方向正确。区分编译错误与部署时的 UnsupportedClassVersionError、NoSuchMethodError 等；可直接使用多版本 JDK/服务级路径、容器或 jlink，不强制裁剪。隔离不保证应用自身兼容。 |
| 3. 运行时裁剪 | JDK 8 共用 JRE；JDK 9+ 用 jlink 打包集合、字符串、IO、网络功能 | 6/10 | JDK 8 也能为服务指定独立 JRE；jlink 单位是模块而非包/类。java.base 包含基础集合、字符串、IO 与部分网络；HttpClient 属于 java.net.http。缺少 jdeps 静态分析和集成测试验证步骤。 |

## 已体现的理解

- 能解释 JDK 9 模块化运行时与 rt.jar/tools.jar 移除的关系。
- 理解不同服务的运行时可以隔离，理解定制运行时的基本用途。
- 选择题覆盖的 JVM/HotSpot 区分、Java SE 与 JDK 概念、字节码及跨平台机制、JDK 11 Oracle 分发变化等，按用户自报全对记录通过。

## 纠偏与复习

1. 先分析依赖（jdeps、源码、依赖文档），再修复兼容问题、回归测试，最后按需 jlink。编译器标准 API 位于 java.compiler，编译器实现由 jdk.compiler 提供。旧工具依赖 tools.jar 不代表链接模块就能让它工作。
2. 已打包的应用在服务器运行通常不再编译。JDK 8 和 21 可以同时安装，分别通过 /opt/jdk8/bin/java 与 /opt/jdk21/bin/java 启动；也可用独立容器或运行时镜像。须分别验证服务兼容性。
3. jdeps 是静态依赖分析工具，jlink 是运行时镜像构建工具。普通 JAR 可用：
   
   ```sh
   jdeps --print-module-deps app.jar
   jlink --add-modules java.base,java.net.http --output my-runtime
   ./my-runtime/bin/java -jar app.jar
   ```

   模块列表仅为示例，实际依据 jdeps 输出及测试；Fat JAR、反射、SPI、本地库、第三方依赖要补充分析。命令未实际运行。

## 补充验收（2026-11-27）

用户答案摘要：C→B→D→A。先使用 jdeps 分析依赖，修复 API 及依赖兼容问题，使用完整 JDK 21 进行功能测试，再使用 jlink 构建所需模块的运行时。

评审：9/10（形成性评分），通过。核心理解正确。原题 D 同时包含两次验证，选项设计不够严谨；正确的完整流程为 C（分析）→B（修复）→D1（完整 JDK 测试）→A（构建镜像）→D2（定制镜像回归测试）。最后一步需验证动态依赖、SPI、反射及运行资源。分数不因题目自身的排序歧义扣减，主要反馈为回答尚未明确镜像生成后的验证。

## 验收清单

- [x] 选择题成绩达到门槛（用户自报 8/8）。
- [x] 补充验收通过，理解 jdeps 与 jlink 的职责及先后顺序；保留多版本部署无需强制 jlink 的复习提示。
- [ ] 确认 JavaEnvironment 与 RuntimeStructure 实验完成情况；现代 JDK 实验可在第 02 章环境就绪后补做。

官方复核：[JDK 8 迁移指南](https://docs.oracle.com/en/java/javase/25/migrate/migrating-jdk-8-later-jdk-releases.html)、[jdeps](https://docs.oracle.com/en/java/javase/25/docs/specs/man/jdeps.html)、[jlink（JDK 21）](https://docs.oracle.com/en/java/javase/21/docs/specs/man/jlink.html)。不保存学习者原始聊天全文，仅归档非敏感答案摘要、评审和学习状态。
