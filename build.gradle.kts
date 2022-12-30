import org.gradle.api.tasks.wrapper.Wrapper.DistributionType.ALL

plugins {
    kotlin("jvm") version "1.7.20" apply false
    kotlin("plugin.serialization") version "1.7.20" apply false
    id("org.jetbrains.dokka") version "1.7.20"
    id("com.github.johnrengelman.shadow") version "7.1.2" apply false
    id("org.jetbrains.compose") version "1.2.2" apply false
}

tasks.wrapper {
    version = "7.6"
    distributionType = ALL
}

dependencies {
    dokkaHtmlPlugin("org.jetbrains.dokka:kotlin-as-java-plugin:1.7.20")
}

allprojects {
    repositories {
        mavenCentral()
        gradlePluginPortal()
    }
}