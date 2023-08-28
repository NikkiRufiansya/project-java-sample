// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {
    val agp_version by extra("7.4.1")
    val agp_version1 by extra("8.0.1")
    repositories {
        maven {
            credentials  {
                username = "maven"
                password = "JmJMiWmU4snKh6zbLqT8mGlXIAcpDB5SSPv35gQP3IqpcJgY7iNci5EWEtsMz4hL846VIaa8i9mq8s4J2V9zB7NBD4jpHAPHDIIYPMrrmK8xDnclNch4iiwQ5zYB2geB"
            }
            url = uri("https://maven.guardsquare.com")
            // Only search for artifacts with groupId "com.guardsquare.*".
            // Supported since gradle 5.1.
            content {
                includeGroupByRegex("com\\.guardsquare.*")
            }
            authentication {
                create<BasicAuthentication>("basic")
            }
        }
    }

    dependencies {
        classpath("com.guardsquare:dexguard-gradle-plugin:+")

    }
}

plugins {
    id("com.android.application") version "8.1.0" apply false

}

