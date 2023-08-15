// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {
    val agp_version by extra("7.4.1")
    val agp_version1 by extra("8.0.1")
    repositories {
        maven {
            setUrl("/Users/rmltech/Documents/GuardSquare/DEXGUARD-VERSI/DexGuard-9.4.15/lib")
        }
        dependencies {

            classpath("com.guardsquare:dexguard-gradle-plugin:+")
        }
    }
}

plugins {
    id("com.android.application") version "8.1.0" apply false
}

