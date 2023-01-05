package live.shuuyu.sakura.build

import org.gradle.api.Project
import org.gradle.api.publish.PublishingExtension
import org.gradle.api.publish.maven.MavenPublication
import org.gradle.kotlin.dsl.*

fun Project.SakuraPublishing() {
    configure<PublishingExtension> {
        publications {
            create<MavenPublication>("main") {
                groupId = Constants.group
                from(components["kotlin"])
                version = Constants.version
                artifactId = "sakura-${project.name}"

                pom {
                    name.set(Constants.name)
                    description.set(Constants.description)

                    organization {
                        name.set("Ezelic")
                        url.set(Constants.repo)
                    }

                    issueManagement {
                        system.set("GitHub")
                        url.set(Constants.issues)
                    }

                    developers{
                        developer {
                            name.set("Yujin")
                        }
                    }

                    licenses {

                    }
                }
            }
            repositories {
                val repoUser = project.findProperty("repo_user")
                val repoPassword = project.findProperty("repo_password")
                if (repoUser != null && repoPassword != null) {
                    maven("https://maven.shuuyu.live") {
                        credentials {
                            username = repoUser.toString()
                            password = repoPassword.toString()
                        }
                    }
                }
            }
        }
    }
}
