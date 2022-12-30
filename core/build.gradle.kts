import live.shuuyu.common.Versioning.PUBLISHING_VERSION

plugins {
    kotlin("jvm")
    kotlin("plugin.serialization")
    id("org.jetbrains.compose")
    `maven-publish`
}

dependencies {
    api(compose.desktop.currentOs) {
        exclude(group = "org.jetbrains.compose.material")
    }
}

publishing {
    publications {
        create<MavenPublication>("main") {
            from(components["kotlin"])
            artifactId = "live.shuuyu.sakura.core"
            version = PUBLISHING_VERSION
        }
    }
}