# 仓库组织与长期维护约定

版本：V1.0（2026-11-26）

## 目标
将聊天中的课程内容固化为可检索、可版本管理、可跨会话恢复的知识库。课程采用 12 篇、48 章的专题结构，以 JDK 8 为对照、JDK 25 为核心环境。完整课程总纲和第 1.1 节讲义属于下一批归档任务；本文件先固化组织方式。

## 目录约定（目标结构，不表示全部已创建）

```text
modern-java-learning/
├── README.md
├── AGENTS.md
├── pom.xml                         # 后续多模块实验按需建立
├── docs/
│   ├── 00-repository-guide.md
│   ├── 00-course-outline.md
│   ├── 01-learning-progress.md
│   ├── 02-version-feature-index.md
│   ├── 03-jep-index.md
│   ├── 04-api-change-index.md
│   ├── 05-migration-checklist.md
│   ├── 06-course-standards.md
│   └── CHANGELOG.md
├── part01-foundation/
│   └── chapter01-java-evolution/
│       └── lesson01-01/
│           ├── README.md
│           ├── theory.md
│           ├── examples/
│           │   ├── JavaEnvironment.java
│           │   ├── RuntimeStructure.java
│           │   └── Hello.java
│           ├── experiments.md
│           ├── exercises.md
│           ├── solutions.md
│           └── references.md
├── part02-language/
├── part03-collections-stream/
├── part04-core-api/
├── part05-modules-engineering/
├── part06-concurrency/
├── part07-jvm-gc/
├── part08-diagnostics/
├── part09-advanced-api/
├── part10-migration/
├── part11-latest-jdk/
├── part12-final-project/
├── benchmarks/
│   ├── jmh/
│   ├── gc-comparison/
│   └── concurrency-comparison/
├── preview-lab/
│   ├── jdk25/
│   ├── jdk26/
│   └── jdk27/
├── projects/
│   ├── asset-platform-jdk8/
│   └── asset-platform-jdk25/
└── scripts/
    ├── setup/
    ├── build/
    └── benchmark/
```

## 文件职责

| 文件 | 职责 |
| --- | --- |
| README.md | 项目简介、真实可用的导航、当前进度入口 |
| AGENTS.md | AI 协作与跨会话恢复规则 |
| docs/00-repository-guide.md | 仓库目录与长期维护约定 |
| docs/00-course-outline.md | 完整 12 篇 48 章课程大纲、子节及验收要求 |
| docs/01-learning-progress.md | 学习位置、实验、验收、归档状态、下一步 |
| docs/02-version-feature-index.md | JDK 版本与课程对应关系 |
| docs/03-jep-index.md | JEP 编号、版本、状态、官方出处 |
| docs/04-api-change-index.md | 新增、行为变化、废弃和移除 API |
| docs/05-migration-checklist.md | 企业项目升级检查清单 |
| docs/06-course-standards.md | 教学模板、准确性及实验要求 |
| docs/CHANGELOG.md | 课程修订与错误更正 |

## 命名与归档
- 篇章目录：partNN-topic；章节目录：chapterNN-topic；小节目录：lessonNN-NN。使用小写英文、连字符及固定编号。
- 每节 README 是入口，theory.md 保存完整理论与代码对比，examples 保存可独立运行的 Java 源文件，experiments.md 记录运行命令、环境及预期/实测结果，exercises.md 和 solutions.md 分开保存题目与答案，references.md 保存官方出处。
- 示例较多时按 jdk8-example、modern-example、tests 等子目录细分。按需建立 Maven 模块，不为尚无内容的目录添加空文件。
- 正式特性与预览特性隔离；预览实验按版本放在 preview-lab，不能让整个项目依赖 --enable-preview。
- 学习笔记和索引使用 UTF-8 Markdown；不要依赖聊天中的交互组件保存进度。
- 代码保持可复现，注明 JDK 发行版、版本、操作系统、依赖和编译命令。性能实验保存方法与实测结果，不预设性能结论。

## 长期维护流程
新会话先读取 AGENTS、总纲（存在后）、进度和教学规范，恢复课程上下文。每次讲授结束整理讲义、示例、实验、练习与参考资料，同步更新索引和进度，核对并提交。错误修订必须记录原说法、修正、来源及受影响章节。按实际验收更新学习状态，不能把讲授完成视为掌握。公开仓库禁止保存公司内部资料和凭据。

## 创建策略
当前先建立治理文档、进度和教学规范。其余文件和目录按实际归档进度建立。Git 不跟踪空目录，目录树中的规划项不代表已创建。
