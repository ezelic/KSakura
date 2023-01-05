package live.shuuyu.sakura.build

object Constants {
    const val name = "sakura"
    const val group = "live.shuuyu.sakura"
    const val version = "0.0.1"
    const val description = "A stylish and complete JetBrains Compose library."
    const val repo = "https://github.com/ezelic/Ksakura"
    const val issues = "https://github.com/ezelic/Ksakura/issues"

    val isSnapshot: Boolean get() = version.endsWith("-SNAPSHOT")
}