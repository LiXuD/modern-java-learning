# API 变更索引 V1.0

51 条课程相关 API/行为变更条目（部分行聚合多个方法）。版本代表引入/正式或行为变化，不保证覆盖全部重载。逐节依据 Javadoc Since、异常与契约复核；JDK 专属 API 不等同于 Java SE 标准。未逐条打开所有 Javadoc。

| JDK | 类型或模块 | 方法/变化 | 状态 | 使用边界 | 章节 |
| --- | --- | --- | --- | --- | --- | --- |
| 9 | java.util.List/Set/Map | of、ofEntries（Map） | 新增 | 不可修改，拒绝 null；Set/Map 工厂拒绝重复元素/键 | 11 |
| 9 | java.util.stream.Stream | takeWhile、dropWhile、ofNullable、iterate 三参 | 新增 | 短路、顺序和并行语义需分别确认 | 12 |
| 9 | java.util.stream.Collectors | filtering、flatMapping | 新增 | 下游收集器 | 12 |
| 9 | java.util.Optional | ifPresentOrElse、or、stream | 新增 | 不要滥用为字段或参数 | 13 |
| 9 | java.io.InputStream | readAllBytes、readNBytes(byte[],int,int)、transferTo | 新增 | 大输入避免一次性读入；transferTo 不关闭流 | 16 |
| 9 | java.time.LocalDate | datesUntil | 新增 | 结束日期不包含 | 18 |
| 9 | java.lang.ProcessHandle/StackWalker | 类型及 API | 新增 | 进程信息/调用栈 | 19 |
| 9 | java.lang.ref.Cleaner | 类型及 API | 新增 | 不是确定性资源关闭的替代 | 19 |
| 9 | java.lang.System.Logger | 类型及 API | 新增 | 平台日志接口 | 19 |
| 9 | java.util.concurrent.CompletableFuture | orTimeout、completeOnTimeout、delayedExecutor | 新增 | 超时并不自动取消底层工作 | 25 |
| 9 | java.util.concurrent.Flow / java.lang.invoke.VarHandle | 类型及 API | 新增 | 背压与内存访问语义 | 25 |
| 10 | java.util.List/Set/Map | copyOf | 新增 | 不可修改的浅层复制语义 | 11 |
| 10 | java.util.stream.Collectors | toUnmodifiableList/Set/Map | 新增 | 拒绝 null | 12 |
| 10 | java.util.Optional | orElseThrow() | 新增 | 空时抛 NoSuchElementException | 13 |
| 10 | java.io.Reader | transferTo | 新增 | 字符流复制 | 16 |
| 11 | java.lang.String | isBlank、strip、stripLeading、stripTrailing、lines、repeat | 新增 | Unicode 空白与 trim 区别 | 15 |
| 11 | java.util.Optional / java.util.function.Predicate | isEmpty / not | 新增 | 空值与谓词组合 | 13 |
| 11 | java.nio.file.Path / Files | of / readString、writeString | 新增 | readString 默认 UTF-8 | 16 |
| 11 | java.io.InputStream | readNBytes(int)、nullInputStream | 新增 | 输入规模限制 | 16 |
| 11 | java.net.http | HttpClient、HttpRequest、HttpResponse、WebSocket | 正式 | 同步/异步、HTTP/2 | 17 |
| 12 | java.util.stream.Collectors | teeing | 新增 | 两路下游聚合 | 12 |
| 12 | java.lang.String | indent、transform | 新增 | 缩进、转换 | 15 |
| 12 | java.nio.file.Files / java.io.InputStream | mismatch / skipNBytes | 新增 | 精确跳过失败抛 EOFException | 16 |
| 12 | java.util.concurrent.CompletionStage / CompletableFuture | exceptionallyAsync、exceptionallyCompose 等 | 新增 | 异步异常恢复 | 25 |
| 15 | java.lang.String | formatted、stripIndent、translateEscapes | 新增 | 文本块配套 | 15 |
| 16 | java.util.stream.Stream | toList、mapMulti | 新增 | toList 不可修改；与 Collectors.toList 契约不同 | 12 |
| 16 | java.lang.Class | isRecord、getRecordComponents | 新增 | Record 反射 | 7 |
| 17 | java.time.InstantSource / java.util.HexFormat / java.util.random.RandomGenerator | 类型及 API | 新增 | 时间源、十六进制、随机数 | 18 |
| 18 | java.nio.charset.Charset | defaultCharset() 的默认行为 | 变化 | 通常 UTF-8；控制台等例外，兼容配置需核对 | 16 |
| 19 | java.util.concurrent.Future | state、resultNow、exceptionNow | 新增 | 非阻塞结果获取，状态前置条件 | 25 |
| 19 | java.util.concurrent.ExecutorService | close / AutoCloseable | 新增 | 关闭会等待任务结束 | 25 |
| 21 | java.util.SequencedCollection/Set/Map | getFirst/getLast、reversed 等 | 新增 | 反向视图不是无条件副本 | 11 |
| 21 | java.lang.Thread / java.util.concurrent.Executors | ofVirtual、startVirtualThread / newVirtualThreadPerTaskExecutor | 正式 | 不要池化虚拟线程 | 26 |
| 21 | java.net.http.HttpClient | close、shutdown 等生命周期方法 | 新增 | 完成/释放客户端资源 | 17 |
| 21 | java.lang.String / java.lang.Math | splitWithDelimiters / clamp | 新增 | 正则分隔符及边界 | 15、18 |
| 21 | javax.crypto.KEM | 类型及 API | 新增 | 密钥封装机制 | 40 |
| 22 | java.lang.foreign | MemorySegment、Arena、Linker 等 | 正式 | 本地访问与生命周期 | 38 |
| 24 | java.util.stream.Gatherer/Gatherers | Stream.gather、windowFixed 等 | 正式 | 有状态中间操作 | 14 |
| 24 | java.lang.classfile | ClassFile 等 | 正式 | 类文件生成分析 | 39 |
| 25 | java.lang.ScopedValue | where、run、call 等 | 正式 | 动态作用域与绑定 | 27 |
| 25 | java.lang.IO | print、println、readln 等 | 正式 | 精简程序输入输出 | 10 |
| 25 | javax.crypto.KDF | 类型及 API | 正式 | 密钥派生 | 40 |
| 25 | java.util.concurrent.StructuredTaskScope | 结构化并发 API | 预览 | 单独启用预览，禁止跨版本混用 | 28 |
| 26 | java.net.http.HttpClient | HTTP/3 支持 | 变化 | 按 JDK 26 API 验证协商及回退 | 17、45 |
| 9 | java.ext.dirs / lib/ext | 扩展机制 | 移除 | 使用显式依赖 | 42 |
| 11 | java.xml.bind、java.xml.ws 等 | Java EE/CORBA 模块 | 移除 | 外部依赖替代，不能简单全局替换 javax | 42 |
| 15 | jdk.scripting.nashorn | Nashorn JS 引擎 | 移除 | 评估外部引擎 | 42 |
| 17/24 | java.lang.SecurityManager | 安全管理器 | 17 废弃待移除；24 永久禁用 | 不是 24 已完全删除全部 API | 40 |
| 18 | java.lang.Object.finalize | finalization | 废弃待移除 | try-with-resources 优先，Cleaner 兜底 | 42 |
| 23/24 | sun.misc.Unsafe | 内存访问方法 | 23 废弃待移除；24 默认警告 | VarHandle、FFM 替代 | 40 |
| 26 | java.applet / 相关 API | Applet | 移除 | 无直接替代 | 45 |

## 官方查证
- [Java 25 API](https://docs.oracle.com/en/java/javase/25/docs/api/index.html)、[新增 API 索引](https://docs.oracle.com/en/java/javase/25/docs/api/new-list.html)
- [InputStream](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/io/InputStream.html)：本次确认 skipNBytes 自 12、transferTo 自 9；[Reader](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/io/Reader.html)
- [JDK 25 迁移指南](https://docs.oracle.com/en/java/javase/25/migrate/index.html)、[JDK 26 重大变化](https://docs.oracle.com/en/java/javase/26/migrate/significant-changes-jdk-26-release.html)

维护方式：每课增加类型全名、具体方法签名、Since、状态、官方 API 锚点和实验结果。未运行验证不写成实测。
