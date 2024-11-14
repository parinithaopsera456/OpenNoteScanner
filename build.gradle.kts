buildscript {
    repositories {
        google()
        mavenCentral()
        maven(url = "https://jitpack.io")
        maven { url = uri("https://jcenter.bintray.com/") }
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
        maven { url = uri("https://jcenter.bintray.com/") }
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
