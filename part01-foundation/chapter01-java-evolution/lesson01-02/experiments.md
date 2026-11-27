# 动手实验：识别发行版及对照运行

环境：已有 JDK 8 即可完成实验 1；实验 2 需要两个 JDK（推荐第 02 章安装）。命令以 macOS/Linux 为例；Windows 使用对应路径及 exe。本次源码与命令未实测，示例输出不是实测。

## 实验 1：识别当前运行时

```sh
java -version
javac -version
java -XshowSettings:properties -version
mkdir -p out
javac -d out examples/JdkIdentity.java
java -cp out JdkIdentity
```

典型输出片段（仅示意）：

```text
java.version             : 1.8.0_XXX
java.vendor              : Oracle Corporation
java.vm.name             : Java HotSpot(TM) 64-Bit Server VM
```

```text
java.version             : 25.0.X
java.vendor              : Eclipse Adoptium
java.vm.name             : OpenJDK 64-Bit Server VM
```

java.vendor.version 可能不存在；不能依赖字符串唯一识别产品。查看实际 JDK/JRE 下载来源、包管理器记录、发行包 release 文件、LICENSE/NOTICE/legal（布局因版本变化），核对许可证。java.home 可能含个人路径，不公开原始敏感输出。

## 实验 2：同一 Class 跨发行版运行

使用实际安装目录设定 JDK_A、JDK_B（优先同主版本的两种发行版，以隔离主版本差异）。

```sh
mkdir -p out
"$JDK_A/bin/javac" -d out examples/JdkIdentity.java
"$JDK_A/bin/java" -cp out JdkIdentity
"$JDK_B/bin/java" -cp out JdkIdentity
```

对比 vendor、runtime.version、vm.name、class.version 和 OS/arch。若 B 版本较低，须确保 A 生成兼容字节码；可使用 JDK 8 编译或现代 javac --release 8。同主版本的普通 Class 预期可运行，但此实验不证明生产应用兼容或性能一致。

## 实验 3：授权判断（无需安装 JDK）

根据官方许可文本和版本发布说明，判断 Oracle JDK 21.0.12、21.0.13、当前 Oracle JDK 25、Temurin 21 的普通企业内部生产授权。分别说明免费更新、商业支持与对外分发并非同一问题；不推定任何公司实际合同。

| 环境 | 完整版本/供应商 | 来源与许可 | 使用场景/更新政策 | 结果 |
| --- | --- | --- | --- | --- |
| 当前 JDK | 待填 | 待填 | 待填 | 未确认 |
| 对照 JDK | 待填 | 待填 | 待填 | 未确认 |

第 02 章可补做多版本对照。只记录脱敏后的版本、供应商和许可信息。
