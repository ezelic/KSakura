import org.gradle.api.tasks.wrapper.Wrapper.DistributionType.ALL

buildscript {
    
}

plugins {
    kotlin("jvm") version "1.7.20" apply false
    kotlin("plugin.serialization") version "1.7.20" apply false
    id("com.github.johnrengelman.shadow") version "7.1.2" apply false
    id("org.jetbrains.compose") version "1.2.2" apply false
    id("sakura-build")
}

tasks.wrapper {
    version = "7.6"
    distributionType = ALL
}

allprojects {
    repositories {
        mavenCentral()
        gradlePluginPortal()
    }
}