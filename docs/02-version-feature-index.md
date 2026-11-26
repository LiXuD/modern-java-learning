# JDK 版本覆盖索引 V1.0

更新：2026-11-26。对照 [课程总纲](00-course-outline.md)，覆盖 JDK 9～27 代表性知识点，JDK 8 为基线。不是完整发行说明；每节再核对正式/预览/移除状态。LTS 主线为 8、11、17、21、25，非 LTS 版本用于追踪演进。

| JDK | 代表性变化 | 课程章节 | 官方资料入口 |
| --- | --- | --- | --- |
| 8 | Lambda、Stream、Optional、CompletableFuture；传统 JRE 镜像 | 1–3、24 | [JDK 8](https://docs.oracle.com/javase/8/docs/) |
| 9 | JPMS、模块化运行时、jlink、集合工厂、Stream/Optional、Flow、VarHandle、JShell、Compact Strings、G1 默认（通常）、统一日志；移除 rt.jar/tools.jar 和扩展机制 | 1.1、4、11–13、15、19–22、25、31、34、42 | [JDK 9 项目](https://openjdk.org/projects/jdk/9/) |
| 10 | var、集合 copyOf、AppCDS、Reader.transferTo | 4、11、16、33 | [JDK 10 项目](https://openjdk.org/projects/jdk/10/) |
| 11 | HTTP Client、String/Files API、JFR 开源、TLS 1.3、ZGC 实验、移除 Java EE/CORBA 模块；Oracle 不再单独分发该版本 JRE | 1.1、15–17、32、36、39–42 | [JDK 11 项目](https://openjdk.org/projects/jdk/11/) |
| 12 | Collectors.teeing、String.indent/transform、Files.mismatch、InputStream.skipNBytes、CompletableFuture 异常处理、默认 CDS 归档；Switch 首次预览 | 5、12、15、16、25、33 | [JDK 12 项目](https://openjdk.org/projects/jdk/12/) |
| 13 | Dynamic CDS、Text Blocks 首次预览 | 6、33 | [JDK 13 项目](https://openjdk.org/projects/jdk/13/) |
| 14 | Switch 表达式正式、Helpful NPE、JFR Streaming、CMS 移除；Record 与 instanceof 模式首次预览 | 5、7、9、19、31、36 | [JDK 14 项目](https://openjdk.org/projects/jdk/14/) |
| 15 | Text Blocks 正式、ZGC/Shenandoah 产品特性、Hidden Classes、Nashorn 移除、偏向锁默认禁用；密封类首次预览 | 6、8、30、32、39、42 | [JDK 15 项目](https://openjdk.org/projects/jdk/15/) |
| 16 | Record、instanceof 模式正式、Stream.toList、mapMulti、jpackage | 7、9、12、22 | [JDK 16 项目](https://openjdk.org/projects/jdk/16/) |
| 17 | 密封类正式、强封装、RandomGenerator、HexFormat、Security Manager 废弃待移除 | 8、18、21、40 | [JDK 17 项目](https://openjdk.org/projects/jdk/17/) |
| 18 | UTF-8 默认字符集、Simple Web Server、核心反射重构、Finalization 废弃待移除 | 16、19、21、42 | [JDK 18 项目](https://openjdk.org/projects/jdk/18/) |
| 19 | 虚拟线程首次预览、结构化并发首次孵化、Future 新方法及 ExecutorService.close | 25、26、28 | [JDK 19 项目](https://openjdk.org/projects/jdk/19/) |
| 20 | 虚拟线程第二次预览、Scoped Values 首次孵化 | 26、27 | [JDK 20 项目](https://openjdk.org/projects/jdk/20/) |
| 21 | 虚拟线程、Record Patterns、Switch 模式匹配、Sequenced Collections、分代 ZGC；Scoped Values 与结构化并发首次预览 | 9、11、26–28、32 | [JDK 21 项目](https://openjdk.org/projects/jdk/21/) |
| 22 | FFM 正式、未命名变量与模式、多文件源码启动、Gatherers 首次预览；String Templates 第二次预览 | 9、14、22、38 | [JDK 22 项目](https://openjdk.org/projects/jdk/22/) |
| 23 | 分代 ZGC 默认、基本类型模式匹配首次预览、Unsafe 内存访问方法废弃待移除；String Templates 不再提供 | 6、10、32、40 | [JDK 23 项目](https://openjdk.org/projects/jdk/23/) |
| 24 | Gatherers/Class-File API 正式、synchronized 相关 pinning 改进、AOT、Security Manager 永久禁用、非分代 ZGC 移除；紧凑对象头实验 | 14、26、30、32、33、39、40 | [JDK 24 项目](https://openjdk.org/projects/jdk/24/) |
| 25 | Scoped Values、模块导入、精简源文件与实例 main、灵活构造器正式；JFR/AOT、紧凑对象头产品特性、分代 Shenandoah；Stable Values 首次预览 | 10、27、30、32、33、36、45 | [JDK 25 项目](https://openjdk.org/projects/jdk/25/) |
| 26 | HTTP/3、Lazy Constants（Stable Values 改名后第二次预览）、G1 优化、Applet API 移除、final 字段深反射修改警告 | 17、40、45 | [JDK 26 项目](https://openjdk.org/projects/jdk/26/) |
| 27 | G1 默认范围扩大、默认紧凑对象头、后量子 TLS、JFR 脱敏；前沿预览仍需按对应版本实验 | 30、31、40、45 | [JDK 27 项目](https://openjdk.org/projects/jdk/27/) |

## 核验入口
- [Java 25 语言变化](https://docs.oracle.com/en/java/javase/25/language/java-language-changes-release.html)
- [JDK 25 迁移指南](https://docs.oracle.com/en/java/javase/25/migrate/index.html)
- [JDK 26 重大变化](https://docs.oracle.com/en/java/javase/26/migrate/significant-changes-jdk-26-release.html)
- [JDK 27 重大变化](https://docs.oracle.com/en/java/javase/27/migrate/significant-changes-jdk-27-release.html)
- [JEP 索引](03-jep-index.md)、[API 变更索引](04-api-change-index.md)

核验范围：本次访问 Oracle 语言变化、迁移指南和 25/26/27 重大变化；OpenJDK 项目页面直接访问 403。其他历史项目链接为查证入口，尚未逐个访问。发行版具体支持周期另见 Oracle 或对应发行商政策。每次课程更新相关行，不以版本主号代替特性状态。
