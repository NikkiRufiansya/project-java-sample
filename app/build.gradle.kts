plugins {
    id("com.android.application")
    id("dexguard")
}

android {
    namespace = "com.sourcey.materiallogindemo"
    compileSdk = 33

    signingConfigs {
        create("release"){
            storeFile = file("/Users/rmltech/Documents/keystore/project-java-sample")
            storePassword = "123456"
            keyAlias = "project-java-sample"
            keyPassword = "123456"
        }
    }


    defaultConfig {
        applicationId = "com.sourcey.materiallogindemo"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }



    buildTypes {

        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
            signingConfig = signingConfigs.getByName("release")
        }

    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}

dexguard {
    path = "/Users/rmltech/Documents/GuardSqurare/DexGuard-9.4.14"
    license = "/Users/rmltech/Documents/GuardSqurare/dexguard-license.txt"
    configurations {
        register("release") {
            defaultConfiguration("dexguard-release.pro")
            configuration("dexguard-project.txt")
            defaultConfiguration("dexguard-rasp.pro")
        }
        register("debug") {
            defaultConfiguration("dexguard-debug.pro")
            configuration("dexguard-project.txt")
            defaultConfiguration("dexguard-rasp.pro")
        }
    }


}