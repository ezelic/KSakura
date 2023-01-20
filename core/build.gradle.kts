import live.shuuyu.sakura.build.SakuraPublishing

plugins {
    kotlin("jvm")
    kotlin("plugin.serialization")
    id("org.jetbrains.compose")
    id("sakura-build")
    `maven-publish`
}

description = "Core components of Sakura for Compose.w"

SakuraPublishing()

dependencies {
    api(compose.desktop.currentOs) {
        exclude(group = "org.jetbrains.compose.material")
    }
}