# KSakura Core
An implementation of crucial UI components used throughout other projects.

## Example Usage
```kotlin
fun main() = application {
    val state = rememberWindowState(
        placement = WindowPlacement.Floating,
        position = WindowPosition.Aligned(Alignment.Center),
        size = DpSize(1020.dp, 640.dp)
    )
    
    SakuraWindow(
        title = "Example",
        state = state,
        onCloseRequest = { this.exitApplication() }
    ) {
        // Any of your components can get imported into here.
    }
}
```

## Installation
Replace any mention of ``${version}`` with the latest build version or latest stable version. 

### Gradle (Kotlin)
```kotlin
repositories {
    
}

dependencies {
    implementation("live.shuuyu.sakura:core1")
}
```