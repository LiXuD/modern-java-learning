# 动手实验

环境：实验 1、2 使用 JDK 8 或现代 JDK；实验 3 使用完整 JDK 9+（推荐 25）。三个示例均采用 Java 8 兼容源码，无第三方依赖。命令以 macOS/Linux shell 为例，Windows 使用对应 java.exe/javac.exe 及路径语法。不要修改公司全局 Java 环境。下列输出均为预期或示意，本次未执行 JDK 8/25 实测。

从本节目录运行命令，使用对应 JDK 的绝对路径或当前 shell 的 PATH 切换。先执行 java -version、javac -version 确认一致。不要提交 .class 或生成的运行时镜像。

## 实验 1：查看自己的运行环境

源码：[JavaEnvironment.java](examples/JavaEnvironment.java)

```sh
mkdir -p out
javac -d out examples/JavaEnvironment.java
java -cp out JavaEnvironment
```

JDK 8 预期示意：

```text
java.version                   : 1.8.0_XXX
java.specification.version     : 1.8
java.vendor                    : Oracle Corporation
java.home                      : /path/jdk8/jre
java.vm.name                   : Java HotSpot(TM) 64-Bit Server VM
java.vm.version                : 25.XXX-bXX
java.vm.vendor                 : Oracle Corporation
java.class.version             : 52.0
os.name                        : Mac OS X
os.arch                        : x86_64
```

JDK 25 预期示意：

```text
java.version                   : 25.0.X
java.specification.version     : 25
java.vendor                    : Eclipse Adoptium
java.home                      : /path/jdk25
java.vm.name                   : OpenJDK 64-Bit Server VM
java.vm.version                : 25.0.X+XX
java.vm.vendor                 : Eclipse Adoptium
java.class.version             : 69.0
os.name                        : Mac OS X
os.arch                        : aarch64
```

| 属性 | 含义 |
| --- | --- |
| java.version | 运行时版本 |
| java.specification.version | Java 平台规范版本 |
| java.vendor | Java 实现供应商 |
| java.home | Java 运行时安装位置 |
| java.vm.name | JVM 实现名称 |
| java.vm.version | JVM 实现版本 |
| java.vm.vendor | JVM 实现供应商 |
| java.class.version | 运行时支持的 Class 格式版本属性（不是当前类实际编译版本） |
| os.name | 操作系统名称 |
| os.arch | 运行时报告的架构属性 |

观察 java.home：JDK 8 常见内嵌 jre 路径，现代 JDK 通常是运行时根目录。不要将示例中的版本号、供应商或系统架构当成真实输出。

## 实验 2：查看核心类资源位置

源码：[RuntimeStructure.java](examples/RuntimeStructure.java)

```sh
javac -d out examples/RuntimeStructure.java
java -cp out RuntimeStructure
```

分别切换 JDK 8、25 后重新编译运行（也可将 JDK 8 编译的普通 Class 交给 JDK 25 执行）。

预期：
- JDK 8：jar:file:/path/jdk8/jre/lib/rt.jar!/java/lang/String.class
- JDK 25：jrt:/java.base/java/lang/String.class

结果因安装路径及实现而异。解释 jrt:/ 与 rt.jar 的区别。

## 实验 3：jlink 自定义运行时（JDK 9+）

源码：[Hello.java](examples/Hello.java)。要求完整 JDK 25、包含 jlink 和 java.base 模块来源（典型发行版有 jmods）。输出目录 my-runtime 必须尚不存在；重复实验使用不同目录或自行确认删除旧的实验镜像。

```sh
jlink --add-modules java.base --output my-runtime
./my-runtime/bin/java --version
./my-runtime/bin/java --list-modules
javac -d out examples/Hello.java
./my-runtime/bin/java -cp out Hello
```

若模块找不到，确认完整 JDK 的 JAVA_HOME，并尝试显式指定 --module-path "$JAVA_HOME/jmods"。预期模块列表包含 java.base@25.0.X，Hello 输出 Hello, Modern Java!。通常不含 javac。

比较大小（JAVA_HOME 必须指向本次完整 JDK）：

```sh
du -sh "$JAVA_HOME"
du -sh my-runtime
```

不预设大小。记录版本、模块、平台和实际测量值。裁剪运行时并非万能，需考虑动态加载、服务提供者和依赖。定制镜像维护者负责安全更新。

## 补充实验：验证 Class 版本与 --release

本实验需安装 JDK 25 与 JDK 8。用本机真实安装目录替换 JDK25、JDK8，命令仅设置当前 shell 环境。

```sh
mkdir -p out8 out25
"$JDK25/bin/javac" -d out25 examples/Hello.java
"$JDK25/bin/javap" -verbose -classpath out25 Hello
"$JDK8/bin/java" -cp out25 Hello
"$JDK25/bin/javac" --release 8 -d out8 examples/Hello.java
"$JDK25/bin/javap" -verbose -classpath out8 Hello
"$JDK8/bin/java" -cp out8 Hello
"$JDK25/bin/java" -cp out8 Hello
```

预期：out25 major 69，JDK 8 执行失败；out8 major 52，JDK 8 与 25 都能执行本例。第一条 java 失败是故意观察的结果。--release 不保证全部第三方依赖或应用行为兼容。

## 实测记录（由学习者填写）

| 项目 | JDK 8 | JDK 25 | 状态 |
| --- | --- | --- | --- |
| java.version、java.home、java.class.version | 待填 | 待填 | 未确认 |
| String.class 资源 URI | 待填 | 待填 | 未确认 |
| jlink 模块列表、Hello 输出、体积 | 不适用 | 待填 | 未确认 |
| 字节码及跨版本运行 | 待填 | 待填 | 未确认 |

提交记录前检查输出中是否包含用户名、内部安装路径等不宜公开的信息，必要时脱敏。
