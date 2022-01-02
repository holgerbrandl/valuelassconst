plugins {
    kotlin("jvm") version "1.6.10"
//    kotlin("jvm") version "1.5.31"
    application
}

group = "org.kalasim.examples"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))

    implementation(kotlin("script-runtime"))
    implementation(kotlin("reflect"))
}

tasks.test {
    useJUnitPlatform()
}
