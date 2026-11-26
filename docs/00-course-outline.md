# Java 8 到 Java 25：现代 Java 开发进阶

课程总纲 V1.0 · 2026-11-26 · 扩展关注 JDK 26、27

## 课程定位与范围

面向已有 JDK 8 工作经验的开发者，不重复入门知识。以 JDK 8 为基线、JDK 25 LTS 为主要环境，以 LTS 演进为主线、技术专题为课程组织方式，关注 JDK 9～25 的代表性变化，JDK 26/27 独立扩展。不要求逐个安装所有中间 JDK，也不把本大纲等同于全部 JEP 或非 JEP 更新审计。

目标：能够使用现代语言及 API，设计并发服务，理解 JVM 与 GC，执行性能诊断、企业迁移与技术选型。以实验和验收衡量掌握程度，不仅阅读语法。

P0 必须掌握；P1 重点进阶；P2 扩展。Permanent、Preview、Incubator、Experimental、Deprecated、Removed 分别标记；首次出现与正式版本分别记录。预览实验隔离。详见[教学规范](06-course-standards.md)。

## 课程结构与课时

| 篇 | 专题 | 章节 | 预计小时 |
| --- | --- | --- | ---: |
| 1 | 学习准备与 Java 8 基线 | 1～3 | 8 |
| 2 | 现代 Java 语言特性 | 4～10 | 28 |
| 3 | 集合、Stream 与函数式编程 | 11～14 | 18 |
| 4 | JDK 核心类库 | 15～19 | 20 |
| 5 | 模块化与 Java 工程化 | 20～23 | 16 |
| 6 | 现代 Java 并发编程 | 24～29 | 32 |
| 7 | JVM、GC 与运行时演进 | 30～34 | 28 |
| 8 | 性能优化与故障诊断 | 35～37 | 18 |
| 9 | 高级 API、安全与底层技术 | 38～40 | 12 |
| 10 | 企业项目升级与生态迁移 | 41～44 | 22 |
| 11 | JDK 26、27 与 Java 前沿技术 | 45～46 | 6 |
| 12 | 综合项目实战与毕业验收 | 47～48 | 20 |
| 总计 | 12 篇、48 章、441 个编号子节 | | 228 |

课时为教学估算，不含额外复习和环境排障。建议三轮：90 小时核心知识、90 小时原理和迁移、48 小时高级及综合实战。第一轮不因单个源码细节而长期停滞。每天学习 1.5 小时、每周 6 天时，约 26 周（仅规划）。

---

## 第01篇 学习准备与 Java 8 基线（8 小时）

### 第 01 章 Java 技术演进 · P0

- 1.1 Java SE、JDK、JRE、JVM 的关系
- 1.2 Oracle JDK 与 OpenJDK
- 1.3 LTS 与版本发布机制
- 1.4 JEP、JSR、JLS、JVMS
- 1.5 预览与孵化机制
- 1.6 JDK 发行版及授权区别

### 第 02 章 多版本开发环境 · P0

- 2.1 JDK 8、11、17、21、25、27 环境管理
- 2.2 JAVA_HOME 与版本切换
- 2.3 IDEA 多 SDK 配置
- 2.4 Maven Toolchains
- 2.5 --release 编译参数
- 2.6 字节码版本兼容性
- 2.7 多模块学习仓库搭建

### 第 03 章 Java 8 基线评估 · P0

- 3.1 Lambda 与函数式接口
- 3.2 Stream 与 Optional
- 3.3 集合与泛型
- 3.4 线程池与 CompletableFuture
- 3.5 Java 内存模型
- 3.6 反射与类加载
- 3.7 JDK 8 性能基准测试

**阶段实战：** 建立多版本学习仓库，运行 JDK 8 与 25 对照示例。

**验收标准：** 能独立切换 JDK、编译运行项目，解释平台、字节码及运行时兼容性。

## 第02篇 现代 Java 语言特性（28 小时）

### 第 04 章 Java 语法基础增强 · P0

- 4.1 接口私有方法（9）
- 4.2 try-with-resources 增强（9）
- 4.3 匿名内部类与菱形语法增强（9）
- 4.4 @SafeVarargs 增强（9）
- 4.5 下划线标识符限制（9）
- 4.6 var 局部变量类型推断（10）
- 4.7 Lambda 参数中的 var（11）
- 4.8 类型推断边界与可读性

### 第 05 章 Switch 表达式 · P0

- 5.1 传统 Switch 的局限
- 5.2 Switch 语句与表达式的区别
- 5.3 箭头语法与多值匹配
- 5.4 yield
- 5.5 穷尽性检查
- 5.6 枚举、状态机及业务规则应用
- 5.7 新旧 Switch 字节码分析（正式：14，JEP 361）

### 第 06 章 Text Blocks 文本块 · P0

- 6.1 多行字符串（正式：15，JEP 378）
- 6.2 缩进与空白字符处理
- 6.3 转义字符与换行控制
- 6.4 SQL、JSON、XML、HTML 实际应用
- 6.5 文本块与字符串拼接对比
- 6.6 SQL 注入等安全问题
- 6.7 String Templates 的预览历史与撤回

### 第 07 章 Record 记录类 · P0

- 7.1 设计目标（正式：16，JEP 395）
- 7.2 编译器自动生成的方法
- 7.3 标准构造器与紧凑构造器
- 7.4 自定义方法、静态成员与接口
- 7.5 浅层不可变与防御性复制
- 7.6 Record、POJO、JavaBean、Lombok 对比
- 7.7 DTO、VO、配置对象应用
- 7.8 反射与序列化
- 7.9 ORM 局限
- 7.10 字节码分析

### 第 08 章 Sealed Classes 密封类 · P1

- 8.1 传统继承体系的问题（正式：17，JEP 409）
- 8.2 sealed、permits
- 8.3 final、sealed、non-sealed 子类
- 8.4 密封接口与模块限制
- 8.5 封闭类型与开放类型体系
- 8.6 领域模型与业务结果建模
- 8.7 与模式匹配结合

### 第 09 章 Pattern Matching 模式匹配 · P0

- 9.1 instanceof 模式匹配（16）
- 9.2 模式变量与流作用域
- 9.3 Switch 模式匹配（21，JEP 441）
- 9.4 when 守卫条件
- 9.5 null 匹配
- 9.6 类型支配与穷尽性检查
- 9.7 Record Patterns（21，JEP 440）
- 9.8 嵌套 Record 解构
- 9.9 未命名变量与模式 _（22，JEP 456）
- 9.10 Record + Sealed + Pattern Matching 综合设计
- 9.11 访问者模式与类型判断逻辑重构

### 第 10 章 JDK 25 语言增强 · P1

- 10.1 Module Import（JEP 511）
- 10.2 模块导入与普通 import
- 10.3 Compact Source Files（JEP 512）
- 10.4 实例 main 方法
- 10.5 java.lang.IO 基础输入输出
- 10.6 Flexible Constructor Bodies（JEP 513）
- 10.7 super()/this() 之前的语句限制
- 10.8 基本类型模式匹配（JEP 507，第三次预览）
- 10.9 工程应用边界

**阶段实战：** 将 JDK 8 订单处理模块重构为现代 Java 实现，包含订单状态、支付结果、退款及业务异常。

**验收标准：** 正确使用 Record、密封类与模式匹配，解释不可变性、类型穷尽性和传统 POJO 的适用边界。

## 第03篇 集合、Stream 与函数式编程（18 小时）

### 第 11 章 集合框架演进 · P0

- 11.1 List.of、Set.of、Map.of（9）
- 11.2 Map.ofEntries（9）
- 11.3 copyOf（10）
- 11.4 不可修改集合与不可变对象
- 11.5 Collections.unmodifiableList 对比
- 11.6 空值及重复元素限制
- 11.7 SequencedCollection、SequencedSet、SequencedMap（21，JEP 431）
- 11.8 首尾元素与反向视图
- 11.9 集合性能与内存分析

### 第 12 章 Stream API 增强 · P0

- 12.1 takeWhile、dropWhile（9）
- 12.2 Stream.ofNullable（9）
- 12.3 iterate 增强（9）
- 12.4 Collectors.filtering、flatMapping（9）
- 12.5 toUnmodifiableList/Set/Map（10）
- 12.6 Collectors.teeing（12）
- 12.7 Stream.toList（16）
- 12.8 mapMulti（16）
- 12.9 并行流性能与边界

### 第 13 章 Optional 与函数式 API · P0

- 13.1 ifPresentOrElse（9）
- 13.2 or（9）
- 13.3 Optional.stream（9）
- 13.4 无参 orElseThrow（10）
- 13.5 isEmpty（11）
- 13.6 Predicate.not（11）
- 13.7 orElse 与 orElseGet
- 13.8 设计边界及误用

### 第 14 章 Stream Gatherers · P1

- 14.1 Stream 中间操作局限（正式：24，JEP 485）
- 14.2 Gatherer 接口
- 14.3 windowFixed
- 14.4 windowSliding
- 14.5 fold 与 scan
- 14.6 mapConcurrent
- 14.7 自定义 Gatherer
- 14.8 并行执行与状态管理
- 14.9 Gatherer 与 Collector 的区别

**阶段实战：** 日志统计、数据分组聚合、连续窗口分析和批量数据处理。

**验收标准：** 区分 Arrays.asList、List.of、List.copyOf、Collectors.toList、Stream.toList、toUnmodifiableList 的行为；实现窗口分析并测试。

## 第04篇 JDK 核心类库（20 小时）

### 第 15 章 String 与 Unicode · P0

- 15.1 isBlank、strip、stripLeading、stripTrailing（11）
- 15.2 lines、repeat（11）
- 15.3 indent、transform（12）
- 15.4 formatted、stripIndent、translateEscapes（15）
- 15.5 splitWithDelimiters（21）
- 15.6 Unicode 与字符编码
- 15.7 Compact Strings（9）
- 15.8 字符串拼接实现变化（9）

### 第 16 章 文件、IO 与 NIO · P0

- 16.1 InputStream.transferTo、readAllBytes（9）
- 16.2 Reader.transferTo（10）
- 16.3 Path.of（11）
- 16.4 Files.readString/writeString（11）
- 16.5 Files.mismatch（12）
- 16.6 InputStream.skipNBytes（12）
- 16.7 UTF-8 默认字符集（18）
- 16.8 大文件处理与资源释放

### 第 17 章 HTTP Client 网络编程 · P0

- 17.1 HttpURLConnection 的局限
- 17.2 HttpClient（11）
- 17.3 Request 与 Response
- 17.4 HTTP/1.1 与 HTTP/2
- 17.5 同步与异步请求
- 17.6 CompletableFuture 集成
- 17.7 WebSocket
- 17.8 超时、代理、认证与重定向
- 17.9 客户端生命周期管理（21）
- 17.10 HTTP/3 支持（26，扩展）

### 第 18 章 日期、数值及工具 API · P1

- 18.1 Java Time API 后续增强
- 18.2 LocalDate.datesUntil（9）
- 18.3 InstantSource（17）
- 18.4 CLDR 区域数据变化（9、23）
- 18.5 RandomGenerator（17）
- 18.6 HexFormat（17）
- 18.7 Math.clamp（21）
- 18.8 Objects、Arrays、正则表达式及数值 API 增强

### 第 19 章 进程与系统工具 API · P1

- 19.1 ProcessHandle（9）
- 19.2 进程信息与进程树
- 19.3 StackWalker（9）
- 19.4 Cleaner（9）
- 19.5 System.Logger（9）
- 19.6 Helpful NPE（14 引入、15 默认启用）
- 19.7 Simple Web Server（18）
- 19.8 Javadoc 与 @snippet（18）

**阶段实战：** 使用标准 JDK 构建 HTTP 接口巡检、文件导入及日志分析工具。

**验收标准：** 正确处理编码、资源关闭、HTTP 超时和错误；能通过 Javadoc 查证 API 最低版本。

## 第05篇 模块化与 Java 工程化（16 小时）

### 第 20 章 JPMS 模块系统 · P1

- 20.1 Project Jigsaw 背景
- 20.2 模块描述文件
- 20.3 requires
- 20.4 exports
- 20.5 opens
- 20.6 requires transitive
- 20.7 uses/provides
- 20.8 ServiceLoader
- 20.9 Classpath 与 Module Path
- 20.10 自动模块与未命名模块
- 20.11 循环依赖及拆分包

### 第 21 章 类加载、反射与封装 · P0

- 21.1 JDK 9 类加载器变化
- 21.2 内部 API 封装
- 21.3 JDK 17 强封装（JEP 403）
- 21.4 InaccessibleObjectException
- 21.5 --add-opens
- 21.6 --add-exports
- 21.7 MethodHandles
- 21.8 核心反射实现重构（18，JEP 416）

### 第 22 章 编译、运行与打包工具 · P1

- 22.1 JShell（9）
- 22.2 单文件源码启动（11）
- 22.3 多文件源码启动（22）
- 22.4 Multi-Release JAR（9）
- 22.5 jdeps
- 22.6 jdeprscan
- 22.7 jlink（9）
- 22.8 jpackage（16 正式）
- 22.9 定制运行时与应用分发

### 第 23 章 现代项目工程化 · P0

- 23.1 Maven 与 Gradle 多 JDK 管理
- 23.2 编译器与插件兼容性
- 23.3 JUnit 测试体系
- 23.4 多版本 CI 构建
- 23.5 Java 应用容器化
- 23.6 JAR、Fat JAR 与模块化项目
- 23.7 依赖管理及可重复构建

**阶段实战：** 构建接口、实现及启动模块组成的可插拔应用，以 jlink 或 jpackage 分发。

**验收标准：** 能解释模块可读性、反射访问、Classpath/Module Path，并构建可运行镜像。

## 第06篇 现代 Java 并发编程（32 小时）

### 第 24 章 传统并发模型及其局限 · P0

- 24.1 平台线程与 OS 线程
- 24.2 CPU 密集型与 IO 密集型任务
- 24.3 线程池参数与拒绝策略
- 24.4 ForkJoinPool 与 Work Stealing
- 24.5 阻塞 IO 与非阻塞 IO
- 24.6 高并发服务线程模型
- 24.7 JMM 与 Happens-Before
- 24.8 资源瓶颈

### 第 25 章 并发 API 增强 · P0

- 25.1 CompletableFuture 超时控制（9）
- 25.2 orTimeout、completeOnTimeout
- 25.3 delayedExecutor
- 25.4 异常恢复 API 增强（12）
- 25.5 Flow API 与 Reactive Streams（9）
- 25.6 背压机制
- 25.7 VarHandle 与内存访问语义（9）
- 25.8 Future 状态与结果获取（19）
- 25.9 ExecutorService 自动关闭（19）
- 25.10 异步任务取消与资源释放

### 第 26 章 Virtual Threads 虚拟线程 · P0

- 26.1 Project Loom 设计目标（21 正式，JEP 444）
- 26.2 平台线程与虚拟线程
- 26.3 Thread.ofVirtual
- 26.4 Executors.newVirtualThreadPerTaskExecutor
- 26.5 Carrier Thread 与调度
- 26.6 Mount 与 Unmount
- 26.7 Continuation 实现原理
- 26.8 阻塞 IO 协作
- 26.9 生命周期
- 26.10 为什么不池化虚拟线程
- 26.11 Pinning
- 26.12 synchronized 改进（24，JEP 491）
- 26.13 ThreadLocal 成本
- 26.14 监控诊断
- 26.15 CPU 密集任务的边界

### 第 27 章 Scoped Values 作用域值 · P1

- 27.1 ThreadLocal 生命周期问题（25 正式，JEP 506）
- 27.2 请求上下文传递
- 27.3 绑定机制
- 27.4 作用域与生命周期
- 27.5 嵌套绑定与重绑定
- 27.6 与虚拟线程结合
- 27.7 与结构化并发协作
- 27.8 替代 ThreadLocal 的边界

### 第 28 章 Structured Concurrency 结构化并发 · P1

- 28.1 非结构化并发的问题（25 第五次预览，JEP 505）
- 28.2 父子任务关系
- 28.3 StructuredTaskScope
- 28.4 子任务结果收集
- 28.5 异常传播与失败策略
- 28.6 超时及取消
- 28.7 Joiner 与任务完成策略
- 28.8 与 CompletableFuture 的区别
- 28.9 虚拟线程与 ScopedValue 协作
- 28.10 不同预览版本 API 变化（隔离实验）

### 第 29 章 现代并发架构设计 · P0

- 29.1 平台线程池与虚拟线程选型
- 29.2 数据库连接池容量限制
- 29.3 Semaphore 与资源访问控制
- 29.4 并发限制、限流与背压
- 29.5 异步异常处理
- 29.6 Web 服务虚拟线程
- 29.7 虚拟线程与响应式编程对比
- 29.8 压测与指标分析
- 29.9 服务端并发模型迁移

**阶段实战：** 使用传统线程池、CompletableFuture、虚拟线程分别实现接口聚合服务，独立开展结构化并发实验。

**验收标准：** 用实测吞吐量、响应时间、CPU、内存及异常行为比较方案，能对外部资源限流并解释适用边界。

## 第07篇 JVM、GC 与运行时演进（28 小时）

### 第 30 章 JVM 运行时变化 · P1

- 30.1 运行时数据区回顾
- 30.2 堆与元空间
- 30.3 对象内存布局
- 30.4 Compact Object Headers（24 实验、25 产品特性、27 默认）
- 30.5 压缩指针
- 30.6 字节码与解释执行
- 30.7 JIT
- 30.8 逃逸分析
- 30.9 锁机制演进
- 30.10 偏向锁默认禁用（15）

### 第 31 章 垃圾回收器演进 · P1

- 31.1 Serial GC
- 31.2 Parallel GC
- 31.3 CMS 废弃及移除（9、14）
- 31.4 G1 成为通常默认 GC（9）
- 31.5 G1 Region 与回收机制
- 31.6 Remembered Set
- 31.7 G1 Mixed GC
- 31.8 G1 调优
- 31.9 JDK 27 全环境默认 G1

### 第 32 章 现代低延迟垃圾回收器 · P1

- 32.1 ZGC 设计目标
- 32.2 实验阶段（11）
- 32.3 正式发布（15）
- 32.4 染色指针与屏障
- 32.5 Generational ZGC（21）
- 32.6 分代默认（23）
- 32.7 非分代移除（24）
- 32.8 Shenandoah GC
- 32.9 Generational Shenandoah（25 产品特性）
- 32.10 G1、ZGC、Shenandoah 选型

### 第 33 章 JIT、CDS 与 AOT · P1

- 33.1 C1/C2
- 33.2 分层编译
- 33.3 CDS
- 33.4 AppCDS（10）
- 33.5 默认 CDS 归档（12）
- 33.6 Dynamic CDS（13）
- 33.7 Project Leyden
- 33.8 AOT Class Loading & Linking（24）
- 33.9 AOT 命令行与方法画像优化（25）
- 33.10 HotSpot AOT 与 GraalVM Native Image 的区别

### 第 34 章 JVM 参数与容器环境 · P0

- 34.1 JVM 参数分类
- 34.2 Unified JVM Logging（9）
- 34.3 GC 日志格式
- 34.4 已废弃 JVM 参数
- 34.5 容器 CPU/内存识别
- 34.6 MaxRAMPercentage
- 34.7 Docker、Kubernetes 资源限制
- 34.8 容器 OOM 与 JVM OOM
- 34.9 跨版本 JVM 参数迁移

**阶段实战：** 同一业务代码跨 JDK 与 GC 进行实验，比较吞吐量、停顿、内存和 CPU。

**验收标准：** 根据延迟、内存及吞吐量目标选择 GC，解释 HotSpot 实现与规范的区别；能分析容器资源限制。

## 第08篇 性能优化与故障诊断（18 小时）

### 第 35 章 JVM 监控与诊断工具 · P0

- 35.1 jps
- 35.2 jstat
- 35.3 jcmd
- 35.4 jstack
- 35.5 jmap
- 35.6 jhsdb
- 35.7 Heap Dump
- 35.8 Thread Dump
- 35.9 Native Memory Tracking
- 35.10 VisualVM 与 MAT

### 第 36 章 JFR 与 JMC · P0

- 36.1 Java Flight Recorder
- 36.2 JFR 在 JDK 11 开源（JEP 328）
- 36.3 启动与停止录制
- 36.4 事件体系
- 36.5 自定义事件
- 36.6 JFR Event Streaming（14）
- 36.7 Java Mission Control
- 36.8 CPU 热点分析
- 36.9 锁竞争分析
- 36.10 JDK 25 采样、方法计时与跟踪增强（CPU-Time Profiling 为实验特性）

### 第 37 章 性能测试与故障排查 · P0

- 37.1 JMH 微基准
- 37.2 JVM 预热
- 37.3 死代码消除
- 37.4 压力测试方法
- 37.5 CPU 飙高
- 37.6 内存泄漏
- 37.7 死锁定位
- 37.8 Full GC 频繁排查
- 37.9 虚拟线程诊断
- 37.10 P95/P99 与吞吐量分析
- 37.11 性能回归验证

**阶段实战：** 构造 CPU 高占用、内存泄漏、死锁与频繁 GC 四类故障并修复。

**验收标准：** 能够采集和解释线程、堆、JFR、GC 数据并复测；能够识别不可靠的微基准。

## 第09篇 高级 API、安全与底层技术（12 小时）

### 第 38 章 Foreign Function & Memory API · P2

- 38.1 JNI 工作方式与局限
- 38.2 Project Panama
- 38.3 FFM API（22 正式，JEP 454）
- 38.4 MemorySegment
- 38.5 Arena
- 38.6 MemoryLayout
- 38.7 Linker
- 38.8 本地函数调用
- 38.9 堆外内存管理
- 38.10 Native Access 限制

### 第 39 章 字节码与底层计算 · P2

- 39.1 Class-File API（24 正式，JEP 484）
- 39.2 Class 文件结构
- 39.3 字节码读取与生成
- 39.4 与 ASM 的区别
- 39.5 Dynamic Class-File Constants（11）
- 39.6 Hidden Classes（15）
- 39.7 Vector API
- 39.8 SIMD 向量化
- 39.9 Vector API 孵化状态

### 第 40 章 Java 安全体系演进 · P1

- 40.1 TLS 1.3（11）
- 40.2 密码学算法演进
- 40.3 EdDSA（15）
- 40.4 KEM API（21）
- 40.5 ML-KEM、ML-DSA（24）
- 40.6 KDF API（25 正式）
- 40.7 Security Manager 废弃（17）与永久禁用（24）
- 40.8 序列化过滤
- 40.9 Unsafe 内存访问方法废弃及警告
- 40.10 JNI 限制与 Java Agent 动态加载警告

**阶段实战：** FFM 调用简单本地库，Class-File API 分析类文件，实验 Unsafe 警告与标准替代 API。

**验收标准：** 能区分正式 API 与孵化特性，了解本地访问、字节码、安全限制及迁移风险。

## 第10篇 企业项目升级与生态迁移（22 小时）

### 第 41 章 JDK 8 升级前评估 · P0

- 41.1 架构盘点
- 41.2 第三方依赖清单
- 41.3 内部 API 扫描
- 41.4 jdeps 与 jdeprscan
- 41.5 JVM 参数检查
- 41.6 编码与时区检查
- 41.7 性能基准
- 41.8 兼容风险评估
- 41.9 回滚方案

### 第 42 章 JDK 迁移常见问题 · P0

- 42.1 JAXB、JAX-WS 等模块移除（11）
- 42.2 Nashorn 移除（15）
- 42.3 CMS 移除（14）
- 42.4 反射强封装（17）
- 42.5 JDK 目录结构变化
- 42.6 rt.jar、tools.jar 移除（9）
- 42.7 扩展机制及 Endorsed Standards Override 机制移除
- 42.8 默认编码变化（18）
- 42.9 TLS、证书、算法兼容
- 42.10 Finalization 废弃（18，待移除）
- 42.11 CLDR 区域数据兼容

### 第 43 章 Spring 及开发生态迁移 · P0

- 43.1 Spring Boot 2.x 与现代版本
- 43.2 Spring Framework 6/7
- 43.3 Spring Boot 3.x Java 17 基线
- 43.4 Java EE 到 Jakarta EE
- 43.5 Spring Boot 4.x 迁移
- 43.6 Hibernate、MyBatis 兼容性
- 43.7 Jackson 与 Record
- 43.8 Lombok、ASM、Byte Buddy 兼容性
- 43.9 Maven 插件升级
- 43.10 Spring 虚拟线程配置与限制

### 第 44 章 企业级升级实施方案 · P0

- 44.1 直接与分阶段升级
- 44.2 JDK 8 → 17
- 44.3 JDK 8 → 21/25
- 44.4 先升级运行时后重构代码
- 44.5 自动化测试与 OpenRewrite
- 44.6 数据库驱动检查
- 44.7 容器镜像升级
- 44.8 灰度发布
- 44.9 性能验证
- 44.10 回滚演练
- 44.11 升级验收报告

**阶段实战：** 选择可公开的 JDK 8 示例服务，建立基线、迁移、修复兼容问题、回归测试和回滚演练。

**验收标准：** 提交迁移报告，区分 JDK 与第三方框架的变化，验证依赖、功能、性能及回滚路径。

## 第11篇 JDK 26、27 与 Java 前沿技术（6 小时）

### 第 45 章 JDK 26 与 JDK 27 新特性 · P2

- 45.1 HTTP/3 Client（26）
- 45.2 基本类型模式匹配（预览）
- 45.3 结构化并发（预览）
- 45.4 Lazy Constants（预览）
- 45.5 Vector API（孵化）
- 45.6 PEM 加密对象编码（预览）
- 45.7 G1 同步开销优化（26）及默认范围扩大（27）
- 45.8 AOT 支持任意 GC 的对象缓存（26）
- 45.9 Compact Object Headers（27 默认）
- 45.10 Applet API 移除（26）
- 45.11 final 字段深反射修改警告
- 45.12 TLS 1.3 后量子混合密钥交换（27）
- 45.13 JFR 进程内敏感数据脱敏（27）

### 第 46 章 Java 未来技术方向 · P2

- 46.1 Project Loom：虚拟线程、结构化并发、作用域值
- 46.2 Project Amber：语法与数据导向编程
- 46.3 Project Panama：FFM、Vector API
- 46.4 Project Valhalla：值类、值对象、泛型演进
- 46.5 Project Leyden：启动、预热、AOT
- 46.6 Project Lilliput：对象头压缩
- 46.7 Project Babylon：代码模型、代码反射、异构计算

**阶段实战：** 阅读正式发布说明，分别运行正式特性与隔离的预览实验，撰写版本差异笔记。

**验收标准：** 识别正式、预览和孵化特性，不将未来计划或预览 API 视为稳定生产能力。

## 第12篇 综合项目实战与毕业验收（20 小时）

### 第 47 章 现代 Java 综合项目实战 · P0

- 47.1 项目需求与架构
- 47.2 JDK 8 基准项目
- 47.3 单元与集成测试
- 47.4 升级到 JDK 25
- 47.5 Record 数据对象
- 47.6 密封类和模式匹配
- 47.7 集合与 Stream
- 47.8 HTTP Client 接口巡检
- 47.9 虚拟线程并发巡检
- 47.10 ScopedValue 请求上下文
- 47.11 Gatherers 日志窗口分析
- 47.12 JVM 参数与 GC
- 47.13 JFR 性能分析
- 47.14 容器化部署与回归测试

### 第 48 章 毕业考核与技术能力验收 · P0

- 48.1 现代语言特性（20 分）
- 48.2 标准类库与数据处理（15 分）
- 48.3 并发与架构选型（20 分）
- 48.4 JVM 与 GC（15 分）
- 48.5 性能与诊断（10 分）
- 48.6 企业迁移（15 分）
- 48.7 文档与工程质量（5 分）

**阶段实战：** 设备资产管理与自动化巡检平台，JDK 8 基线与 JDK 25 版本双实现，使用虚构数据。

**验收标准：** 核心功能测试全部通过，毕业评分至少 80/100，提供可重复构建、实验与迁移报告。

## 版本覆盖索引（课程内速查）

| JDK | 代表性知识点 | 章节 |
| --- | --- | --- |
| 9 | JPMS、集合工厂、Stream、Flow、VarHandle、JShell、Compact Strings、G1、统一日志 | 4、11～13、15、19～22、25、31、34 |
| 10 | var、copyOf、AppCDS | 4、11、33 |
| 11 | HTTP Client、String、Files、JFR、TLS 1.3、ZGC 实验、Java EE 模块移除 | 15～17、32、36、39～42 |
| 12 | teeing、String、Files.mismatch、CompletableFuture、默认 CDS 归档 | 12、15、16、25、33 |
| 13 | Dynamic CDS、文本块首次预览 | 6、33 |
| 14 | Switch 表达式、Helpful NPE、JFR Streaming、CMS 移除 | 5、19、31、36 |
| 15 | Text Blocks、ZGC/Shenandoah 正式、Hidden Classes、Nashorn 移除 | 6、30、32、39、42 |
| 16 | Record、instanceof 模式匹配、Stream.toList、mapMulti、jpackage | 7、9、12、22 |
| 17 | 密封类、强封装、RandomGenerator、HexFormat | 8、18、21、40 |
| 18 | UTF-8 默认、Simple Web Server、反射重构、Finalization 废弃待移除 | 16、19、21、42 |
| 19 | 虚拟线程首次预览、结构化并发首次孵化、Future 增强 | 25、26、28 |
| 20 | 虚拟线程第二次预览、Scoped Values 孵化 | 26、27 |
| 21 | 虚拟线程、Record Patterns、Switch 模式匹配、有序集合、分代 ZGC | 9、11、26、32 |
| 22 | FFM、未命名变量与模式、多文件源码启动、Gatherers 首次预览 | 9、14、22、38 |
| 23 | 分代 ZGC 默认、基本类型模式匹配预览、Unsafe 内存访问废弃待移除 | 10、32、40 |
| 24 | Gatherers、Class-File API、Pinning 改进、AOT、Security Manager 永久禁用 | 14、26、33、39、40 |
| 25 | Scoped Values、模块导入、精简源文件、构造器增强、JFR、AOT、对象头压缩 | 10、27、30、32、33、36 |
| 26 | HTTP/3、Lazy Constants 预览、G1 优化、Applet API 移除 | 17、45 |
| 27 | G1 默认范围扩大、默认紧凑对象头、后量子 TLS、JFR 脱敏 | 30、31、45 |

本表是代表性索引；独立 JEP/API/版本索引后续归档。预览次数和 26/27 的具体版本状态在第 45 章再次核对；不得直接复用不同预览版本的代码。

## 重要教学边界

- Record 是浅层不可变，不能一概代替传统 POJO 或 ORM Entity。
- 虚拟线程主要服务高并发阻塞场景，不保证单任务提速；JDK 24 改进 synchronized 相关 pinning，不等于所有 pinning 均消失。
- JDK 迁移与 Spring/Jakarta 迁移是不同事项，Java SE 的 javax.* 并非全部需要改名。
- GC 选型依据具体工作负载；可用性取决于发行版与平台。性能结论以可复现实验为准。
- 升级无需强制逐级经过所有 LTS；先评估依赖、运行时、兼容性、回归、灰度和回滚。
- 预览/孵化和未来项目不作为正式生产级必学特性。

## 官方参考资料及核验范围

- [OpenJDK JEP Index](https://openjdk.org/jeps/0)
- [Java 25 Language Changes Summary](https://docs.oracle.com/en/java/javase/25/language/java-language-changes-summary.html)
- [Java 27 Language Changes Summary](https://docs.oracle.com/en/java/javase/27/language/java-language-changes-summary.html)
- [Java 25 API Specification](https://docs.oracle.com/en/java/javase/25/docs/api/index.html)
- [Java 25 New API List](https://docs.oracle.com/en/java/javase/25/docs/api/new-list.html)
- [Java Language / JVM Specification](https://docs.oracle.com/javase/specs/)
- [JDK 25 Migration Guide](https://docs.oracle.com/en/java/javase/25/migrate/index.html)
- [JDK 26 Release Notes](https://www.oracle.com/java/technologies/javase/26-relnote-issues.html)
- [JDK 27 Consolidated Release Notes](https://www.oracle.com/java/technologies/javase/27all-relnotes.html)
- [JDK 27 Significant Changes](https://docs.oracle.com/en/java/javase/27/migrate/significant-changes-jdk-27-release.html)
- [HotSpot GC Tuning Guide](https://docs.oracle.com/en/java/javase/25/gctuning/index.html)
- [Dev.java](https://dev.java/learn/)、[Inside Java](https://inside.java/)、[Ops.java](https://ops.java/)
- [Oracle Java SE Support Roadmap](https://www.oracle.com/java/technologies/java-se-support-roadmap.html)

本次归档保存原课程大纲的章节、小节、课时与教学目标；复核语言变化汇总、新 API 列表、部分 IO Javadoc 及 JDK 26/27 发布资料。并非逐条验证所有 API、JEP、框架版本及实验代码；各节必须按官方规范复核并标注测试状态。第 45 章的预览次数留待详细讲授时按正式发布说明确认。课程时间、优先级、综合项目和评分为教学设计，不是 Java 官方标准。

## 后续执行

按小节编号授课，遵循 [AGENTS.md](../AGENTS.md)、[仓库约定](00-repository-guide.md) 与 [教学规范](06-course-standards.md)。每节保存讲义、示例、实验、练习、答案及官方出处，更新 [学习进度](01-learning-progress.md) 和 [修订记录](CHANGELOG.md)。
