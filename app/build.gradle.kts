plugins {
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.android.application)
}

kotlin {
    jvmToolchain(17)
}

android {
    namespace = "com.example.app"

    compileSdk = 36

    defaultConfig {
        applicationId = "com.example.app"

        minSdk = 28
        targetSdk = 36

        versionCode = 1
        versionName = "1.0.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = true
            proguardFiles(getDefaultProguardFile("proguard-android.txt"))
        }
    }
}