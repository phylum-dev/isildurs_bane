/*
 * This file was generated by the Gradle 'init' task.
 *
 * This is a general purpose Gradle build.
 * To learn more about Gradle by exploring our Samples at https://docs.gradle.org/8.2.1/samples
 */

plugins {
    id("java")
}

group = "io.phylum"
version = "1.0.0"

repositories {
    mavenCentral()
}

dependencyLocking {
    lockAllConfigurations()
}

dependencies {
    runtimeOnly("com.google.code.gson:gson:2.10.1")
}
