# JDK 8 → 17 / 21 / 25 企业项目迁移检查清单 V1.0

课程第 41–44 章配套。此处为通用模板，未针对实际公司项目评估；不得将生产数据、凭据或内部报告提交公开仓库。目标版本取决于依赖、发行商支持、安全政策与风险；不强制逐级升级。

## 1. 范围与基线
- [ ] 确认目标 JDK 发行版、补丁版本、OS/CPU、授权、维护周期与负责人。
- [ ] 盘点应用、框架、数据库驱动、代理、JNI、脚本、构建工具、容器及第三方依赖。
- [ ] 固定当前 JDK 8 构建产物、配置、镜像、数据库模式及发布记录。
- [ ] 建立单元、集成、端到端、契约测试；覆盖关键交易、异常与重试。
- [ ] 记录基准吞吐量、P50/P95/P99、错误率、CPU、内存/RSS、GC 停顿、启动时间及工作负载。
- [ ] 明确可接受差异、SLO、验收阈值、回滚条件和责任人。

### 发行商和授权专项（1.2）
- [ ] 核对 JDK 产品、完整更新版本、来源、实际 LICENSE/NOTICE 与合同；记录二进制 SHA-256、供应链及安全更新政策。
- [ ] Oracle JDK 21.0.13（2026-10-20）起 OTN，Oracle JDK 25 NFTC 更新计划截至 2028-09；切换更新时重新核对，不能用停止打补丁替代安全维护。
- [ ] 区分内部生产与随产品分发，检查实际运行时镜像及第三方组件许可，明确 SLA 与支持责任。
- [ ] 同主版本换发行商仍需功能、TLS/证书、Agent、JNI、GC 及性能回归，不能用 TCK 代替。
- 参见 [1.2 讲义](../part01-foundation/chapter01-java-evolution/lesson01-02/README.md)、[Oracle JDK 21.0.13 发布说明](https://www.oracle.com/java/technologies/javase/21-0-13-relnotes.html)。

## 2. 静态分析与构建
- [ ] 运行依赖树，升级编译器、测试插件、字节码工具与依赖；逐版本核对供应商支持矩阵。
- [ ] 使用目标 JDK 的 jdeps 检查内部 API/缺失依赖、jdeprscan 检查废弃 API。
- [ ] 检查 Class 文件版本、Maven/Gradle toolchain 与 --release；第三方 JAR 同样需要兼容。
- [ ] 检查反射、类加载器、自定义序列化、动态代理、Java Agent、本地代码。
- [ ] 检查旧 java.home 路径假设、rt.jar/tools.jar、lib/ext、endorsed 目录。
- [ ] 依赖 JDK 内部类的代码改用标准 API；临时 --add-opens/--add-exports 必须有清理计划。

示例命令（在目标 JDK 环境；替换路径；Fat JAR 需拆解依赖或用构建工具给出真实 classpath）：

```sh
java -version
javac -version
jdeps --jdk-internals --class-path 'lib/*' app.jar
jdeprscan --release 25 --class-path 'lib/*' app.jar
javap -verbose -classpath app.jar com.example.Main
```

按目标版本修改 --release；确认该工具支持该版本。静态工具不保证识别反射、动态加载或服务提供者。

## 3. 重点兼容性问题

| 版本 | 变化 | 检查或处理 |
| --- | --- | --- |
| 9 | 模块化运行时、rt.jar/tools.jar 移除；扩展/endorsed 机制移除 | 改为标准编译 API、显式依赖及 jrt 资源访问 |
| 9 | G1 通常成为默认、统一 JVM/GC 日志 | 重做 GC 参数和日志解析；勿照搬 JDK 8 参数 |
| 9 | CLDR 默认区域数据 | 验证日期、货币、格式化与解析 |
| 11 | Java EE/CORBA 模块移除、Oracle 不再独立提供该版本 JRE | 补齐 JAXB/JAX-WS 等外部依赖；选择 JDK/JRE 镜像 |
| 11 | TLS 1.3 | 检查协议协商、信任库、证书、代理及旧服务 |
| 14 | CMS 移除 | 重新选择 GC 并压测 |
| 15 | Nashorn 移除、偏向锁默认禁用 | 检查脚本引擎、锁参数 |
| 17 | JDK 内部 API 强封装 | 更新反射库，消除临时打开模块参数 |
| 18 | 默认 UTF-8 | 明确文件/网络编码，验证 GBK 等遗留输入 |
| 18 | Finalization 废弃待移除 | 显式关闭资源；不要依赖终结器执行 |
| 21 | Java Agent 动态加载警告、虚拟线程正式 | 检查监控代理；并发模型独立变更与压测 |
| 24 | Security Manager 永久禁用、Unsafe 内存访问警告 | 替换安全隔离及内存访问方案 |
| 25 | 运行时、JFR、GC 等持续变化 | 查阅目标补丁版本说明；不默认启用预览 |
| 26+（若升级） | final 字段深反射修改警告、Applet 移除等 | 检查序列化/反射库及遗留桌面应用 |

## 4. 框架生态
- [ ] 按 Spring Boot 对应版本的 System Requirements 核验目标 JDK。
- [ ] 若升级 Spring Boot 2→3/4，单独制定 Spring/Jakarta 迁移；Java SE 的 javax.* 不全需要替换。
- [ ] 核验 Hibernate、MyBatis、Jackson、Lombok、ASM、Byte Buddy、JDBC 驱动及测试库。
- [ ] 先尽量保持业务代码不变，运行现有应用；兼容问题修复后再引入 Record、虚拟线程等。
- [ ] 记录依赖升级、许可证与漏洞扫描结果。

## 5. 环境及性能验证
- [ ] 检查 JVM 启动参数、日志、内存上限、容器 cgroup、CPU 配额、时区、字符集、字体与本地库。
- [ ] 验证启动、健康检查、连接池、并发限制、超时、错误传播、关闭与优雅停机。
- [ ] 校验数据一致性、序列化、缓存、消息、数据库事务和监控告警。
- [ ] 同负载、同硬件/资源限制、同预热条件重复压测；记录 JFR/GC/线程和内存证据。
- [ ] 对虚拟线程等架构变更单独实验；不以线程数量替代吞吐与延迟评价。

## 6. 发布与回滚
- [ ] 固定目标运行时版本及容器镜像摘要，保留旧镜像、JDK 8 构建产物及配置。
- [ ] 验证数据库及消息协议前后兼容；不可逆变更单独安排回滚策略。
- [ ] 演练回滚、监控和告警；灰度按预定阈值逐步扩大。
- [ ] 核对功能、性能、稳定性和安全门槛；未通过则暂停或回滚。
- [ ] 记录验收报告、残余风险、临时兼容参数与清理责任人。
- [ ] 建立 JDK 安全更新与依赖维护机制。

## 验收记录模板

| 项目 | JDK 8 基线 | 目标版本实测 | 阈值/预期 | 结果与证据 |
| --- | --- | --- | --- | --- |
| 功能/契约 | 待填 | 待填 | 待填 | 待填 |
| 吞吐/延迟/错误率 | 待填 | 待填 | 待填 | 待填 |
| CPU/内存/GC | 待填 | 待填 | 待填 | 待填 |
| 安全与依赖 | 待填 | 待填 | 待填 | 待填 |
| 回滚演练 | 待填 | 待填 | 待填 | 待填 |

## 官方资料
- [Oracle JDK 25 Migration Guide](https://docs.oracle.com/en/java/javase/25/migrate/index.html)
- [Migrating from JDK 8](https://docs.oracle.com/en/java/javase/25/migrate/migrating-jdk-8-later-jdk-releases.html)
- [Preparing for Migration](https://docs.oracle.com/en/java/javase/25/migrate/preparing-migration.html)
- [JDK 25 Tool Specifications](https://docs.oracle.com/en/java/javase/25/docs/specs/man/index.html)
- [Spring Boot 文档](https://docs.spring.io/spring-boot/)
- [OpenRewrite 文档](https://docs.openrewrite.org/)

命令未在真实应用执行；所有检查默认未完成，不能作为生产变更审批或实测报告。
