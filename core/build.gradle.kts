import live.shuuyu.sakura.build.SakuraPublishing

plugins {
    kotlin("jvm")
    kotlin("plugin.serialization")
    id("org.jetbrains.compose")
    id("sakura-build")
    `maven-publish`
}

SakuraPublishing()

dependencies {
    api(compose.desktop.currentOs) {
        exclude(group = "org.jetbrains.compose.material")
    }
}