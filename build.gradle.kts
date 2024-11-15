plugins {
    id("com.android.application") version "7.3.1" apply false
    id("org.jetbrains.kotlin.android") version "1.7.20" apply false
}

buildscript {
    repositories {
        google()
        mavenCentral()
        maven(url = "https://jitpack.io") // For GitHub-hosted libraries
    }
    dependencies {
        classpath("com.android.tools.build:gradle:7.3.1")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.7.20")
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
        maven(url = "https://jitpack.io")
    }
}

dependencies {
    // Replace MarkdownView with Markwon for Markdown rendering
    implementation("io.noties.markwon:core:4.6.2") // Core Markwon library for Markdown rendering
}

tasks.register<Delete>("clean") {
    delete(rootProject.buildDir)
}
