# 课后练习

选择题 8 道，每题 12.5 分；至少 7/8 正确达到 80 分门槛。先独立作答。

1. OpenJDK 主要是什么？
   - A. Oracle 专属商业 JDK
   - B. Java 平台开放实现的项目和社区
   - C. Java 语言规范本身
   - D. 仅 JVM 的安装包
2. Oracle JDK 与 Oracle OpenJDK 的区别？
   - A. 两者始终使用同一种许可证
   - B. Oracle OpenJDK 不由 Oracle 提供
   - C. 共同技术基础，但发行授权和更新策略不同
   - D. Oracle JDK 与 OpenJDK 无任何关系
3. 普通独立 Java 业务应用调用适用 Classpath Exception 的标准类库，是否仅因此必须公开业务源码？
   - A. 必须
   - B. 不必须
4. 2026-10-20 发布的 Oracle JDK 21.0.13 采用哪种授权？
   - A. GPLv3
   - B. NFTC
   - C. OTN
   - D. MIT
5. 某企业使用 Temurin 21，Oracle JDK 21 新更新转入 OTN 会直接改变其 Temurin 授权吗？
   - A. 会
   - B. 不会
6. TCK 主要验证什么？
   - A. 业务系统 P99 性能
   - B. 企业许可证合规
   - C. Java SE 规范兼容性
   - D. 所有 GC 参数一致
7. 免费下载和使用 JDK，是否意味着一定提供免费商业 SLA？
   - A. 是
   - B. 否
8. 企业更换同主版本 JDK 发行版的合理方式？
   - A. 直接替换全部生产服务
   - B. 只比较 java.version
   - C. 盘点来源与依赖、核对许可和支持、回归测试后灰度
   - D. 选择收费版本就不需要测试

## 思考题

1. 公司内部服务使用 Oracle JDK 21.0.12，运维计划升级 21.0.13。说明授权变化、安全风险和可选方案；如何判断是否需要商业授权？
2. 一家企业有使用 Oracle JDK 8 的 Spring Boot/MyBatis 微服务，计划迁移至 Temurin。为什么同主版本替换与主版本升级应区分？列出至少四项测试内容。
3. 公司开发收费 Java 软件，并希望随安装包分发定制运行时。GPLv2+CPE OpenJDK 与 NFTC Oracle JDK 分别需要注意什么？业务源码是否仅因调用标准 API 必须公开？

回答用自己的话，先给结论再给理由。第 1.6 节会深入许可证审查。
