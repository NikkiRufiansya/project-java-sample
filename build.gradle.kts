// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {
    val agp_version by extra("7.4.1")
    repositories {
        maven {
            setUrl("/Users/rmltech/Documents/GuardSqurare/DexGuard-9.4.14/lib")
        }
        dependencies {

            classpath("com.guardsquare:dexguard-gradle-plugin:+")
        }
    }
}

plugins {
    id("com.android.application") version "8.1.0" apply false
}

