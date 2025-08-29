plugins {
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.android.application) apply false
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}
