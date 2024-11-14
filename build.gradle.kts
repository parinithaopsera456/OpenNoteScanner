buildscript {
    repositories {
        google()
        mavenCentral() // Maven Central is important for a lot of popular libraries
        maven(url = "https://jitpack.io") // JitPack for libraries hosted on GitHub
        maven { url = uri("https://jcenter.bintray.com/") } // Deprecated, but sometimes required
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
        maven(url = "https://jitpack.io") // Make sure JitPack is included here
        maven { url = uri("https://jcenter.bintray.com/") } // Include JCenter, even though it's deprecated
    }
}

dependencies {
    // Try adding the missing dependency directly (if it's available in JitPack or Maven Central)
    implementation("us.feras.mdv:markdownview:1.1.0")
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
