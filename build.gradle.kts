// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {
    val agp_version by extra("8.0.1")
    repositories {
        maven {
            setUrl("/Users/rmltech/Documents/GuardSqurare/DexGuard-9.4.15/lib")
        }
        flatDir {
            dirs("libs")
        }
        dependencies {
            classpath("com.guardsquare:dexguard-gradle-plugin:+")
        }
    }
}

plugins {
    id("com.android.application") version "8.0.1" apply false
}


