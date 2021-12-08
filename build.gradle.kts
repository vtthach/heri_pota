import org.jetbrains.compose.compose
import org.jetbrains.compose.desktop.application.dsl.TargetFormat
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    val kotlinVersion = "1.5.21"
    kotlin("jvm") version kotlinVersion
    id("org.jetbrains.compose") version "1.0.0-alpha3"
    kotlin("plugin.serialization") version kotlinVersion
    kotlin("kapt") version kotlinVersion
}

group = "me.stavroxhardha"
version = "1.0"

repositories {
    google()
    mavenCentral()
    maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
}

dependencies {
    implementation(compose.desktop.currentOs)
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.3.1")
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.jakewharton.retrofit:retrofit2-kotlinx-serialization-converter:0.8.0")
    implementation("com.google.dagger:dagger:2.40.3")
    implementation("com.squareup.okhttp3:logging-interceptor:4.9.3")

    kapt("com.google.dagger:dagger-compiler:2.40.3")
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "13"
}

compose.desktop {
    application {
        mainClass = "MainKt"
        nativeDistributions {
            targetFormats(TargetFormat.Dmg, TargetFormat.Msi, TargetFormat.Deb)
            packageName = "Hari Pota"
            packageVersion = "1.0.0"
        }
    }
}