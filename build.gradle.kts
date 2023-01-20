import org.gradle.api.tasks.wrapper.Wrapper.DistributionType.ALL

buildscript {
    
}

plugins {
    kotlin("jvm") version "1.8.0" apply false
    kotlin("plugin.serialization") version "1.8.0" apply false
    id("com.github.johnrengelman.shadow") version "7.1.2" apply false
    id("org.jetbrains.compose") version "1.3.0-rc04" apply false
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
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }
}